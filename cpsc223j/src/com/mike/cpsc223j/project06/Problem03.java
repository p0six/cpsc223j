package com.mike.cpsc223j.project06;

/*
 * Name			Michael Romero
 * Project No.	No.6 part 3
 * Due Date		Oct 13, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This program demonstrates using an ordered queue linked list.
 */

public class Problem03 {
	public static void main(String[] args) {
		LinkedList q = new LinkedList();
		q.insertQueue(10, "Bob");
		q.insertQueue(7, "Mary");
		q.insertQueue(5, "Bill");
		q.insertQueue(15, "Tom");
		q.insertQueue(3, "Jack");
		
		LinkedList o = new LinkedList();
		o.insertOrdered(10, "Bob");
		o.insertOrdered(7, "Mary");
		o.insertOrdered(5, "Bill");
		o.insertOrdered(15, "Tom");
		o.insertOrdered(3, "Jack");

		System.out.println("The queue before the Chair calls students one-by-one");
		q.displayWithName(q.queue);
		
		while (o.ordered != null) {
			node ordered = o.ordered;
			node queue = q.queue; node tempq = queue;
			int counter = 0;
			while (!ordered.name.equals(queue.name)) {
				tempq = queue;
				queue = queue.next;
				counter++;
			}
			
			if (counter == 0) {
				// we didn't iterate above at all, item to destroy is at head
				q.queue = q.queue.next;
			} else {
				tempq.next = queue.next;
				queue = null;
			}
			
			System.out.println(o.ordered.name + " is served, now the queue is");
			o.ordered = o.ordered.next;
			q.displayWithName(q.queue);
		}
		System.out.println("All served :)");
	}
}