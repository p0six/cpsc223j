package com.mike.cpsc223j.finalExam;

import java.applet.Applet;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Problem02 extends Applet implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	Frame frmMenu = new Frame("Four Seasons");

	MenuBar mnuMain = new MenuBar();
	
	Menu mnuSpr = new Menu("Spring"),
			mnuSum = new Menu("Summer"),
			mnuFal = new Menu("Fall"),
			mnuWin = new Menu("Winter");
	
	MenuItem mnuiJan = new MenuItem("January"),
			mnuiFeb = new MenuItem("February"),
			mnuiMar = new MenuItem("March"),
			mnuiApr = new MenuItem("April"),
			mnuiMay = new MenuItem("May"),
			mnuiJun = new MenuItem("June"),
			mnuiJul = new MenuItem("July"),
			mnuiAug = new MenuItem("August"),
			mnuiSep = new MenuItem("September"),
			mnuiOct = new MenuItem("October"),
			mnuiNov = new MenuItem("November"),
			mnuiDec = new MenuItem("December");
		
	JLabel iphoto = new JLabel();
	
	TextArea tfdescribe = new TextArea(null, 10, 40);

	public static void main(String[] args) {
		Problem02 myMenuApp2 = new Problem02();
		myMenuApp2.createInterface();
	}
	
	public void createInterface() {
		// populate menus
		mnuMain.add(mnuSpr); mnuSpr.addActionListener(this);
		mnuMain.add(mnuSum); mnuSum.addActionListener(this);
		mnuMain.add(mnuFal); mnuFal.addActionListener(this);
		mnuMain.add(mnuWin); mnuWin.addActionListener(this);
		mnuWin.add(mnuiJan);
		mnuWin.add(mnuiFeb);
		mnuWin.add(mnuiMar);
		mnuSpr.add(mnuiApr);
		mnuSpr.add(mnuiMay);
		mnuSpr.add(mnuiJun);
		mnuSum.add(mnuiJul);
		mnuSum.add(mnuiAug);
		mnuSum.add(mnuiSep);
		mnuFal.add(mnuiOct);
		mnuFal.add(mnuiNov);
		mnuFal.add(mnuiDec);
		
		// attach the menu bar to the frame
		frmMenu.setMenuBar(mnuMain);
		
		// set some boundaries and attach our elements to the frame
		tfdescribe.setBounds(300, 100, 200, 100); frmMenu.add(tfdescribe);
		iphoto.setBounds(10,100,200,100); frmMenu.add(iphoto);
		
		// set frame menu visible boolean to true...so we can see it!
		frmMenu.setVisible(true); frmMenu.setSize(600,  400);
	}
	
	public void actionPerformed(ActionEvent e) {
		String strMenuItem = e.getActionCommand();
		if (strMenuItem.equals("January")) {
			iphoto.setIcon(new ImageIcon(getClass().getResource("january.jpg")));
			tfdescribe.setText("January is pretty cold.\nHappy New Year!");
		} else if (strMenuItem.equals("February")) {
			iphoto.setIcon(new ImageIcon(getClass().getResource("february.jpg")));
			tfdescribe.setText("February is pretty cold.\nThat's about it.!");
		} else if (strMenuItem.equals("March")) {
			iphoto.setIcon(new ImageIcon(getClass().getResource("march.jpg")));
			tfdescribe.setText("March is pretty cool.\nGetting a little warmer!");
		} else if (strMenuItem.equals("April")) {
			iphoto.setIcon(new ImageIcon(getClass().getResource("april.jpg")));
			tfdescribe.setText("April brings in Spring!\nIt's beautiful!");
		} else if (strMenuItem.equals("May")) {
			iphoto.setIcon(new ImageIcon(getClass().getResource("may.jpg")));
			tfdescribe.setText("May is pretty nice.\nMay Flowers!");
		} else if (strMenuItem.equals("June")) {
			iphoto.setIcon(new ImageIcon(getClass().getResource("june.jpg")));
			tfdescribe.setText("June is pretty warm.\nGetting kinda hot actually.");
		} else if (strMenuItem.equals("July")) {
			iphoto.setIcon(new ImageIcon(getClass().getResource("july.jpg")));
			tfdescribe.setText("July is now officially \nreally hot.  Hit the\nbeach!!");
		} else if (strMenuItem.equals("August")) {
			iphoto.setIcon(new ImageIcon(getClass().getResource("august.jpg")));
			tfdescribe.setText("August is super hot.\nCan't wait for fall!!");
		} else if (strMenuItem.equals("September")) {
			iphoto.setIcon(new ImageIcon(getClass().getResource("september.jpg")));
			tfdescribe.setText("September is chill.\nCooling down!");
		} else if (strMenuItem.equals("October")) {
			iphoto.setIcon(new ImageIcon(getClass().getResource("october.jpg")));
			tfdescribe.setText("October is pretty nice.\nHappy Halloween!");
		} else if (strMenuItem.equals("November")) {
			iphoto.setIcon(new ImageIcon(getClass().getResource("november.jpg")));
			tfdescribe.setText("November is getting chilly.\nHappy Thanksgiving!");
		} else { // December
			iphoto.setIcon(new ImageIcon(getClass().getResource("december.jpg")));
			tfdescribe.setText("December is cold.\nMerry Xmas!");
		}
	}
}