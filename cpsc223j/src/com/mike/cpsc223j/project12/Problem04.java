package com.mike.cpsc223j.project12;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Label;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.ImageIcon;

/*
 * Name			Michael Romero
 * Project No.	No.12 part 4
 * Due Date		Dec 1, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This Applet is an image browser that allows users to change the 
 * 				image size with a scrollbar via the AdjustmentListener
 */

public class Problem04 extends Applet implements ActionListener, AdjustmentListener {
	private static final long serialVersionUID = 1L;
	
	int imageIndex = 0, resizeValue = 0;
	
	Image familyPhoto;
	String[] stphoto = {"tupac.png", "boomhauer.png","kanye.png","biggie.png"};
	String[] stphotoDesc = {"West Side, Tupac!", "Here's Boomhauer!", 
			"Whatup Kanye!", "Say Hi to Biggie!" };
	
	Scrollbar sb1 = new Scrollbar(Scrollbar.HORIZONTAL, 0, 10, 0, 100);
	
	Button bleft = new Button("<<<"),
			bright = new Button(">>>"),
			bshowDesc = new Button("Show Description");
	
	Label lmyFamilyAlbum = new Label("My Family Album"),
			limageDesc = new Label("Image Description");
	
	TextArea taimageDesc = new TextArea(null,6, 40);
	
	public void init() {
		// Defaults
		setLayout(null);
		setSize(600,400);
		resizeValue = sb1.getValue();
		familyPhoto = new ImageIcon(getClass().getResource(stphoto[0])).getImage();
		
		// setBounds(x, y, width, height)
		bleft.setBounds(10, 20, 40, 20); add(bleft);
		bright.setBounds(110, 20, 40, 20); add(bright);
		sb1.setBounds(10, 50, 140, 20); add(sb1);
		bshowDesc.setBounds(220, 120, 140, 60); add(bshowDesc);
		lmyFamilyAlbum.setBounds(400, 30, 140, 20); add(lmyFamilyAlbum);
		limageDesc.setBounds(400, 60, 140, 20); add(limageDesc);
		taimageDesc.setBounds(400, 90, 190, 100); add(taimageDesc);
		
		// listeners
		bleft.addActionListener(this);
		bright.addActionListener(this);
		bshowDesc.addActionListener(this);
		sb1.addAdjustmentListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bleft) {
			if (imageIndex > 0) {
				imageIndex--;
				familyPhoto = new ImageIcon(getClass().getResource(stphoto[imageIndex])).getImage();
				repaint();
				taimageDesc.setText("");
			}
		} else if (e.getSource() == bright) {
			if ((imageIndex+1) < stphoto.length) {
				imageIndex++;
				familyPhoto = new ImageIcon(getClass().getResource(stphoto[imageIndex])).getImage();
				repaint();
				taimageDesc.setText("");
			}
		} else {
			taimageDesc.setText(stphotoDesc[imageIndex]);
		}
	}

	public void adjustmentValueChanged(AdjustmentEvent e) {
		if (e.getSource() == sb1) {
			resizeValue = sb1.getValue();
			repaint();
		}
	}
	
	public void paint(Graphics g) {
		g.drawImage(familyPhoto, 10, 80, (100 + resizeValue), (100 + resizeValue), this);
	}
}