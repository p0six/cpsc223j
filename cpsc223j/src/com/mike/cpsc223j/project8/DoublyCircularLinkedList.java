package com.mike.cpsc223j.project8;

/*
 * Name			Michael Romero
 * Project No.	No.8
 * Due Date		Oct 20, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This is a doubly linked list class used by Problem03.
 */

public class DoublyCircularLinkedList {
	nodeDoubleLinkedList head, tail;
	DoublyCircularLinkedList() {
		head = tail = null;
	}
	
	public static void displayCircularLinkedList(DoublyCircularLinkedList list) {
		nodeDoubleLinkedList p = list.head;
		do {
			System.out.println(p.info + "->");
			p = p.next;
		} while (p != list.head);
	}
	
	public void insertCircularLinkedListStack(String val) { // might actually be correct
		nodeDoubleLinkedList p = new nodeDoubleLinkedList(val);
		if (head == null) {
			head = tail = p;
			head.next = p;
			head.back = p;
		} else {
			p.next = head;
			head.back = p;
			p.back = tail;
			tail.next = p;
			head = p;	
		}		
	}
	
	public void insertCircularLinkedListQueue(String val) { // might actually be correct
		nodeDoubleLinkedList p = new nodeDoubleLinkedList(val);
		if (head == null) {
			head = tail = p;
			head.next = p;
			head.back = p;
		} else {
			head.next = p;
			p.back = head;
			p.next = tail;
			tail.back = p;
			head = p;
		}		
	}
	
	public void displayCircularDoublyLinkedListStackLtoR(DoublyCircularLinkedList l) { // jacked up
		nodeDoubleLinkedList p = l.tail;
		do {
			System.out.print(p.info);
			if (p.back != tail) { System.out.print("->"); }
			p = p.back;
		} while (p != l.tail);
	}
	
	public void displayCircularDoublyLinkedListStackRtoL(DoublyCircularLinkedList l) { // lookin good
		nodeDoubleLinkedList p = l.head;
		do {
			System.out.print(p.info);
			if (p.next != head) { System.out.print("->"); }
			p = p.next;
		} while (p != head);
	}
}