package com.mike.cpsc223j.project6;

/*
 * Name			Michael Romero
 * Project No.	No.6
 * Due Date		Oct 13, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This is a simple node class which will be used within our linked list.
 */

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