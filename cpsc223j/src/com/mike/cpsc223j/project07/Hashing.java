package com.mike.cpsc223j.project07;

/*
 * Name			Michael Romero
 * Project No.	No.7
 * Due Date		Oct 13, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This is a Hashing class which is used in Problem01 and Problem02.
 */

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
}