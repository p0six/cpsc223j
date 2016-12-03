package com.mike.cpsc223j.quiz;
import java.util.*;
/*
 * Name			Michael Romero
 * Quiz No. 1
 * Due Date		Sep 8, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		Manipulate strings, flow control
 */
public class Quiz01Class01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean continueLoop = true;
		while (continueLoop) {
			System.out.print("Enter a phone number: ");
			String inputOne = s.nextLine();
			String outputOne = new String();
			char c;
			System.out.print(inputOne + " or ");
			for (int i = 0; i < inputOne.length(); i++) {
				c = inputOne.charAt(i);
				if (Character.isDigit(c)) {
					outputOne += c;
				} else if (Character.isAlphabetic(c)) {
					if (c == 'A' || c == 'B' || c == 'C') {
						outputOne += '2';
					} else if (c == 'D' || c == 'E' || c == 'F') {
						outputOne += '3';
					} else if (c == 'G' || c == 'H' || c == 'I') {
						outputOne += '4';
					} else if (c == 'J' || c == 'K' || c == 'L') {
						outputOne += '5';
					} else if (c == 'M' || c == 'N' || c == 'O') {
						outputOne += '6';
					} else if (c == 'P' || c == 'Q' || c == 'R' || c == 'S') {
						outputOne += '7';
					} else if (c == 'T' || c == 'U' || c == 'V') {
						outputOne += '8';
					} else if (c == 'W' || c == 'X' || c == 'Y' || c == 'Z') {
						outputOne += '9';
					}
				}
			}	
			System.out.println(outputOne.substring(0,1) + "-" + outputOne.substring(1, 4) + "-" + outputOne.substring(4,7) + "-" + outputOne.substring(7,11));
			System.out.print("\nCONTINUE(y/n)? ");
			if (s.nextLine().charAt(0) == 'n') continueLoop = false;
		}
		s.close();
	}
}