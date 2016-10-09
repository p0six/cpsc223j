package com.mike.cpsc223j.project1;

import java.util.Scanner;

/*
 * Name			Michael Romero, Anette Ulrichsen
 * Project No.	No.1 part 6
 * Due Date		Sep 3, 2016
 * Professor	Ray Ahmadnia
 * 
 * 
 * Purpose:		The purpose of this code is to demonstrate the "printf" function, 
 * 				as well as handling input from user and output to screen.
 */
public class Problem6 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		float x, y;
		System.out.println("I can convert temperature from degrees Fehrenheit to degrees Celsius. try me");
		System.out.print("  Enter a temperature in Fahrenheit: ");
		x = s.nextFloat();
		y = ((5*(x-32))/(9));
		System.out.printf("  %.0f Fehrenheit is %.2f Celsius", x, y);
		s.close();
	}
}
