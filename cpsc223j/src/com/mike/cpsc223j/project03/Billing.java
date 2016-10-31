package com.mike.cpsc223j.project03;

import java.util.Scanner;

/*
 * Name			Michael Romero, Anette Ulrichsen
 * Project No.	No.3 problem 3
 * Due Date		Sep 14, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This program demonstrates using overloaded methods.  We are also doing
 * 			some equations to calculate the price when a coupon and tax are involved.
 */

public class Billing {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String temp = new String(); temp.isEmpty();
		boolean continueLoop = true;
		while (continueLoop) {
			System.out.print("Enter the number of books? ");
			int n = s.nextInt(); temp = s.nextLine();
			System.out.print("Enter the price of each book: ");
			double p = s.nextDouble(); temp = s.nextLine();
			if (n == 1) {
				System.out.printf("Your total pay is $%.2f\n", computeBill(p));
				System.out.print("CONTINUE(y/n)? ");
				char cont = s.nextLine().charAt(0);
				if (cont == 'n') continueLoop = false;
				continue;
			}
			System.out.print("Any coupon(y/n)? ");
			char cyn = s.nextLine().charAt(0);
			if (cyn == 'y') {
				System.out.print("How much? ");
				double c = s.nextDouble(); temp = s.nextLine();
				System.out.printf("Your total pay is $%.2f\n", computeBill(p,n,c));
			} else if (cyn == 'n') {
				System.out.printf("Your total pay is $%.2f\n", computeBill(p,n));				
			} else {
				System.out.println("Invalid input..");
				continue;
			}
			System.out.print("CONTINUE(y/n)? ");
			char cont = s.nextLine().charAt(0);
			if (cont == 'n') continueLoop = false;
		}
		s.close();	
	}
	
	public static double computeBill(double price) {
		return price*(1 + .08);
	}
	public static double computeBill (double price, int quantity) {
		return (price*quantity)*(1 + .08);
	}
	public static double computeBill(double price, int quantity, double coupon) {
		return (price*quantity)*(1 - coupon)*(1 + 1*.08);
	}
}