package com.mike.cpsc223j.quiz;

/*
 * Name			Michael Romero
 * Quiz No.	4	Problem 1
 * Due Date		Dec 15, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This is a shopping cart Applet for Domino's Pizza
 */

import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.List;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Calendar;

import javax.swing.ImageIcon;

public class Quiz04Class01 extends Applet implements ActionListener, ItemListener {
	private static final long serialVersionUID = 1L;
	
	Calendar c = Calendar.getInstance();
	int day = c.get(Calendar.DATE);
	int month = c.get(Calendar.MONTH) + 1;
	int year = c.get(Calendar.YEAR);
	
	int imageIndex = 0;
	
	// Pizza Data
	String[] pizzaImages = {"cheesePizza.jpg","extravaganza.jpg","pacificVeggie.jpg" };
	String[] pizzaStrings = {"Cheese", "Extravaganza", "Pacific Veggie" };
	double[] pizzaCosts = { 7.00, 9.00, 9.50 };
	
	// Crust Data
	String[] crustStrings = {"Hand Tossed", "Thin", "Deep Dish" };
	double[] crustCosts = { 0.50, 0, 1.00 };
	
	// Size Data
	double[] sizeCosts = {1, 2, 3};

	Label ldominos = new Label("Domino's Pizza"),
			ltodaysDate = new Label("Today's Date: " + month + "/" + day + "/" + year),
			lchoosePizza = new Label("Choose your Pizza (" + pizzaStrings[imageIndex % pizzaStrings.length] + " $" + pizzaCosts[imageIndex % pizzaStrings.length] + ")"),
			lselectCrust = new Label("Select the Crust ($" + crustCosts[0] + " extra)"),
			lselectSize = new Label("Select Size ($1.00, $2.00, $3.00 extra)"),
			lnumPizzas = new Label("Number of Pizzas"),
			lyourName = new Label("Your name"),
			lphoneNum = new Label("Phone number");
	
	Button bOrder = new Button("Click to Order"),
			bleft = new Button("<<<"),
			bright = new Button(">>>"),
			bnext = new Button("Next");
	
	TextField tfname = new TextField(null, 30),
			tfphoneNum = new TextField(null,30),
			tfpizzaType = new TextField(Integer.toString(imageIndex + 1), 6);
	
	TextArea tasummary = new TextArea(null, 5, 45),
			tacart = new TextArea(null, 100, 100);
	
	CheckboxGroup cbgPizzaSize = new CheckboxGroup();
	
	Checkbox cbten = new Checkbox("10\"", cbgPizzaSize, true),
			cbtwelve = new Checkbox("12\"", cbgPizzaSize, false),
			cbfourteen = new Checkbox("14\"", cbgPizzaSize, false);
	
	Choice chnumPizza = new Choice(),
			chselectCrust = new Choice();
	
	List licart = new List();
	
	Image ipizza;
		
