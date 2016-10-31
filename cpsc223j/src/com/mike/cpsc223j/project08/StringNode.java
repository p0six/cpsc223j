package com.mike.cpsc223j.project08;

/*
 * Name			Michael Romero
 * Project No.	No.8 part 1
 * Due Date		Oct 20, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This is the BST node class used for the solution to Problem01.
 */

public class StringNode {
		String info;
		int info2;
		StringNode left; 
		StringNode right;
		public StringNode(String val, int val2) { 
			left = right = null;
			info = val;  
			info2 = val2;
		}
}