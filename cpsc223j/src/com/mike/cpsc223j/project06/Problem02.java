package com.mike.cpsc223j.project06;

import java.util.Scanner;

/*
 * Name			Michael Romero
 * Project No.	No.6 part 2
 * Due Date		Oct 13, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This program demonstrates utilizing Linked Lists Queue's in order to
 * 				create a mathematical function.
 */

public class Problem02 {
	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);		
		LinkedList l = new LinkedList(), r = new LinkedList();
		int left, right;
		System.out.println("To evaluate f(a),");
		boolean continueLoop = true;
		while (continueLoop) {
			System.out.print("\tEnter the coefficient and the power of a term (0 0) to stop: ");
			left = s.nextInt(); right = s.nextInt(); s.nextLine();
			if (left == 0 && right == 0) {
				continueLoop = false;
			} else {
				l.insertQueue(left); 
				r.insertQueue(right);
			}
		}
		
		if (l.queue != null && r.queue != null) {
			System.out.print("\tF(X) = ");
			node ln = l.queue, rn = r.queue;
			while (ln != null && rn != null) {
				System.out.print(ln.info + "X^" + rn.info);
				if (ln.next != null && rn.next != null) {
					System.out.print(" + ");
				}
				ln = ln.next; rn = rn.next;
			}
				
			System.out.print("\n\tEnter the X value: ");
		    int x = s.nextInt(), sum = 0; s.nextLine();
		    System.out.print("\t\tF(" + x + ") = ");
		    ln = l.queue; rn = r.queue;
		    while (ln != null && rn != null) {
		    	sum += ln.info * Math.pow(x, rn.info);
		    	ln = ln.next; rn = rn.next;
		    }
			System.out.print(sum);
		}
		s.close();
	}
}