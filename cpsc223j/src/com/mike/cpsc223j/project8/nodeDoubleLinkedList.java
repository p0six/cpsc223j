package com.mike.cpsc223j.project8;

/*
 * Name			Michael Romero
 * Project No.	No.8 part 3
 * Due Date		Oct 20, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This is a doubly linked node class used by Problem03.
 */

public class nodeDoubleLinkedList { //from Lecture10
	String info;
	nodeDoubleLinkedList next;
	nodeDoubleLinkedList back;
	public nodeDoubleLinkedList(String n) {
		info = n;
		next = null;
		back = null;
	}
}
