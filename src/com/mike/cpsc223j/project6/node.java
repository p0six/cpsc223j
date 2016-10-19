package com.mike.cpsc223j.project6;

public class node {
	int info;
	String name;
	node next;
	public node(int val) {
		info = val; next = null; name = null;
	}
	public node(int val, String val2) {
		info = val; name = val2; next = null;
	}
}