package com.mike.cpsc223j.project1;

import java.util.Scanner;

/*
 * Name			Michael Romero, Anette Ulrichsen
 * Project No.	No.1 part 5
 * Due Date		Sep 3, 2016
 * Professor	Ray Ahmadnia
 * 
 * 
 * Purpose:		This program demonstrates handling input from user, as well as 
 * 				the "printf" function for formatting output with a specific amount of
 * 				decimal points (2 in this case). 
 */
public class Problem5 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		double d = 1.25; double c = 1.09; double n = 1.18;
		int id; int ic; int in;
		System.out.println("-----------MENU-----------");
		System.out.println("Drinks\t\t" + d);
		System.out.println("Chips\t\t" + c);
		System.out.println("Nuts\t\t" + n);
		System.out.print("  How many drinks? ");
		id = s.nextInt();
		System.out.print("  How many chips? ");
		ic = s.nextInt();
		System.out.print("  How many nuts? ");
		in = s.nextInt();
		// printf: %[argument_index$][flags][width][.precision]conversion
		// "-" flag for left justified, 8 digits total, 2 beyond decimal point
		System.out.printf("\tTotal Bill = %-8.2f\n", (id*d + ic*c + in*n)); 
		s.close();
	}
}
