package com.mike.cpsc223j.project9;

import java.awt.*;
import javax.swing.*;

/*
 * Name			Michael Romero
 * Project No.	No.9 part 1
 * Due Date		Oct 27, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This is a class which demonstrates using the AWT and Swing packages for Java Applets. 
 * 				We draw some shapes as well.
 */

public class Problem01 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Some drawing");
		Container cPan = frame.getContentPane();
		frame.setSize(500,500); // 1st argument = width, 2nd = height
		frame.setLocation(0, 0); // frame location in upper left corner.
		frame.setVisible(true);
		Graphics g = cPan.getGraphics();
		
		// draw strings
		g.setColor(Color.black);
		g.drawString("Geometric Shapes", 200, 20);
		g.drawString("Polygons", 95, 60);
		g.drawString("Ovals", frame.getWidth() - 135, 60);

		// draw our structure, using lines.
		g.drawLine(frame.getWidth()/2, 22, frame.getWidth()/2, 40); // center vertical
		g.drawLine(120, 40, frame.getWidth() - 120, 40); // center horizontal
		g.drawLine(120, 40, 120, 50); // vertical polygons center, 10 pixels long
		g.drawLine(frame.getWidth() - 120, 40, frame.getWidth() - 120, 50); // vertical ovals down, 10 pixels
		g.drawLine(120, 65, 120, 75); // vertical polygons center, 10 pixels long
		g.drawLine(frame.getWidth() - 120, 65, frame.getWidth() - 120, 75); // vertical ovals down, 10 pixels
		g.drawLine(40, 75, 210, 75); // left horizontal
		g.drawLine(300, 75, frame.getWidth() - 40, 75); // right horizontal
		g.drawLine(40, 75, 40, 90); // vertical polygons left
		g.drawLine(120, 75, 120, 90); // vertical polygons center down
		g.drawLine(210, 75, 210, 90); // vertical polygons right down
		g.drawLine(300, 75, 300, 90); // vertical ovals left
		g.drawLine(frame.getWidth() - 40, 75, frame.getWidth() - 40, 90); // vertical ovals right
			
		// draw a rectangle
		g.setColor(Color.black);
		g.drawRect(20, 92, 40, 20);
		
		// fill a rectangle
		g.setColor(Color.yellow);
		g.fillRect(21, 93, 39, 19);
		
		// draw a triangle
		g.setColor(Color.black);
		int[] x = {95, 120, 145}; // x coord point 1, 2, 3
		int[] y = {112, 92, 112}; // y coord point 1, 2, 3
		g.drawPolygon(x,y,x.length); // array of x, y, # of edges aka x.length
		
		// fill a triangle
		g.setColor(Color.yellow);
		int[] xi = {96, 120, 144}; // x coord point 1, 2, 3
		int[] yi = {112, 93, 112}; // y coord point 1, 2, 3
		g.fillPolygon(xi, yi, 3);
		
		// draw a polygon
		g.setColor(Color.black);
		int[] xr = {190, 230, 240, 180};
		int[] yr = {92, 92, 112, 112};
		g.drawPolygon(xr, yr, 4); // 92 top, 112 bottom, 210 center
		
		// fill a polygon
		g.setColor(Color.yellow);
		int[] xri = {191, 229, 239, 181};
		int[] yri = {93, 93, 111, 111};
		g.fillPolygon(xri,  yri,  4);
				
		// draw an ellipse
		g.setColor(Color.black);
		g.drawOval(285, 92, 30, 30); // upperLeftCorner x, upperLeftCorner y, w, h
		g.setColor(Color.green);
		g.fillOval(286, 93, 28, 28);
				
		// draw an ellipse
		g.setColor(Color.black);
		g.drawOval(frame.getWidth() - 70, 93, 60, 30);
		g.setColor(Color.red);
		g.fillOval(frame.getWidth() - 69, 93, 58, 29);
	}
}