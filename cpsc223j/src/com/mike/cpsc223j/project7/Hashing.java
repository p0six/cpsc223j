package com.mike.cpsc223j.project7;

public class Hashing {
	nodeAccount[] h = new nodeAccount[5];
	public Hashing() {
		for (int i = 0; i < h.length; i++) {
			h[i] = null;
		}
	}
	
	public int HashFun(int val) {
		return val % h.length;
	}
	
	public void insertHash(int val, String n, double bal) {
		int i = HashFun(val);
		nodeAccount temp = new nodeAccount(val, n, bal);
		temp.next = h[i];
		h[i] = temp;
	}
	
	public void display() {
		nodeAccount p;
		for (int i = 0; i < h.length; i++) {
			p = h[i];
			while (p != null) {
				System.out.printf("%d,%s,%.2f->", p.info,p.name,p.balance);
				p = p.next;
			}
		}
		System.out.println("NULL");
	}
	
	public nodeAccount searchHash(int val) {
		nodeAccount n = h[HashFun(val)];
		while (n != null) {
			if (n.info == val) {
				return n;
			} else {
				n = n.next;
			}
		}
		return null;
	}
	
	public static void main(String[] args) { // this needs to populate hash table
		
	}
}