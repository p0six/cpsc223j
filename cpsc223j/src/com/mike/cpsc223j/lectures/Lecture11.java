package com.mike.cpsc223j.lectures;

import java.awt.*;

import javax.swing.JFrame;

public class Lecture11 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Some drawing");
		Container cPan = frame.getContentPane();
		frame.setSize(500,500); // 1st argument = width, 2nd = height
		frame.setLocation(0, 0); // frame location in upper left corner.
		frame.setVisible(true);
		Graphics g = cPan.getGraphics();
		g.setColor(Color.red);
		
		// draw string (text messages)
		g.drawString("Some Geo Shapes", 10, 10);
		
		// draw x-axis
		g.setColor(Color.black);
		g.drawLine(0,  frame.getHeight()/2,  500,  frame.getHeight()/2);
		// xStart, yStart -------------- xEnd, yEnd
		
		// draw the y-axis
		g.drawLine(frame.getWidth()/2,  0,  frame.getWidth()/2,  frame.getHeight());
		
		// Draw filled rectangle in the 1st quadrant
		g.setColor(Color.yellow);
		g.fillRect(280, 30, 100, 60);
		
		// draw rectangle and write Hello in it
		Font f = new Font("Times New Roman", Font.ITALIC+Font.BOLD,16);
		g.setFont(f);
		g.setColor(Color.black);
		g.drawRoundRect(280, 100, 150, 40, 10, 10); // x, y, w, h, xRadius, yRadius
		g.drawString("Hello",  300,  120);
		
		// draw circle in the 2nd quadrant
		g.setColor(Color.black);
		g.drawOval(100, 100, 50, 50); // xCenter, yCenter, w, h
		g.setColor(Color.green);
		g.fillOval(100, 100, 50, 50);
		
		// draw ellipse in the 3rd quadrant
		g.setColor(Color.black);
		g.drawOval(50, 300, 150, 50);
		
		// draw polygon in 4th quadrant
		int[] x = {370, 450, 400}; // x coord point 1, 2, 3
		int[] y = {370, 400, 300}; // y coord point 1, 2, 3
		g.drawPolygon(x,y,3); // array of x, y, # of edges, or x.length
		
		// draw arcs
		Color pink = new Color(255,175,175); // red, green, blue
		g.setColor(pink);
		g.fillArc(180, 180, 150, 150, 0, 60);
		
		// draw arcs from lecture.. 
		// g.drawArcs(x, y, w, h, start angle, arc angle)
	}
	
}
