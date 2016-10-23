package com.mike.cpsc223j.project9;

import java.awt.Color;
import java.awt.Container;
import java.awt.FontMetrics;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * Name			Michael Romero
 * Project No.	No.9 part 2
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
		int centerX = frame.getWidth()/2;
		int x, y;
		String temp = JOptionPane.showInputDialog("What is the width of the base? ");
		x = Integer.parseInt(temp);
		temp = JOptionPane.showInputDialog("What is the height? ");
		y = Integer.parseInt(temp);
				
		FontMetrics fm = g.getFontMetrics();
		double area = 0.5*x*y;
		String outputString = "Area of Triangle = " + area;
		int stringStart = centerX - fm.stringWidth(outputString)/2;
		g.drawString(outputString, stringStart, 20);
		
		int[] xv = {centerX, centerX - x/2, centerX + x/2};
		int[] yv = {92, 92 + y, 92 + y};
		Color z = g.getColor();
		g.setColor(Color.blue);
		g.drawPolygon(xv,yv, xv.length);
		g.setColor(z);
	}
	
	static void computeAreaOfEllipse(Graphics g, JFrame frame) {		
		int centerX = frame.getWidth()/2, w, h;
		FontMetrics fm = g.getFontMetrics();
		String temp = JOptionPane.showInputDialog("What is the length of the major axis? "); // long diameter
		w = Integer.parseInt(temp);
		temp = JOptionPane.showInputDialog("What is the length of the minor axis? "); // short diameter
		h = Integer.parseInt(temp);
		
		double area = Math.round(Math.PI*(w*h/2)) / 100.0;
		String outputString = "Area of Ellipse = " + area;
		int stringStart = centerX - fm.stringWidth(outputString)/2;
		g.drawString(outputString, stringStart, 20);
		
		g.drawOval(centerX - w/2, 92, w, h);		
	}
	
	static void computeAreaOfPolygon(Graphics g, JFrame frame) {
		int centerX = frame.getWidth()/2;
		int b1, b2, h;
		String temp = JOptionPane.showInputDialog("What is the width of the top? ");
		b1 = Integer.parseInt(temp);
		temp = JOptionPane.showInputDialog("What is the width of the bottom? ");
		b2 = Integer.parseInt(temp);
		temp = JOptionPane.showInputDialog("What is the height value? ");
		h = Integer.parseInt(temp);
		
		FontMetrics fm = g.getFontMetrics();
		double area = 0.5*h*(b1 + b2);
		String outputString = "Area of Polygon = " + area;
		int stringStart = centerX - fm.stringWidth(outputString)/2;
		g.drawString(outputString, stringStart, 20);
		
		int[] xr = {centerX - b1/2, centerX + b1/2, centerX + b2/2, centerX - b2/2};
		int[] yr = {92, 92, 92 + h, 92 + h};
		g.drawPolygon(xr, yr, 4);
	}	
}