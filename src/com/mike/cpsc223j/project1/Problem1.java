package com.mike.cpsc223j.project1;

import java.util.Scanner;

/*
 * Name			Michael Romero, Anette Ulrichsen
 * Project No.	No.1 part I
 * Due Date		Sep 3, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This program demonstrates handling input from user, and output to screen.
 * 				Additionally, also show how to control format of decimal places, and arithmetic operators.
 */
public class Problem1 {
	public static void main (String[] args) {
		float w, l, a, p;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the measure of width: ");
		w = s.nextFloat();
		System.out.print("Enter the measure of length: ");
		l = s.nextFloat();
		a = w*l;
		System.out.printf("\tArea = %.2f\n", a);
		p = (2*w + 2*l);
		System.out.printf("\tPerimeter = %.2f\n", p);
		s.close();
	}
}
