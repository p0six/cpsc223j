package com.mike.cpsc223j.project11;
import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Label;
import java.awt.List;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

/*
 * Name			Michael Romero
 * Project No.	No.11 part 1
 * Due Date		Nov 10, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This is an applet for booking travel. We use an ActionListener for the button, and
 * 				an AdjustmentListener for the scrollbar.  We're using List boxes, fonts, and other 
 * 				applet components. 
 */

public class ChipTicketsAgency extends Applet implements ActionListener, AdjustmentListener {
	private static final long serialVersionUID = 1L;

	Label
		ldepart = new Label("Depart"),
		larrive = new Label("Arrive"),
		lcaone = new Label("City/Airport"),
		lcatwo = new Label("City/Airport"),
		lnumtix = new Label("Number of tickets"),
		ltypetix = new Label("Type of Tickets"),
		lconf = new Label("Confirmation"),
		lname = new Label("Name"),
		lphone = new Label("Phone No"),
		lchip = new Label("Chip Tickets Agency");
	
	TextField
		tname = new TextField(),
		tphone = new TextField(),
		ttix = new TextField();
	
	CheckboxGroup cbgtix = new CheckboxGroup();
	
	Checkbox
		firstClass = new Checkbox("First Class", cbgtix, true),
		economyClass = new Checkbox("Economy Class", cbgtix, false),
		businessClass = new Checkbox("Business Class", cbgtix, false);
	
	List
		depart = new List(),
		arrive = new List();
	
	String[] airports = {"LAX", "Ontario", "Fullerton", "John Wayne", "La Verne", 
						"New York", "Paris", "London", "Las Vegas", "Hawaii", "Dallas" };
	
	Scrollbar snumtix = new Scrollbar(Scrollbar.HORIZONTAL,1,1,1,11);
	
	Button bpurchase = new Button("Buy Ticket(s)");	
	
	TextArea tconfirm = new TextArea(null,10,30);

	Font 
		fheader = new Font("Times New Roman", Font.BOLD, 24),
		flabel = new Font("Times New Roman", Font.BOLD, 16),
		fnormtext = new Font("Times New Roman", Font.PLAIN, 12),
		foption = new Font("Times New Roman", Font.PLAIN, 13);
	
	FontMetrics 
		fmh = lchip.getFontMetrics(fheader),
		fml = ldepart.getFontMetrics(flabel),
		fmo = lphone.getFontMetrics(foption),
		fmn = lphone.getFontMetrics(fnormtext); // let's see if reusing the same label causes drama

	public void init() {
		setLayout(null);
		setSize(400,500);
		setFont(fnormtext);

		// set a bunch of fonts
		lchip.setFont(fheader);
		ldepart.setFont(flabel); 
		larrive.setFont(flabel);
		lcaone.setFont(flabel);
		lcatwo.setFont(flabel);
		lnumtix.setFont(flabel);
		ltypetix.setFont(flabel);
		lconf.setFont(flabel);
		lname.setFont(flabel);
		lphone.setFont(flabel);
		firstClass.setFont(foption); 
		economyClass.setFont(foption); 
		businessClass.setFont(foption); 
		
		// set boundaries and add elements. 
		lchip.setBounds(getWidth()/2 - fmh.stringWidth(lchip.getText())/2, 20, fmh.stringWidth(lchip.getText()), fmh.getHeight()); add(lchip);		
		ldepart.setBounds(23, 60, fml.stringWidth(ldepart.getText()), fml.getHeight()); add(ldepart);
		larrive.setBounds(133, 60, fml.stringWidth(larrive.getText()), fml.getHeight()); add(larrive);
		lcaone.setBounds(10, 90, fml.stringWidth(lcaone.getText()), fml.getHeight()); add(lcaone);
		lcatwo.setBounds(120, 90, fml.stringWidth(lcatwo.getText()), fml.getHeight()); add(lcatwo);
		lnumtix.setBounds(10, 250, fml.stringWidth(lnumtix.getText()), fml.getHeight()); add(lnumtix);
		ltypetix.setBounds(10, 285, fml.stringWidth(ltypetix.getText()), fml.getHeight()); add(ltypetix);
		lconf.setBounds(200, 285, fml.stringWidth(lconf.getText()), fml.getHeight()); add(lconf);
		lname.setBounds(280, 100, fml.stringWidth(lname.getText()), fml.getHeight()); add(lname);
		lphone.setBounds(280, 150, fml.stringWidth(lphone.getText()), fml.getHeight()); add(lphone);
		tname.setBounds(280, 120, 100, 20); add(tname);
		tphone.setBounds(280, 170, 100, 20); add(tphone);
		ttix.setBounds(350, 250, 30, 20); add(ttix);
		depart.setBounds(10, 120, 80, 120); add(depart);
		arrive.setBounds(120, 120, 80, 120); add(arrive);
		tconfirm.setBounds(200, 305, 180, 180); add(tconfirm);		
		bpurchase.setBounds(10, 390, 150, 40); add(bpurchase); 
		snumtix.setBounds(200, 250, 130, 20); add(snumtix); 
		
		firstClass.setLocation(10, 320); firstClass.setSize(120, 20); add(firstClass);
		economyClass.setLocation(10,345); economyClass.setSize(120, 20); add(economyClass);
		businessClass.setLocation(10,370); businessClass.setSize(120, 20); add(businessClass);
		
		// initialize airport values in our list boxes.
		for (int i = 0; i < airports.length; i++) {
			depart.add(airports[i]);
			arrive.add(airports[i]);
		}
		
		// set our initial number of tickets to default scroll bar value.
		ttix.setText(Integer.toString(snumtix.getValue())); 
		
		// this is where the magic happens
		bpurchase.addActionListener(this);
		snumtix.addAdjustmentListener(this);
	}
	
	public void actionPerformed(ActionEvent e) { // for our button
		if (e.getSource() == bpurchase) {
			tconfirm.append("Name: " + tname.getText() + "\n");
			tconfirm.append("Phone No. " + tphone.getText() + "\n");
			tconfirm.append("Dept City: " + depart.getSelectedItem() + "\n");
			tconfirm.append("Arrival city: " + arrive.getSelectedItem() + "\n");
			tconfirm.append("No. of Tickets: " + ttix.getText() + "\n");
			tconfirm.append("Tickets tuype: " + cbgtix.getSelectedCheckbox().getLabel() + "\n\n");
		}
	}

	public void adjustmentValueChanged(AdjustmentEvent e) { // for our scroll bar
		if (e.getSource() == snumtix) {
			ttix.setText(Integer.toString(snumtix.getValue()));
		}
	}
}