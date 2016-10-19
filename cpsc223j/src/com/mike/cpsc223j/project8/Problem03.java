package com.mike.cpsc223j.project8;

/*
 * Name			Michael Romero
 * Project No.	No.8 part 1
 * Due Date		Oct 20, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This is the driver class for the solution to Problem03.
 */

public class Problem03 {
	public static void main(String[] args) {
		DoublyCircularLinkedList l = new DoublyCircularLinkedList();
		l.insertCircularLinkedListStack("January");
		l.insertCircularLinkedListStack("February");
		l.insertCircularLinkedListStack("March");
		l.insertCircularLinkedListStack("April");
		l.insertCircularLinkedListStack("May");
		l.insertCircularLinkedListStack("June");
		l.insertCircularLinkedListStack("July");
		l.insertCircularLinkedListStack("August");
		l.insertCircularLinkedListStack("September");
		l.insertCircularLinkedListStack("October");
		l.insertCircularLinkedListStack("November");
		l.insertCircularLinkedListStack("December");
		l.displayCircularDoublyLinkedListStackLtoR(l); 
		System.out.println();
		l.displayCircularDoublyLinkedListStackRtoL(l); // success
	}
}