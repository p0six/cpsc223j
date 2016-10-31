package com.mike.cpsc223j.project02;
import java.util.*;

/*
 * Name			Michael Romero, Anette Ulrichsen
 * Project No.	No.2 part 3
 * Due Date		Sep 6, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This program demonstrates handling input from user, and output to screen.
 * 				Additionally, also show how to control format of decimal places, and arithmetic operators.
 */

public class Problem3 {
	public static void main(String[] args) {
		int numCorrect=0,numWrong=0;
		String cont;
		Scanner s = new Scanner(System.in);
		do {
			int x = (int) (Math.random()*10);
			int y = (int) (Math.random()*10);
			int z = 0;
			System.out.print(x + " + " + y + " = ");
			z = s.nextInt();
			cont = s.nextLine();
			if ((x+y) == z) {
				System.out.print("CORRECT\nContinue(y/n)? ");
				numCorrect++;
			} else {
				System.out.print("WRONG\nContinue(y/n)? ");
				numWrong++;
			}
			cont = s.nextLine();
		} while (cont.toLowerCase().charAt(0) == 'y');
		System.out.println("Number of CORRECT answers: " + numCorrect);
		System.out.println("Number of WRONG answers: " + numWrong);
		s.close();
	}
}