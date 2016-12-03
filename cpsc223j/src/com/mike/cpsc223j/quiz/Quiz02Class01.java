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
public class Quiz02Class01 {

	public static void main(String[] args) {
		Quiz02Class02 x = new Quiz02Class02(); // x is set to 10
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the values of y and z: ");
		int i = s.nextInt();
		int j = s.nextInt();
		s.nextLine();
		Quiz02Class02 yz = new Quiz02Class02(i,j);
		
		yz.displayXYZ(x.getX(), yz.getY(), yz.getZ());
		yz.total(x.getX(), yz.getY(), yz.getZ());
		yz.maximum(x.getX(), yz.getY(), yz.getZ());
		
		s.close();
	}

}