	public void init() {
		// some defaults
		setLayout(null);
		setSize(600,600);
		
		// we don't want users able to update this field
		tfpizzaType.setEditable(false);
		
		// initialize our lists
		for (int i = 0; i < 10; i++) { // initialize list of pizza amounts
			chnumPizza.add(Integer.toString(i+1));
		}	
		for (int i = 0; i < crustCosts.length; i++) {
			chselectCrust.add(crustStrings[i]);
		}

		// our lone pizza image
		ipizza = new ImageIcon(getClass().getResource(pizzaImages[imageIndex])).getImage();		
		
		// setBounds(x,y,width,height), and add
		ldominos.setBounds(240,10,140,20); add(ldominos);
		ltodaysDate.setBounds(210,40,240,20); add(ltodaysDate);
		lchoosePizza.setBounds(100, 70, 340, 20); add(lchoosePizza);
		lselectCrust.setBounds(20, 240, 200, 20); add(lselectCrust);
		lselectSize.setBounds(260, 240, 240, 20); add(lselectSize);
		bnext.setBounds(10, 100, 40, 20); add(bnext);
		bright.setBounds(130, 130, 40, 20); add(bright);
		tfpizzaType.setBounds(130, 170, 40, 20); add(tfpizzaType);
		bleft.setBounds(130, 210 ,40, 20); add(bleft);
		licart.setBounds(200, 130, 380, 100); add(licart);
		chselectCrust.setBounds(10, 270, 140, 20); add(chselectCrust);
		cbten.setBounds(260, 270, 70, 20); add(cbten);
		cbtwelve.setBounds(330, 270, 70, 20); add(cbtwelve);
		cbfourteen.setBounds(400, 270, 70, 20); add(cbfourteen);
		
		lnumPizzas.setBounds(20, 300, 140, 20); add(lnumPizzas);
		chnumPizza.setBounds(10, 330, 60, 20); add(chnumPizza);
		lyourName.setBounds(200, 300, 140, 20); add(lyourName);
		lphoneNum.setBounds(380, 300,140,20); add(lphoneNum);
		tfname.setBounds(200, 330, 140, 20); add(tfname);
		tfphoneNum.setBounds(380, 330, 140, 20); add(tfphoneNum);
		bOrder.setBounds(10, 360, 580, 20); add(bOrder);
		tasummary.setBounds(10, 400, 580, 195); add(tasummary);
		
		// some listeners
		bOrder.addActionListener(this);
		bleft.addActionListener(this);
		bright.addActionListener(this);
		bnext.addActionListener(this);	
		chselectCrust.addItemListener(this);
		chnumPizza.addItemListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bnext) { // next image
			imageIndex = (imageIndex + 1) % pizzaImages.length;
			tfpizzaType.setText(Integer.toString(imageIndex + 1));
			lchoosePizza.setText("Choose your Pizza (" + pizzaStrings[imageIndex] + " $" + pizzaCosts[imageIndex] + ")");
			ipizza = new ImageIcon(getClass().getResource(pizzaImages[imageIndex])).getImage();
			repaint();	
		} else if (e.getSource() == bright) { // need to figure out how to process individual entries
			// add selected pizza to the cart..
			String pizzaType = pizzaStrings[imageIndex];
			String pizzaSize = cbgPizzaSize.getSelectedCheckbox().getLabel();
			String crustType = crustStrings[chselectCrust.getSelectedIndex()];
			double sizeCost = 0;
			int numPizzas = chnumPizza.getSelectedIndex() + 1;
			if (cbgPizzaSize.getSelectedCheckbox().getLabel() == "10\"") {
				sizeCost = 1;
			} else if (cbgPizzaSize.getSelectedCheckbox().getLabel() == "12\"") {
				sizeCost = 2;
			} else {
				sizeCost = 3;
			}
			double pizzaCost = pizzaCosts[imageIndex] + crustCosts[chselectCrust.getSelectedIndex()] + sizeCost; // size
			licart.add(numPizzas + "," + pizzaSize + "," + crustType + "," + pizzaType + "," + "$" + (pizzaCost*numPizzas));
		} else if (e.getSource() == bleft) { // add to cart	
			licart.remove(licart.getSelectedIndex());
		} else { // place order
			tasummary.setText(null);
			tasummary.append(tfname.getText() + "," + tfphoneNum.getText() + "\n");
			double total = 0, totalPizzaCount = 0;
			for (int i = 0; i < licart.getItemCount(); i++) {
				String[] itemData = licart.getItem(i).split(",");
				tasummary.append(itemData[0] + "x " + itemData[3] + ":\t" + itemData[4] + "\n");
				tasummary.append("\tCrust:\t" + itemData[2] + "\n");
				tasummary.append("\tSize:\t" + itemData[1] + "\n\n");
				total += Double.parseDouble(itemData[4].substring(1, itemData[4].length()));
				totalPizzaCount += Integer.parseInt(itemData[0]);
			}
			tasummary.append("Total # Of Pizza's: " + totalPizzaCount + "\n");
			tasummary.append("Total $" + total);
			licart.removeAll();
		}
	}
	
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == chselectCrust) {
			lselectCrust.setText("Select the Crust ($" + crustCosts[chselectCrust.getSelectedIndex()] + " extra)");
		} 
	}
	
	public void paint(Graphics g) {
		g.drawImage(ipizza, 10, 130, 100, 100, this);
	}
}