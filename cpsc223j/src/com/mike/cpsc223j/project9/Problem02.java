package com.mike.cpsc223j.project9;

import java.awt.Color;
import java.awt.Container;
import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Name			Michael Romero
 * Project No.	No.9 part II
 * Due Date		Oct 27, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This is a Java program which utilizes Graphics packages AWT and Swing in order to compute
 * 				areas of various shapes, and draw the shapes..
 */

public class Problem02 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Some drawing");
		Container cPan = frame.getContentPane();
		frame.setSize(500,500); // 1st argument = width, 2nd = height
		frame.setLocation(0, 0); // frame location in upper left corner.
		frame.setVisible(true);
		Graphics g = cPan.getGraphics();
				
		String option;
		do {
			displayMenu(g);
			option = JOptionPane.showInputDialog("Enter your option");
			
			// clear the frame window
			g.clearRect(0, 0, (int)cPan.getSize().getWidth(), (int)cPan.getSize().getHeight());
			if (option.equals("a")) {
				computeAreaOfTriangle(g, frame);
			} else if (option.equals("b")) {
				computeAreaOfEllipse(g, frame);
			} else {
				computeAreaOfPolygon(g, frame);
			}
			option = JOptionPane.showInputDialog("Continue(y/n)? ");
			
			// clear the frame window
			g.clearRect(0, 0, (int)cPan.getSize().getWidth(), (int)cPan.getSize().getHeight());
			
		} while (option.equals("y"));
	}
	
	static void displayMenu(Graphics g) {
		g.drawString("---------------MENU---------------", 50, 50);
		g.drawString("a. Compute the area of triangles ", 50, 70);
		g.drawString("b. Compute the area of ellipse", 50, 90);
		g.drawString("c. Compute the area of polygons", 50, 110);
	}
	
	static void computeAreaOfTriangle(Graphics g, JFrame frame) {
		int centerX = frame.getWidth()/2, width, height;
		FontMetrics fm = g.getFontMetrics();
		String outputString = "Please enter triangle info";
		int stringStart = centerX - fm.stringWidth(outputString)/2;
		g.drawString(outputString, stringStart, 20);

		String temp = JOptionPane.showInputDialog("What is the width of the base? ");
		width = Integer.parseInt(temp);
		temp = JOptionPane.showInputDialog("What is the height? ");
		height = Integer.parseInt(temp);
		
		outputString = "Base Width = " + width;
		stringStart = centerX - fm.stringWidth(outputString)/2;
		g.drawString(outputString, stringStart, 92 + height + 30);
		
		outputString = "Height = " + height;
		stringStart = centerX - fm.stringWidth(outputString)/2;
		g.drawString(outputString, stringStart, 92 + height + 45);
		
		double area = 0.5*width*height;
		outputString = "Area = .05*width*height = " + area;
		stringStart = centerX - fm.stringWidth(outputString)/2;
		g.drawString(outputString, stringStart, 92 + height + 60);
		
		int[] xv = {centerX, centerX - width/2, centerX + width/2};
		int[] yv = {92, 92 + height, 92 + height};
		Color z = g.getColor();
		g.setColor(Color.lightGray);
		g.fillPolygon(xv,yv, xv.length);
		g.setColor(z);
	}
	
	static void computeAreaOfEllipse(Graphics g, JFrame frame) {		
		int centerX = frame.getWidth()/2, major, minor;
		FontMetrics fm = g.getFontMetrics();
		
		String outputString = "Please enter ellipse info";
		int stringStart = centerX - fm.stringWidth(outputString)/2;
		g.drawString(outputString, stringStart, 20);
		
		String temp = JOptionPane.showInputDialog("What is the length of the major axis? "); // long diameter
		major = Integer.parseInt(temp);
		temp = JOptionPane.showInputDialog("What is the length of the minor axis? "); // short diameter
		minor = Integer.parseInt(temp);
		
		Color z = g.getColor();
		g.setColor(Color.lightGray);
		g.fillOval(centerX - major/2, 52, major, minor);
		g.setColor(z);
		
		outputString = "Major axis = " + major;
		stringStart = centerX - fm.stringWidth(outputString)/2;
		g.drawString(outputString, stringStart, 52 + minor + 30);
		
		outputString = "Minor axis = " + minor;
		stringStart = centerX - fm.stringWidth(outputString)/2;
		g.drawString(outputString, stringStart, 52 + minor + 45);
		
		double area = Math.round(100*Math.PI*(major/2)*(minor/2)) / 100.0;
		outputString = "Area = pi*(major/2)*(minor/2) = " + area;
		stringStart = centerX - fm.stringWidth(outputString)/2;
		g.drawString(outputString, stringStart, 52 + minor + 60);
		
	}
	
	static void computeAreaOfPolygon(Graphics g, JFrame frame) {
		int centerX = frame.getWidth()/2, b1, b2, h;
		FontMetrics fm = g.getFontMetrics();
		
		String outputString = "Please enter polygon info";
		int stringStart = centerX - fm.stringWidth(outputString)/2;
		g.drawString(outputString, stringStart, 20);
		
		String temp = JOptionPane.showInputDialog("What is the width of the top? ");
		b1 = Integer.parseInt(temp);
		temp = JOptionPane.showInputDialog("What is the width of the bottom? ");
		b2 = Integer.parseInt(temp);
		temp = JOptionPane.showInputDialog("What is the height value? ");
		h = Integer.parseInt(temp);
		
		int[] xr = {centerX - b1/2, centerX + b1/2, centerX + b2/2, centerX - b2/2};
		int[] yr = {92, 92, 92 + h, 92 + h};

		Color z = g.getColor();
		g.setColor(Color.lightGray);
		g.fillPolygon(xr, yr, 4);
		g.setColor(z);
		
		outputString = "Width at top = " + b1;
		stringStart = centerX - fm.stringWidth(outputString)/2;
		g.drawString(outputString, stringStart, 92 + h + 30);
				
		outputString = "Width at bottom = " + b2;
		stringStart = centerX - fm.stringWidth(outputString)/2;
		g.drawString(outputString, stringStart, 92 + h + 45);
		
		outputString = "Height = " + h;
		stringStart = centerX - fm.stringWidth(outputString)/2;
		g.drawString(outputString, stringStart, 92 + h + 60);
		
		double area = 0.5*h*(b1 + b2);
		outputString = "Area = 0.5*height*(topWidth + botWiddth) = " + area;
		stringStart = centerX - fm.stringWidth(outputString)/2;
		g.drawString(outputString, stringStart, 92 + h + 75);
	}	
}