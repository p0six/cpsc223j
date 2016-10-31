package com.mike.cpsc223j.project10;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Name			Michael Romero
 * Project No.	No.10 part 2
 * Due Date		Nov 3, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This is a calculator applet.
 */

public class Calculator extends Applet implements ActionListener {
	private static final long serialVersionUID = 1L;
	String op = new String();

	Button
		oneBtn = new Button("1"),
		twoBtn = new Button("2"),
		threeBtn = new Button("3"),
		fourBtn = new Button("4"),
		fiveBtn = new Button("5"),
		sixBtn = new Button("6"),
		sevenBtn = new Button("7"),
		eightBtn = new Button("8"),
		nineBtn = new Button("9"),
		zeroBtn = new Button("0"),
		addBtn = new Button("+"),
		minBtn = new Button("-"),
		multBtn = new Button("*"),
		divBtn = new Button("/"),
		factBtn = new Button("n!"),
		eqBtn = new Button("="),
		clearBtn = new Button("CLEAR"),
		negPosBtn = new Button("+/-");
	
	TextField txtWin = new TextField();
	String n = "", n1st, n2st;
	double n1, n2;
	
	public void init() {
		this.setLayout(null);
		Dimension d = new Dimension();
		d.setSize(250, 280);
		this.setSize(d);
		
		txtWin.setFocusable(true); 
		txtWin.setBounds(10,10,230,30); add(txtWin);
				
		sevenBtn.setBounds(10,40,50,40); add(sevenBtn);
		eightBtn.setBounds(70,40,50,40); add(eightBtn);
		nineBtn.setBounds(130,40,50,40); add(nineBtn);
		addBtn.setBounds(190,40,50,40); add(addBtn);
		fourBtn.setBounds(10,90,50,40); add(fourBtn);
		fiveBtn.setBounds(70,90,50,40); add(fiveBtn);
		sixBtn.setBounds(130,90,50,40); add(sixBtn);
		minBtn.setBounds(190,90,50,40); add(minBtn);
		oneBtn.setBounds(10,140,50,40); add(oneBtn);
		twoBtn.setBounds(70,140,50,40); add(twoBtn);
		threeBtn.setBounds(130,140,50,40); add(threeBtn);
		multBtn.setBounds(190,140,50,40); add(multBtn);
		zeroBtn.setBounds(10,190,50,40); add(zeroBtn);
		eqBtn.setBounds(70,190,110,40); add(eqBtn);
		divBtn.setBounds(190,190,50,40); add(divBtn);
		negPosBtn.setBounds(10, 240, 50, 40); add(negPosBtn);
		clearBtn.setBounds(70,240,110,40); add(clearBtn);
		factBtn.setBounds(190, 240, 50, 40); add(factBtn);
		
		oneBtn.addActionListener(this);
		twoBtn.addActionListener(this);
		threeBtn.addActionListener(this);
		fourBtn.addActionListener(this);
		fiveBtn.addActionListener(this);
		sixBtn.addActionListener(this);
		sevenBtn.addActionListener(this);
		eightBtn.addActionListener(this);
		nineBtn.addActionListener(this);
		zeroBtn.addActionListener(this);
		addBtn.addActionListener(this);
		minBtn.addActionListener(this);
		multBtn.addActionListener(this);
		divBtn.addActionListener(this);
		factBtn.addActionListener(this);
		negPosBtn.addActionListener(this);
		eqBtn.addActionListener(this);
		clearBtn.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == oneBtn) {
			n += "1"; txtWin.setText(n);
		} else if (e.getSource() == twoBtn) {
			n += "2"; txtWin.setText(n);
		} else if (e.getSource() == threeBtn) {
			n += "3"; txtWin.setText(n);
		} else if (e.getSource() == fourBtn) {
			n += "4"; txtWin.setText(n);
		} else if (e.getSource() == fiveBtn) {
			n += "5"; txtWin.setText(n);
		} else if (e.getSource() == sixBtn) {
			n += "6"; txtWin.setText(n);
		} else if (e.getSource() == sevenBtn) {
			n += "7"; txtWin.setText(n);
		} else if (e.getSource() == eightBtn) {
			n += "8"; txtWin.setText(n);
		} else if (e.getSource() == nineBtn) {
			n += "9"; txtWin.setText(n);
		} else if (e.getSource() == zeroBtn) {
			n += "0"; txtWin.setText(n);
		} else if (e.getSource() == addBtn) {
			n = txtWin.getText().trim();
			n1 = Double.parseDouble(n); 
			n = ""; 
			txtWin.setText(" ");
			op = "+";
		} else if (e.getSource() == minBtn) {
			n = txtWin.getText().trim();
			n1 = Double.parseDouble(n); 
			n = ""; 
			txtWin.setText(" ");
			op = "-";
		} else if (e.getSource() == multBtn) {
			n = txtWin.getText().trim();
			n1 = Double.parseDouble(n); 
			n = ""; 
			txtWin.setText(" ");
			op = "*";
		} else if (e.getSource() == divBtn) {
			n = txtWin.getText().trim();
			n1 = Double.parseDouble(n); 
			n = ""; 
			txtWin.setText(" ");
			op = "/";
		} else if (e.getSource() == factBtn) {
			n = txtWin.getText().trim();
			n1 = Double.parseDouble(n); 
			n = ""; 
			double x = n1;
			while (n1 != 1) {
				n1--;
				x *= n1;
			}
			txtWin.setText(Double.toString(x));
			n1 = x;
			op = "!";
		} else if (e.getSource() == negPosBtn) {
			op = "n";
			n = txtWin.getText().trim();
			n1 = Double.parseDouble(n); 
			n = ""; 
			n1 = 0 - n1;
			txtWin.setText(Double.toString(n1));
		} else if (e.getSource() == eqBtn) {
			n = txtWin.getText().trim();
			n2 = Double.parseDouble(n); 
			n = "";
			n1st = Double.toString(n1);
			n2st = Double.toString(n2);	
			txtWin.setText(Double.toString(mathFunction(n1, n2, op)));
		} else {
			txtWin.setText("");;
			n = "";
			txtWin.requestFocus();
		}
	}
	
	public double mathFunction(double x, double y, String z) {
		if (op == "+") {
			return x + y;
		} else if (op == "-") {
			return x - y;
		} else if (op == "*") {
			return x * y;
		} else if (op == "/") {
			return x / y;
		}
		return 0.0;
	}
}