package com.mike.cpsc223j.project01;

import java.util.Scanner;

/*
 * Name			Michael Romero, Anette Ulrichsen
 * Project No.	No.1 part 3
 * Due Date		Sep 3, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This program demonstrates handling input from user, and output to screen. 
 */
public class Problem3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b, c;
		System.out.println("I can compute your midterm's average, try me");
		System.out.print("\tEnter your scores in 3 exams: ");
		a = s.nextInt(); b = s.nextInt(); c = s.nextInt();
		System.out.print("\t    Your average is: " + ((a + b + c)/3));
		s.close();
	}
}
