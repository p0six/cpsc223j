package com.mike.cpsc223j.lectures;
/*
 * Name			Michael Romero
 * Project No.	No.1 part I
 * Due Date		Sep 3, 2016
 * Professor	Ray Ahmadnia
 * 
 * 
 * Purpose:		Type a few lines to describe what the project is going to do...
 */
import java.util.*;
public class Lecture01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String myName, yourName;
		int a, b;
		System.out.print("Enter two integer numbers: ");
		a = s.nextInt(); b = s.nextInt();
		//String temp = s.nextLine(); // accounts for \n
		System.out.print("What is my name? ");
		myName = s.nextLine();
		String temp = s.nextLine(); // accounts for \n
		System.out.print("What is your name? ");
		yourName = s.nextLine();
		
		System.out.printf("The two integer numbers are a=%d  b=%d"+ a + b); // %d is for int
		System.out.printf("My name is %s" + myName); // %s is for string, %c for char, %f for float
		System.out.printf("Your name is %s" + yourName);
		
		s.close();
		
	}
	public int myInteger() {
		return 3;
	}
}