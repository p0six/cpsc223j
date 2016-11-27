package com.mike.cpsc223j.project12;

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

/*
 * Name			Michael Romero
 * Project No.	No.12 part 3
 * Due Date		Dec 1, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This Applet gives the user the current time in the requested Time Zone within the USA.
 * 
 */

public class Problem03 extends Applet implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	Calendar c = Calendar.getInstance();
	int hour = c.get(Calendar.HOUR);
	int min = c.get(Calendar.MINUTE);
	int sec = c.get(Calendar.SECOND);
	
	String[] stimezones = {"Pacific", "Mountain", "Central", "Eastern" };
	String[] smaps = {"pst.png", "mst.png", "cst.png", "est.png"};
	String[] stzicon = {"tupac.png", "boomhauer.png","kanye.png","biggie.png"};
	
	Label lwelcome = new Label("Welcome to the United States of America"),
			lsampleImage = new Label("A sample image representing"),
			ltimezoneOne = new Label(""),
			ltimezone = new Label("Select time zone"),
			lcurrentTimeZone = new Label("");
		
	Choice ctimeZone = new Choice();
	
	Button bshowInfo = new Button("Show Info");
	
	TextField tftime = new TextField(null,15);

	Image itz, itzicon;

	public void init() {
		// some defaults
		this.setLayout(null);
		this.setSize(600, 400);
		
		for (int i = 0; i < stimezones.length; i++) {
			ctimeZone.add(stimezones[i]);	
		}
				
		// x, y, width, height
		lwelcome.setBounds(200,10,280,20); add(lwelcome);
		lsampleImage.setBounds(200,50,240, 20); add(lsampleImage);
		ltimezoneOne.setBounds(230, 80, 140, 20); add(ltimezoneOne);
		ltimezone.setBounds(20, 60, 140, 20); add(ltimezone);
		ctimeZone.setBounds(20, 90, 140, 20); add(ctimeZone);
		lcurrentTimeZone.setBounds(20, 120, 140, 20); add(lcurrentTimeZone);
		tftime.setBounds(20, 150, 140, 20); add(tftime);
		bshowInfo.setBounds(20,180, 140, 20); add(bshowInfo);
		
		lcurrentTimeZone.setText(stimezones[ctimeZone.getSelectedIndex()] + " Time");
		ltimezoneOne.setText(stimezones[ctimeZone.getSelectedIndex()] + " Zone");
		ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("com//mike//cpsc223j//project12//" + smaps[ctimeZone.getSelectedIndex()]));
		itz = icon.getImage();
		ImageIcon iconx = new ImageIcon(getClass().getClassLoader().getResource("com//mike//cpsc223j//project12//" + stzicon[ctimeZone.getSelectedIndex()]));
		itzicon = iconx.getImage(); 
		
		tftime.setText(hour + ":" + min + ":" + sec);
		
		repaint();
		
		bshowInfo.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bshowInfo) {
			Calendar c = Calendar.getInstance();
			int hour = c.get(Calendar.HOUR);
			int min = c.get(Calendar.MINUTE);
			int sec = c.get(Calendar.SECOND);
						
			tftime.setText((hour+ctimeZone.getSelectedIndex()) + ":" + min + ":" + sec);
			lcurrentTimeZone.setText(stimezones[ctimeZone.getSelectedIndex()] + " Time");
			ltimezoneOne.setText(stimezones[ctimeZone.getSelectedIndex()] + " Zone");
			ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("com//mike//cpsc223j//project12//" + smaps[ctimeZone.getSelectedIndex()]));
			itz = icon.getImage();
			ImageIcon iconx = new ImageIcon(getClass().getClassLoader().getResource("com//mike//cpsc223j//project12//" + stzicon[ctimeZone.getSelectedIndex()]));
			itzicon = iconx.getImage(); 
			repaint();
		}
	}
	
	public void paint(Graphics g) {
		g.drawImage(itz, 200, 100, 200, 200, this);
		g.drawImage(itzicon, 400, 100, 200, 200, this);
	}	
}