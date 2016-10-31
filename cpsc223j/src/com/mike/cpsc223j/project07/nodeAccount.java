package com.mike.cpsc223j.project07;

public class nodeAccount {
	int info;
	String name;
	double balance;
	nodeAccount next;
	public nodeAccount(int val, String n, double bal) {
		info = val; name = n; balance = bal; next = null;
	}
}