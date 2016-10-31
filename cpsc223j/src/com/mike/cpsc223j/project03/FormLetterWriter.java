package com.mike.cpsc223j.project03;

/*
 * Name			Michael Romero, Anette Ulrichsen
 * Project No.	No.3 problem 2
 * Due Date		Sep 14, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This program demonstrates using overloaded methods.  The main method
 * 		does nothing more than invoke both versions of the displaySalutation method.
 */

public class FormLetterWriter {
	public static void main(String[] args) {
		displaySalutation("Michael", "Romero");
		displaySalutation("Romero", 'm');
	}
	public static void displaySalutation(String l, char c) {
		String salutation = new String();
		if (c == 'm') {
			salutation = "Mr.";
		} else if (c == 'f') {
			salutation = "Mrs.";
		}
		System.out.println("Dear " + salutation + " " + l);
		System.out.println("Thank you for your recent order!");
	}
	public static void displaySalutation(String f, String l) {
		System.out.println("Dear " + f + " " + l + ",");
		System.out.println("Thank you for your recent order!");
	}
}