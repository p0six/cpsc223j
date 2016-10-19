package com.mike.cpsc223j.project1;

import java.util.Scanner;
/*
 * Name			Michael Romero, Anette Ulrichsen
 * Project No.	No.1 part 2
 * Due Date		Sep 3, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This class demonstrates handling input from the user, and displaying output.
 */
public class Problem2 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b;
		System.out.print("Enter two integer numbers:");
		a = s.nextInt(); b = s.nextInt();
		System.out.println("\t" + a + " + " + b + " = " + (a+b));
		System.out.println("\tthe total of " + a + " and " + b + " is " + (a+b));
		System.out.println("\tand their average is " + ((a+b)/2));
		s.close();
	}
	
}
