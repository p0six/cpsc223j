package com.mike.cpsc223j.project7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
/*
 * Name			Michael Romero
 * Project No.	No.7 part 2
 * Due Date		Oct 13, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This program demonstrates Hashing for more efficient searches.
 */

public class Problem02 {
	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new FileReader("src//com//mike//cpsc223j//project7//balances.txt"));
			Scanner s = new Scanner(System.in);
			
			Hashing h = new Hashing();
			while (in.ready()) {
				String token[] = in.readLine().split("\\s");
				h.insertHash(Integer.parseInt(token[0]), token[1], Float.parseFloat(token[2]));
			}
			
			System.out.println("-----------Menu------------");
			System.out.println("1. Show my balance");
			System.out.println("2. Deposit in my account");
			System.out.println("3. Withdraw from my account");
			System.out.println("4. Show me all");
			
			boolean continueLoop = true;
			while (continueLoop) {
				System.out.print("Please enter your choice(1-4): ");
				int x = s.nextInt(); s.nextLine(); 
				int acct; nodeAccount n;
				switch (x) {
				case 1: // Show Balance
					System.out.print("Enter your account number: ");
					acct = s.nextInt(); s.nextLine();
					n = h.searchHash(acct);
					if (n != null) {
						System.out.printf("%s, your balance is %.2f\n", n.name, n.balance);
					} else {
						System.out.println("Account not found!");
					}
					break;
				case 2: // Deposit
					System.out.print("Enter your account number: ");
					acct = s.nextInt(); s.nextLine();
					n = h.searchHash(acct);
					if (n != null) {
						System.out.print(n.name + ", how much would you like to deposit?");
						n.balance += s.nextInt(); s.nextLine();
						System.out.printf("Your new balance is %.2f\n", n.balance);
					} else {
						System.out.println("Account not found!");
					}
					break;
				case 3: // Withdraw
					System.out.print("Enter your account number: ");
					acct = s.nextInt(); s.nextLine();
					n = h.searchHash(acct);
					if (n != null) {
						System.out.print(n.name + ", how much would you like to withdraw?");
						n.balance -= s.nextInt(); s.nextLine();
						System.out.printf("Your new balance is %.2f\n", n.balance);
					} else {
						System.out.println("Account not found!");
					}
					break;
				case 4: // Display all 
					h.display();
					break;
				default: 
					System.out.println("Please make a valid selection...");
					break;
				}
				System.out.print("CONTINUE(y/n) ");
				if (s.nextLine().charAt(0) == 'n') {
					continueLoop = false;
				}
			}
			s.close(); in.close();
		} catch (IOException e) {
			System.out.print(e.getMessage());
		}
	}
}