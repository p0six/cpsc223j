package com.mike.cpsc223j.project3;

/*
 * Name			Michael Romero, Anette Ulrichsen
 * Project No.	No.3 problem 5
 * Due Date		Sep 14, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This program demonstrates a recursive method which takes the summation
 * 		of three to a given power of n down to 3.  
 * 			
 */

public class Problem05 {
	public static void main(String[] args) {
		System.out.print("summationThing(10) = " + summationThing(10));
	}
	public static double summationThing(double n) {
		if (n == 3) {
			return Math.pow(3, n);
		} else {
			return Math.pow(3, n) + summationThing(n - 1);
		}
	}
}