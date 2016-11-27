package com.mike.cpsc223j.project12;

import java.applet.Applet;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;

public class menuPulldowns extends Applet implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	Image img;
	String pic[] = {"images/f1.jpg","images/f2.jpg","images/f3.jpg","images/f4.jpg"};
	
	Frame frmMenu = new Frame("Frame Demo");
	Label lblMess = new Label("Hello World");
	JLabel lblImage = new JLabel();
	
	MenuBar mnuMain = new MenuBar();
	Menu mnuPic = new Menu("Picture");
	Menu mnuColor = new Menu("Color");
	
	MenuItem mnuPic1 = new MenuItem("pic_1"),
			mnuPic2 = new MenuItem("pic_2");
	
	MenuItem mnuColorBlue = new MenuItem("Blue"),
			mnuColorGreen = new MenuItem("Green");

	public void init () {
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		//Menus2 myMenu
	}
}