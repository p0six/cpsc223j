package com.mike.cpsc223j.project2;

import java.util.Scanner;
/*
 * Name			Michael Romero, Anette Ulrichsen
 * Project No.	No.2 part 4
 * Due Date		Sep 6, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This program demonstrates the use of a 'while' loop, 
 * 				and how to process individual characters within a string.
 */
public class Problem4 {
	public static void main(String[] args) {
		boolean continueLoop = true;
		while (continueLoop) {
			Scanner s = new Scanner(System.in);
			System.out.print("Enter a string of YES and NO votes: ");
			String st = s.nextLine();
			int y=0,n=0,x=0;
			while (x < st.length()) {
				char c = st.charAt(x);
				if (c == 'y' || c == 'Y') {
					y++;
				} else if (c == 'n' || c == 'N') {
					n++;
				}
				x++;
			}
			System.out.print("YES votes: ");
			for (int i=0; i < y; i++) {
				System.out.print("*");
				if ((y - i) == 1) {
					System.out.print("\n");
				}
			}
			System.out.print("NO votes: ");
			for (int i=0; i < n; i++) {
				System.out.print("*");
				if ((n - i) == 1) {
					System.out.print("\n");
				}
			}
			continueLoop = false;
			s.close();
		}
	}
}
