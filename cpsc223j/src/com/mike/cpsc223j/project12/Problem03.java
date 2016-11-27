package com.mike.cpsc223j.project12;

/*
 * Name			Michael Romero
 * Project No.	No.12 part 3
 * Due Date		Dec 1, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This Applet gives the user the current time in the requested Time Zone within the USA.
 */

import java.applet.Applet;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import javax.swing.ImageIcon;

public class Problem03 extends Applet implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	Calendar c = Calendar.getInstance();
	int hour = c.get(Calendar.HOUR);
	int min = c.get(Calendar.MINUTE);
	int sec = c.get(Calendar.SECOND);
	
	String[] stimezones = {"Pacific", "Mountain", "Central", "Eastern" },
			smaps = {"pst.png", "mst.png", "cst.png", "est.png"},
			stzicon = {"tupac.png", "boomhauer.png","kanye.png","biggie.png"};
	
	Label lwelcome = new Label("Welcome to the United States of America"),
			lsampleImage = new Label("A sample image representing"),
			ltimezoneOne = new Label(stimezones[0] + " Zone"),
			ltimezone = new Label("Select time zone"),
			lcurrentTimeZone = new Label(stimezones[0] + " Time");
		
	Choice ctimeZone = new Choice();
	
	Button bshowInfo = new Button("Show Info");
	
	TextField tftime = new TextField(hour + ":" + min + ":" + sec,15);

	Image itz = new ImageIcon(getClass().getResource(smaps[0])).getImage(),
			itzicon = new ImageIcon(getClass().getResource(stzicon[0])).getImage();

	public void init() {
		// some defaults
		setLayout(null);
		setSize(600, 400);
		
		// populate our list of timezones
		for (int i = 0; i < stimezones.length; i++) {
			ctimeZone.add(stimezones[i]);	
		}
				
		// setBounds(x, y, width, height), and add
		lwelcome.setBounds(200,10,280,20); add(lwelcome);
		lsampleImage.setBounds(200,50,240, 20); add(lsampleImage);
		ltimezoneOne.setBounds(230, 80, 140, 20); add(ltimezoneOne);
		ltimezone.setBounds(20, 60, 140, 20); add(ltimezone);
		ctimeZone.setBounds(20, 90, 140, 20); add(ctimeZone);
		lcurrentTimeZone.setBounds(20, 120, 140, 20); add(lcurrentTimeZone);
		tftime.setBounds(20, 150, 140, 20); add(tftime);
		bshowInfo.setBounds(20,180, 140, 20); add(bshowInfo);
		
		// listeners
		bshowInfo.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bshowInfo) {
			// grab a new calendar instance and update the time
			c = Calendar.getInstance();
			int hour = c.get(Calendar.HOUR), min = c.get(Calendar.MINUTE), sec = c.get(Calendar.SECOND);
				
			// update labels and text-fields based on selected time-zone
			tftime.setText((hour + ctimeZone.getSelectedIndex()) + ":" + min + ":" + sec);
			lcurrentTimeZone.setText(stimezones[ctimeZone.getSelectedIndex()] + " Time");
			ltimezoneOne.setText(stimezones[ctimeZone.getSelectedIndex()] + " Zone");
			
			// update images based on selected time-zone
			itz = new ImageIcon(getClass().getResource(smaps[ctimeZone.getSelectedIndex()])).getImage();
			itzicon = new ImageIcon(getClass().getResource(stzicon[ctimeZone.getSelectedIndex()])).getImage();
			repaint();
		}
	}
	
	public void paint(Graphics g) {
		g.drawImage(itz, 200, 100, 200, 200, this);
		g.drawImage(itzicon, 400, 100, 200, 200, this);
	}	
}