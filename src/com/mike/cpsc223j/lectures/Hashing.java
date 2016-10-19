package com.mike.cpsc223j.lectures;

public class Hashing {
	node[] h = new node[5];
	public Hashing() {
		for (int i = 0; i < h.length; i++) {
			h[i] = null;
		}
	}
	
	public int HashFun(int val) {
		return val % h.length;
	}
	
	public void insertHash(int val) {
		int i = HashFun(val);
		node temp = new node(val);
		temp.next = h[i];
		h[i] = temp;
	}
	
	public void display() {
		node p;
		for (int i = 0; i < h.length; i++) {
			p = h[i];
			while (p != null) {
				System.out.print(p.info + "->");
				p = p.next;
			}
			System.out.println("null");
		}
	}
	
	public int searchHash(int val) { // need to finish writing this...
		int i = HashFun(val);
		return i;
	}
	
	public static void main(String[] args) { // this needs to populate hash table
		
	}
}
