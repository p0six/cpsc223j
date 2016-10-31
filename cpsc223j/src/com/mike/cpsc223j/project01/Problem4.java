package com.mike.cpsc223j.project01;

import java.util.Scanner;

/*
 * Name			Michael Romero, Anette Ulrichsen
 * Project No.	No.1 part 4
 * Due Date		Sep 3, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This program demonstrates handling input from user, output to screen,
 * 				and how an additional "line feed" sometimes needs to be captured when
 * 				taking input from a user.
 */
public class Problem4 {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		String a; char b; String c; String lf;
		System.out.println("Give me your name, I will send you a birthday card");
		System.out.print("\tWhat is your first name? ");
		a = s.nextLine();
		System.out.print("\tWhat is your middle initial? ");
		b = s.next().charAt(0); lf = s.nextLine();
		System.out.print("\tWhat is your last name ? ");
		c = s.nextLine();
		System.out.print("    <<<<<<< Happy Birthday " + a + " " + b + "." + " " + c + " >>>>>>>" + lf);
		s.close();
	}
}