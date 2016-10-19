package com.mike.cpsc223j.project6;

public class LinkedList {
	node stack, queue, ordered;
	LinkedList() {
		stack = null;
		queue = null; // always the head, we use temp 'p' to traverse and add to end
		ordered = null;
	}
	public void insertStack(int val) {
		// insert val in front of list
		node temp = new node(val);
		temp.next = stack;
		stack = temp;
	}
	public void insertQueue(int val) {
		// insert val at the rear of list
		node temp = new node(val);
		node p;
		if (queue == null) {
			queue = temp;
		} else {
			p = queue;
			while (p.next != null) {
				p = p.next;
			}
			p.next = temp;
		}
	}
	public void insertQueue(int val, String val2) {
		// insert val at the rear of list
		node temp = new node(val, val2);
		node p;
		if (queue == null) {
			queue = temp;
		} else {
			p = queue;
			while (p.next != null) {
				p = p.next;
			}
			p.next = temp;
		}
	}
	public void insertOrdered(int val, String val2) { // 3 9 5 1 2
		// insert val in a position to keep the list a ordered list
		node temp = new node(val, val2);
		// find p (node larger than val) and q (node smaller than val)
		node p, q;
		p = q = ordered;
		if (ordered == null) {
			ordered = temp;	
		} else {
			while (p != null && p.info < val) {
				q = p;
				p = p.next;
			} // consider what happens when we have an empty list, or when inserting at end			
			if (p == null) { // p traversed to end of list.. val is largest
				q.next = temp;
			} else if (p == ordered) { // there was an item in the list and its bigger than val
				temp.next = p;
				ordered = temp;
			} else { // p is somewhere in the middle of the list
				temp.next = p; q.next = temp;
			}
		}
	}
	public void insertOrdered(int val) { // 3 9 5 1 2
		// insert val in a position to keep the list a ordered list
		node temp = new node(val);
		// find p (node larger than val) and q (node smaller than val)
		node p, q;
		p = q = ordered;
		if (ordered == null) {
			ordered = temp;	
		} else {
			while (p != null && p.info < val) {
				q = p;
				p = p.next;
			} // consider what happens when we have an empty list, or when inserting at end			
			if (p == null) { // p traversed to end of list.. val is largest
				q.next = temp;
			} else if (p == ordered) { // there was an item in the list and its bigger than val
				temp.next = p;
				ordered = temp;
			} else { // p is somewhere in the middle of the list
				temp.next = p; q.next = temp;
			}
		}
	}
	public void display(node p) {
		while (p != null) {
			System.out.print(p.info + "-->");
			p = p.next;
		}
		System.out.println("null");
	}
	public void displayWithName(node p) {
		System.out.print("queue-->");
		while (p != null) {
			System.out.print(p.name + "," + p.info + "-->");
			p = p.next;
		}
		System.out.println("NULL");
	}
	public static void main(String[] args) {
		int[] a = {3,9,5,1,2};
		LinkedList myStack = new LinkedList();
		for (int i = 0; i < a.length; i++) {
			myStack.insertStack(a[i]);
		}
		System.out.println("Content of stack: ");
		myStack.display(myStack.stack);
		
		LinkedList myQueue = new LinkedList();
		for (int i = 0; i < a.length; i++) {
			myQueue.insertQueue(a[i]);
		}
		System.out.println("Content of queue: ");
		myQueue.display(myQueue.queue);

		LinkedList myOrderedList = new LinkedList();
		for (int i = 0; i < a.length; i++) {
			myOrderedList.insertOrdered(a[i]);
		}
		System.out.println("Content of ordered list: ");
		myOrderedList.display(myOrderedList.ordered);

		// delete the first node
		// p = list;
		// list = p.next;
		// p = null; // same as 'delete p' in c++
	}
}