package com.mike.cpsc223j.project3;
import java.util.Scanner;

/*
 * Name			Michael Romero, Anette Ulrichsen
 * Project No.	No.3 problem 1
 * Due Date		Sep 14, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This program demonstrates how to manipulate strings, how to convert
 * 			a string into an integer, how to split strings into an array using a delimiter
 * 			and flow control.
 */

public class Problem01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char c; String monthString = new String();
		boolean continueLoop = true;
		while (continueLoop) {
			System.out.print("Enter the today's date(mm/dd/yyyy): ");
			String[] stringDate = s.nextLine().split("/");
			int month = Integer.parseInt(stringDate[0]);
			int day = Integer.parseInt(stringDate[1]);
			int year = Integer.parseInt(stringDate[2]);
			if (month == 1) {
				monthString = "January";
			} else if (month == 2) {
				monthString = "February";
			} else if (month == 3) {
				monthString = "March";
			} else if (month == 4) {
				monthString = "April";
			} else if (month == 5) {
				monthString = "May";
			} else if (month == 6) {
				monthString = "June";
			} else if (month == 7) {
				monthString = "July";
			} else if (month == 8) {
				monthString = "August";
			} else if (month == 9) {
				monthString = "September";
			} else if (month == 10) {
				monthString = "October";
			} else if (month == 11) {
				monthString = "November";
			} else if (month == 12) {
				monthString = "December";
			} else {
				monthString = "Invalid";
			}
			String daySuffix = new String();
			if (day == 1 || day == 21 || day == 31 ) {
				daySuffix = "st";
			} else if (day == 2 || day == 22) {
				daySuffix = "nd";
			} else if (day == 3 || day == 23) {
				daySuffix = "rd";
			} else {
				daySuffix = "th";
			}
			System.out.println("Today is " + monthString + " " + day + daySuffix + ", " + year);
			System.out.print("CONTINUE(y/n) ");
			c = s.nextLine().charAt(0);
			if (c == 'n') continueLoop = false;
		}
		s.close();
	}
}
