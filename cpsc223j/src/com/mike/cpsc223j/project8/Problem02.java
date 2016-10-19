package com.mike.cpsc223j.project8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * Name			Michael Romero
 * Project No.	No.8 part I
 * Due Date		Oct 20, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This is the driver class for the solution to Problem02.
 */

public class Problem02 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try {
			BST x = readInput("data.txt");
			x.displayInOrder(x.root); // this works..
			System.out.println("----------MENU----------");
			System.out.println("a. Enter ID number to deposit");
			System.out.println("b. Enter ID number to withdraw");
			System.out.println("c. Enter ID number to see your balance");
			boolean continueLoop = true; node y;
			while (continueLoop) {
				System.out.print("Enter your choice(a-c): ");
				switch(s.nextLine().charAt(0)) {
				case 'a':
					System.out.print("Enter your ID number: ");
					y = x.searchTree(s.nextInt()); s.nextLine();
					System.out.print(y.name + ", how much would you like to deposit? ");
					y.balance += s.nextFloat(); s.nextLine();
					System.out.printf("Your new balance now is %.2f\n", y.balance);
					break;
				case 'b':
					System.out.print("Enter your ID number: ");
					y = x.searchTree(s.nextInt()); s.nextLine();
					System.out.print(y.name + ", how much would you like to withdraw? ");
					y.balance -= s.nextFloat(); s.nextLine();
					System.out.printf("Your new balance now is %.2f\n", y.balance);
					break;
				case 'c':
					System.out.print("Enter your ID number: ");
					y = x.searchTree(s.nextInt()); s.nextLine();
					System.out.printf("%s, your balance is currently %.2f\n", y.name, y.balance);
					break;
				default:
					break;
				}
				System.out.print("CONTINUE(y/n)? ");
				if (s.nextLine().charAt(0) == 'n') {
					continueLoop = false;
				}
			}
		} catch (IOException e) {
			System.out.print(e.getMessage());
		}
		s.close();
	}
	
	public static BST readInput(String f) throws IOException {
		BST x = new BST();
		BufferedReader in = new BufferedReader(new FileReader("src//com//mike//cpsc223j//project8//" + f));
		String line;
		while ((line = in.readLine()) != null) {
			String token[] = line.split("\\s");
			int acct = Integer.parseInt(token[0]);
			float balance = Float.parseFloat(token[2]);
			x.insert(acct, token[1], balance);
		}
		in.close();	
		return x;
	}
}