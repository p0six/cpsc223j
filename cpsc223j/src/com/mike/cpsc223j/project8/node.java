package com.mike.cpsc223j.project8;

/*
 * Name			Michael Romero
 * Project No.	No.8 part 2
 * Due Date		Oct 13, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This is a node class used by our Problem02.
 */

public class node {
		int info; 
		String name;
		float balance;
		node left; 
		node right;
		public node(int val, String val2, float val3) { 
			left = right = null;
			info = val;
			name = val2;
			balance = val3;
		}
}