package com.mike.cpsc223j.project6;

import java.util.Scanner;

/*
 * Name			Michael Romero
 * Project No.	No.6 part I
 * Due Date		Oct 13, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This program demonstrates utilizing Linked Lists and Stacks in order
 * 				to detect whether user input consists of a palindrome.
 */

public class Problem01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		boolean continueLoop = true;
		while (continueLoop) {			
			System.out.print("Enter a phrase: ");
			String st = s.nextLine();
			
			LinkedList queue = new LinkedList();
			LinkedList stack = new LinkedList();
			
			int trueCharCount = 0;
			for (int i = 0; i < st.length(); i++) {
				if (Character.isAlphabetic(st.charAt(i))) {
					queue.insertQueue((int) st.charAt(i));
					stack.insertStack((int) st.charAt(i));
					++trueCharCount;
				}
			}
			
			boolean palindrome = true;
			node myQueuePointer = queue.queue;
			node myStackPointer = stack.stack;
			for (int i = 0; i < trueCharCount; i++) {
				if (myQueuePointer.info != myStackPointer.info) {
					palindrome = false;
				}
				myStackPointer = myStackPointer.next;
				myQueuePointer = myQueuePointer.next;
			}
	
			if (palindrome) {
				System.out.println("IS A PALINDROME");
			} else {
				System.out.println("IS NOT A PALINDROME");
			}
		
			System.out.print("Continue(y/n) ? ");
			if (s.nextLine().charAt(0) == 'n') {
				continueLoop = false;
			}
			
		}
		s.close();
	}
}