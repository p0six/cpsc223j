package com.mike.cpsc223j.project10;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Name			Michael Romero
 * Project No.	No.10 part I
 * Due Date		Nov 3, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This is a nite club check-in applet. 
 */

public class NiteClubCheckIn extends Applet implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	Label
		lblName = new Label("Name"),
		lblAddress = new Label("Address"),
		lblPhoneNum = new Label("Phone Number"),
		lblListOfGuests = new Label("List of guests in the club");
	TextField
		txtName = new TextField(20),
		txtAddress = new TextField(20),
		txtPhoneNum = new TextField(20);
	Button
		btnAdd = new Button("Add to the list");
	TextArea
		txtaReport = new TextArea(null, 12,180,TextArea.SCROLLBARS_BOTH);

	public void init() {
		setLayout(null);
		setSize(400,400);
		lblName.setBounds(10,50,70,20); add(lblName);
		txtName.setBounds(90,50,150,20); add(txtName);
		lblAddress.setBounds(10,80,70,20); add(lblAddress);
		txtAddress.setBounds(90,80,150,20); add(txtAddress);
		lblPhoneNum.setBounds(10,110,70,20); add(lblPhoneNum);
		txtPhoneNum.setBounds(90,110,150,20); add(txtPhoneNum);
		btnAdd.setBounds(10,140,170,20); add(btnAdd);
		lblListOfGuests.setBounds(100,170,180,20); add(lblListOfGuests);
		txtaReport.setBounds(10,200,380,120); add(txtaReport);
		btnAdd.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		String line, strName, strAddress, strPhoneNum;
		strName = txtName.getText();
		strAddress = txtAddress.getText();
		strPhoneNum = txtPhoneNum.getText();
		line = strName + " " + strAddress + " " + strPhoneNum;
		txtaReport.append(line + "\n");
		txtName.setText("");
		txtAddress.setText("");
		txtPhoneNum.setText("");
		txtName.requestFocus();
	}
}