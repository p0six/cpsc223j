package com.mike.cpsc223j.project03;

import java.util.Scanner;

/*
 * Name			Michael Romero, Anette Ulrichsen
 * Project No.	No.3 problem 4
 * Due Date		Sep 14, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This program demonstrates calling methods on the object of a 
 * 			Triangle class we created which compute area and perimeter given side length .  
 * 			
 */

public class Problem04 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String temp = new String();
		Triangle t = new Triangle();
		System.out.print("Please enter the length of all three triangle sides: ");
		double a = s.nextDouble(), b = s.nextDouble(), c = s.nextDouble(); 
		temp = s.nextLine(); 
		System.out.printf("Triangle Area: %.4f\n" + temp, t.computeArea(a, b, c));
		System.out.println("Triangle Perimeter: " + t.computePerimeter(a, b, c));
		s.close();
	}
}