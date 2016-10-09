package com.mike.cpsc223j.project2;
/*
 * Name			Michael Romero, Anette Ulrichsen
 * Project No.	No.2 page 2, problem 6.
 * Due Date		Sep 6, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This program demonstrates the use nested for loops in order to  
 * 				create specific output.
 */
public class backProblem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// nested for-loops to create the following
		// a.     5 // 4 spaces, 1x 5
		//       44 // 3 spaces, 2x 4
		//      333 // 2 spaces, 3x 3
		//     2222 // 1 spaces, 4x 2
		//    11111 // 0 spaces, 5x 1
		for (int i=5,j=1; i > 0; i--,j++) {
			for (int k = 1; k < i; ++k) {
				System.out.print(" ");
			}
			for (int x=0; x < j; x++) {
				System.out.print(i);
			}
			System.out.println();
		}
		System.out.println();
		
		// b. 12345 // 0 spaces, 1 2 3 4 5
		//     2345 // 1 spaces, 2 3 4 5
		//      345 // 2 spaces, 3 4 5
		//       45 // 3 spaces, 4 5
		//        5 // 4 spaces, 5
		for (int i=1,j=0; i <= 5; i++,j++) {
			for (int x = 0; x < j; x++) {
				System.out.print(" ");
			}
			for (int k = i; k <=5; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}
}