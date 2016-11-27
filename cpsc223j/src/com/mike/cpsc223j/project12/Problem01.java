package com.mike.cpsc223j.project12;

/*
 * Name			Michael Romero
 * Project No.	No.12 part 1
 * Due Date		Dec 1, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This Applet is a shopping cart for a shoe store. ItemListener updates 
 * 				images when list selection changes.
 */

import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.List;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;

public class Problem01 extends Applet implements ActionListener, ItemListener {
	private static final long serialVersionUID = 1L;
	
	// Our shoe meta-data
	Double[] shoePrices = {50.00, 55.00, 45.00, 49.99, 109.99, 100.50, 55.50 };
	String[] shoeNames = {"Vans Low Tops", "Vans Old Skool", "Converse All Stars","Puma Suede",
			"Doc Martens","Timbaland Boots","Adidas Shell Toes"};
	String[] shoeFiles = {"vansAuthentic.png", "vansOldSkool.png","allstars.png","pumas.png",
			"docs.png","tims.png","shelltoes.png"};
	
	Label
		lshoesOnSale = new Label("Shoe's on sale"),
		lchooseReturn = new Label("choose/return"),
		lyourShoppingCart = new Label("Your Shopping Cart"),
		lreport = new Label("Report"),
		lmacys = new Label("Macy's Department Store");

	List shoes = new List(7, false),  // false for single selection, allows for image change effect
		shoppingCart = new List(7, false);

	CheckboxGroup color = new CheckboxGroup();
	Checkbox opRed = new Checkbox("Red", color, true),
			opBlack = new Checkbox("Black", color, false),
			opBrown = new Checkbox("Brown", color, false);
	
	TextArea shoppingReport = new TextArea(null, 7, 40);
	
	Button badd = new Button(">>>"),
			bremove = new Button("<<<"),
			bsubmit = new Button("Issue Report");
	
	Image shoePic;

	public void init() {
		// Defaults
		setLayout(null);
		this.setSize(600, 400);
		
		// populate shoes list
		for (int i = 0; i < shoes.getRows(); i++) {
			shoes.add(shoeNames[i] + "\t$" + shoePrices[i].toString());
		}
		
		// setBounds(x, y, width, height), and add - this is the most annoying part
		lmacys.setBounds(250, 10, 180, 20); this.add(lmacys);
		lshoesOnSale.setBounds(10, 30, 100, 20); this.add(lshoesOnSale);
		lchooseReturn.setBounds(250, 30, 100, 20); this.add(lchooseReturn);
		lyourShoppingCart.setBounds(400 ,30, 140, 20); this.add(lyourShoppingCart);
		lreport.setBounds(400, 200, 100, 20); this.add(lreport);
		shoes.setBounds(10, 50, 180, 300); this.add(shoes);
		shoppingCart.setBounds(380, 50, 200, 140); this.add(shoppingCart);
		shoppingReport.setBounds(380, 220, 200, 140); this.add(shoppingReport);
		opRed.setBounds(190, 300, 55, 20); this.add(opRed);
		opBlack.setBounds(240, 300, 65, 20); this.add(opBlack);
		opBrown.setBounds(300, 300, 70, 20); this.add(opBrown);		
		badd.setBounds(240, 50, 40, 20); this.add(badd);
		bremove.setBounds(320, 50, 40, 20); this.add(bremove);
		bsubmit.setBounds(220, 340, 140, 20); this.add(bsubmit);
		
		// listeners
		badd.addActionListener(this);
		bremove.addActionListener(this);
		bsubmit.addActionListener(this);
		shoes.addItemListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == badd) {
			String[] itemSplit = shoes.getSelectedItem().split("\t\\$");
			String shoeName = itemSplit[0];
			Double shoePrice = Double.parseDouble(itemSplit[1]);
			String shoeColor = color.getSelectedCheckbox().getLabel();
			shoppingCart.add(shoeName + "\t" + "$" + shoePrice.toString() + "\t" + shoeColor);
		} else if (e.getSource() == bremove) {
			shoppingCart.remove(shoppingCart.getSelectedIndex());			
		} else {
			double total = 0;
			shoppingReport.setText(null);
			for (int i = 0; i < shoppingCart.getItemCount(); i++ ) {
				double price = Double.parseDouble(shoppingCart.getItem(i).split("\t\\$")[1].split("\t")[0]);
				shoppingReport.append(shoppingCart.getItem(i).split("\t\\$")[0] + "\t$" + price + "\n");
				total += price;
			}
			shoppingReport.append("Total Bill\t$" + total + "\n"); 
			shoppingCart.removeAll();			
		}
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == shoes) {
			shoePic = new ImageIcon(getClass().getResource(shoeFiles[shoes.getSelectedIndex()])).getImage();
			repaint();
		}
	}

	public void paint(Graphics g) {
		g.drawImage(shoePic, 240, 80, 100, 100, this);
	}
}