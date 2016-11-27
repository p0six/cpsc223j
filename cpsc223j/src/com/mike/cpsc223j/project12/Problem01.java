package com.mike.cpsc223j.project12;

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

/*
 * Name			Michael Romero
 * Project No.	No.12 part 1
 * Due Date		Dec 1, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This Applet is a shopping cart for a shoe store. ItemListener updates 
 * 				images when list selection changes.
 * 
 */

public class Problem01 extends Applet implements ActionListener, ItemListener {
	private static final long serialVersionUID = 1L;
	
	Label
		lshoesOnSale = new Label("Shoe's on sale"),
		lchooseReturn = new Label("choose/return"),
		lyourShoppingCart = new Label("Your Shopping Cart"),
		lreport = new Label("Report"),
		lmacys = new Label("Macy's Department Store");

	List shoes = new List(7, false),  // true for Multiple Selections, we want single
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

	String[] shoeNames = {"Vans Low Tops", "Vans Old Skool", "Converse All Stars","Puma Suede",
			"Doc Martens","Timbaland Boots","Adidas Shell Toes"};
	String[] shoeFiles = {"vansAuthentic.png", "vansOldSkool.png","allstars.png","pumas.png",
			"docs.png","tims.png","shelltoes.png"};
	
	
	public void init() {
		// Defaults
		setLayout(null);
		this.setSize(600, 400);
		
		// Labels
		lmacys.setBounds(250, 10, 180, 20); this.add(lmacys);
		lshoesOnSale.setBounds(10, 30, 100, 20); this.add(lshoesOnSale);
		lchooseReturn.setBounds(250, 30, 100, 20); this.add(lchooseReturn);
		lyourShoppingCart.setBounds(400 ,30, 140, 20); this.add(lyourShoppingCart);
		lreport.setBounds(400, 200, 100, 20); this.add(lreport);
		
		// Lists
		shoes.setBounds(10, 50, 180, 300); this.add(shoes);
				
		Double[] shoePrices = {50.00, 55.00, 45.00, 49.99, 109.99, 100.50, 55.50 };
		for (int i = 0; i < shoes.getRows(); i++) {
			shoes.add(shoeNames[i] + "\t$" + shoePrices[i].toString());
		}
		shoppingCart.setBounds(380, 50, 200, 140); this.add(shoppingCart);

		// TextAreas
		shoppingReport.setBounds(380, 220, 200, 140); this.add(shoppingReport);
		
		// Radio Buttons
		opRed.setBounds(190, 300, 55, 20); this.add(opRed);
		opBlack.setBounds(240, 300, 65, 20); this.add(opBlack);
		opBrown.setBounds(300, 300, 70, 20); this.add(opBrown);
		
		// Buttons
		badd.setBounds(240, 50, 40, 20); this.add(badd);
		bremove.setBounds(320, 50, 40, 20); this.add(bremove);
		bsubmit.setBounds(220, 340, 140, 20); this.add(bsubmit);
			
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
				String[] itemSplit = shoppingCart.getItem(i).split("\t\\$");
				String[] priceSplit = itemSplit[1].split("\t");
				double price = Double.parseDouble(priceSplit[0]);
				total += price;
				shoppingReport.append(itemSplit[0] + "\t$" + price + "\n");
			}
			shoppingCart.removeAll();
			shoppingReport.append("Total Bill\t$" + total + "\n");
		}
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == shoes) {
			ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("com//mike//cpsc223j//project12//" + shoeFiles[shoes.getSelectedIndex()]));
			shoePic = icon.getImage();
			repaint();
		}
	}

	public void paint(Graphics g) {
		g.drawImage(shoePic, 240, 80, 100, 100, this);
	}
}