package com.mike.cpsc223j.quiz;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;

public class QuizFour {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Some drawing");
		frame.setSize(500,500); // 1st argument = width, 2nd = height
		frame.setLocation(0, 0); // frame location in upper left corner.
		frame.setVisible(true);
		Container cPan = frame.getContentPane();
		Graphics g = cPan.getGraphics();
		
		// draw strings
		g.setColor(Color.black);
		g.drawString("California Lotto", 200, 370);
		
		g.drawRoundRect(100, 100, 300, 300, 10, 10);
		g.drawOval(150, 150, 175, 175);
		
		g.setColor(Color.orange);
		g.fillOval(150, 150, 175, 175);
		
		g.setColor(Color.blue);
		g.fillRect(220, 120, 30, 155);
		g.fillRect(250, 250, 75, 25);
		g.drawLine(220, 120, 220, 275); // line down
		g.drawLine(250, 120, 250, 250); // line down
		g.drawLine(220, 120, 250, 120); // horiz top
		g.drawLine(220, 275, 325, 275); 
		g.drawLine(250, 250, 325, 250);
		g.drawLine(325, 275, 325, 250);
	}
}
