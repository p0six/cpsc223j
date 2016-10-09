package com.mike.cpsc223j.project7;

import java.util.Scanner;

public class Problem01 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		LinkedList setA = new LinkedList();
		LinkedList setB = new LinkedList();
		LinkedList setAUB = new LinkedList();
		System.out.println("Enter data for setA: ");
		System.out.print("  Enter a group of positive integer numbers with -1 at the end: ");
		int x = s.nextInt();
		while (x != -1) {
			setA.insertOrdered(x);
			x = s.nextInt();
		} s.nextLine();
		
		System.out.print("\tsetA=");
		setA.display(setA.ordered);
		
		System.out.println("Enter data for setB: ");
		System.out.print("  Enter a group of positive integer numbers with -1 at the end: ");
		x = s.nextInt();
		while (x != -1) {
			setB.insertOrdered(x);
			x = s.nextInt();
		} s.nextLine();
		System.out.print("\tsetB=");
		setA.display(setB.ordered);
		
		node o = setA.ordered;
		while (o != null) {
			setAUB.insertOrderedNoDupes(o.info);
			o = o.next;
		}
		o = setB.ordered;
		while (o != null) {
			setAUB.insertOrderedNoDupes(o.info);
			o = o.next;
		}
		
		System.out.print("\tsetAUB=");
		setAUB.display(setAUB.ordered);
		s.close();
	}
}