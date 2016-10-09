package com.mike.cpsc223j.quiz;

import java.util.Scanner;
/*
 * Name			Michael Romero
 * Quiz No. 2
 * Due Date		Sep 15, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		Instantiate objects using different constructors, call methods.
 */
public class ClassOne {

	public static void main(String[] args) {
		ClassTwo x = new ClassTwo(); // x is set to 10
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the values of y and z: ");
		int i = s.nextInt();
		int j = s.nextInt();
		s.nextLine();
		ClassTwo yz = new ClassTwo(i,j);
		
		yz.displayXYZ(x.getX(), yz.getY(), yz.getZ());
		yz.total(x.getX(), yz.getY(), yz.getZ());
		yz.maximum(x.getX(), yz.getY(), yz.getZ());
		
		s.close();
	}

}
