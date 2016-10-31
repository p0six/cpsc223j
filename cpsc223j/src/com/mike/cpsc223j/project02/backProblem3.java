package com.mike.cpsc223j.project02;
import java.util.*;

/*
 * Name			Michael Romero, Anette Ulrichsen
 * Project No.	No.2 page 2, problem 3.
 * Due Date		Sep 6, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This program demonstrates the use of a 'while' loop, 
 * 				and how to process individual characters within a string.
 */

public class backProblem3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your full name: ");
		String st = s.nextLine();
		int x = 0;
		System.out.print("All uppercase: ");
		while (x < st.length()) {
			System.out.print(st.toUpperCase().charAt(x));
			x++;
		}
		System.out.println();
		s.close();
	}

}
