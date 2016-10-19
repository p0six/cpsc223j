package com.mike.cpsc223j.project8;

/*
 * Name			Michael Romero
 * Project No.	No.8 part 2
 * Due Date		Oct 20, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This is the Binary Search Tree class used by our 
 * 				Problem02, which uses integers for search key.
 */

public class BST {
	node root;
	public BST() { 
		root = null; 
	}
	
	public node searchTree(int val) {
		if (root == null) {
			return null;
		}
		node current = root;
		while (current != null) {
			if (val < current.info) {
				current = current.left;
			} else if (val > current.info) {
				current = current.right;
			} else {
				return current;
			}
		}
		return null;
	}

	public void insert (int val, String val2, float val3) {
		node p = new node(val, val2, val3);
		if (root == null) {
			root = p; return;
		} 
		node current = root;
		node parent = null;
		while (true) {
			parent = current;
			if (val < current.info) {
				current = current.left;
				if (current == null) { parent.left = p; return; }
			} else {
				current = current.right;
				if (current == null) {
					parent.right = p; return;
				}
			}
		}
	} 

	public void displayInOrder(node p) {
		if (p != null) {
			if (p == root) {
				System.out.println("ID\tNAME\t\tBALANCE");
			}
			displayInOrder(p.left);
			System.out.printf("%d\t%s\t%.2f\n", p.info, p.name, p.balance);
			displayInOrder(p.right);
		}
	}

	public int countNodes(node p) {
		if (p == null) {
			return 0;
		} else {
			return 1 + countNodes(p.left) + countNodes(p.right);
		}
	}

	public void displaySideway(node p, int s) {
		if (p != null) {
			displaySideway(p.right, s += 5);
			for (int i = 1; i <= s; ++i) {
				System.out.print(" ");
			} 
			System.out.println(p.info);
			displaySideway(p.left, s);
		}
	}

	public static int max(int a, int b) {
		return (a>b)?a:b;
	}

	public int countHeight(node p) {
		if (p == null) {
			return 0;
		} else {
			return 1 + max(countHeight(p.left), countHeight(p.right));
		} 
	}
}