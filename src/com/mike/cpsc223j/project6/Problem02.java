package com.mike.cpsc223j.project6;

import java.util.Arrays;
import java.util.Scanner;

public class Problem02 {
	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		int[] l = new int[1];
		int[] r = new int[1];
		System.out.println("To evaluate f(a),");
		int pairCounter = 0;
		boolean continueLoop = true;
		while (continueLoop) {
			System.out.print("\tEnter the coefficient and the power of a term (0 0) to stop: ");
			l[pairCounter] = s.nextInt(); r[pairCounter] = s.nextInt(); s.nextLine();
			if (l[pairCounter] == 0 && r[pairCounter] == 0) {
				continueLoop = false;
				break;
			}
			pairCounter++;	
			l = Arrays.copyOf(l, pairCounter + 1);
			r = Arrays.copyOf(r, pairCounter + 1);
		}
		
		if (pairCounter > 0) {
			System.out.print("\tF(X) = ");
			for (int i = 0; i < pairCounter; i++) {
				System.out.print(l[i] + "X^" + r[i]);
				if ((pairCounter - i) > 1) {
					System.out.print(" + ");
				}
			}
				
			System.out.print("\n\tEnter the X value: ");
		    int x = s.nextInt(); s.nextLine();
		    System.out.print("\t\tF(" + x + ") = ");
		    int sum = 0;
		    for (int i = 0; i < pairCounter; i++) {
		    	sum += l[i] * Math.pow(x, r[i]);
		    }
			System.out.print(sum);
		}
		s.close();
	}
}