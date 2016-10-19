package com.mike.cpsc223j.project2;
/*
 * Name			Michael Romero, Anette Ulrichsen
 * Project No.	No.2 page 2, problem 5.
 * Due Date		Sep 6, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This program demonstrates the use nested for loops in order to  
 * 				create specific output.
 */
public class backProblem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// nested for loops to create :
		// a. *****
		//    ****
		//    ***
		//    **
		//    *
		for (int i=5; i > 0; i--) {
			for (int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// b. *
		//    ** 
		//    ***
		//    ****
		//    *****
		for (int i=0; i <= 5; i++) {
			for (int j=0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}