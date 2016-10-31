package com.mike.cpsc223j.project02;
import java.util.*;

/*
 * Name			Michael Romero, Anette Ulrichsen
 * Project No.	No.2 part 1
 * Due Date		Sep 6, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This program demonstrates printing Unicode characters, a for loop,
 * 				and using integers input as variables to iterate by.
 */

public class Problem1 {

	public static void main(String[] args) {
		System.out.print("Please enter the table info(start,finish,jump): ");
		Scanner s = new Scanner(System.in);
		int start = s.nextInt(), finish = s.nextInt(), jump = s.nextInt();

		System.out.println(" $\t\t" + '\u00A5' + "\t\t" + '\u00A3' + "\t\t" + '\u20AC');
		for (int i = 0; i < 55; i++) {
			System.out.print('\u2500');
		}
		System.out.println();
		String temp = s.nextLine();temp.trim(); // remove unused var Eclipse warning

		// Get Conversion rates from USD to Yen, Pound, and Euro
		double yen = 103.39,pound = 0.75,euro = 0.90;
		for (; start <= finish; start += jump) {
			System.out.printf("%.2f\t\t%.2f\t\t%.2f\t\t%.2f", ((float)start) , (start*yen) , (start*pound) , (start*euro));
			if (start != finish) System.out.println();
		}
		s.close();
	}

}
