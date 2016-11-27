package com.mike.cpsc223j.project12;

import java.applet.Applet;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class experimentation extends Applet implements ActionListener {

	/**
	 * This is me trying to program with more modern conventions
	 * AppleKey+E opens up small menu in Eclipse to navigate between tabs
	 * fn+shift+f2 while hovering over a class will open the javadoc
	 */
	private static final long serialVersionUID = 1L;

	public void init() {
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		add(new Label("Hi There!"));
		add(new Label("Another Label"));
	}
	
	public void actionPerformed(ActionEvent e) {
		
	}
}