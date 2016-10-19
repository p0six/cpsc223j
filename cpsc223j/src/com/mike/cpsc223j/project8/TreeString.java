package com.mike.cpsc223j.project8;

/*
 * Name			Michael Romero
 * Project No.	No.8 part 1
 * Due Date		Oct 20, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This is the our BST which uses Strings and part of our solution
 * 				to Problem01.
 */

public class TreeString {
	StringNode root;
	public TreeString() { 
		root = null; 
	}

	public void insert (String val, int val2) {
		StringNode p = new StringNode(val, val2);
		if (root == null) {
			root = p; return;
		} 
		StringNode current = root;
		StringNode parent = null;
		while (true) {
			parent = current;
			if (val.compareTo(current.info) < 0) {
				current = current.left;
				if (current == null) { 
					parent.left = p; 
					return; 
				}
			} else {
				current = current.right;
				if (current == null) {
					parent.right = p; return;
				}
			}
		}
	} 

	public void displayInOrder(StringNode p) {
		if (p == root) {
			System.out.println("Month's Name\tNo. Days");
			System.out.println("------------------------");
		}
		if (p != null) {
			displayInOrder(p.left);
			if (p.info.length() > 7) {
				System.out.println(p.info + "\t" + p.info2);
			} else {
				System.out.println(p.info + "\t\t" + p.info2);
			}
			displayInOrder(p.right);
		}
	}
	
	public int countNodes() {
		return countNodes(root);
	}

	private int countNodes(StringNode p) {
		if (p == null) {
			return 0;
		} else {
			return 1 + countNodes(p.left) + countNodes(p.right);
		}
	}
	
	public void displaySideway(StringNode p, int s) {
		if (p != null) {
			displaySideway(p.right, s += 5);
			for (int i = 1; i <= s; ++i) {
				System.out.print(" ");
			} 
			System.out.println(p.info);
			displaySideway(p.left, s);
		}
	}
	
	public String findLeaves() {
		return findLeaves(root);
	}
	public String findOneChild() {
		return findOneChild(root);
	}
	
	public String findTwoChildren() {
		return findTwoChildren(root);
	}
	
	private String findLeaves(StringNode p) {
		if (p.left == null && p.right == null) {
			return p.info;
		} else if (p.left == null) {
			return findLeaves(p.right);
		} else if (p.right == null){
			return findLeaves(p.left);
		} else {
			return findLeaves(p.left) + " " + findLeaves(p.right);
		}
	}
	
	private String findOneChild(StringNode p) { // parents with one child
		if (p.left == null && p.right != null) {
			return p.info + " " + findOneChild(p.right);
		} else if (p.left != null && p.right == null) {
			return p.info + " " + findOneChild(p.left);
		} else if (p.left != null && p.right != null) {
			return findOneChild(p.left) + " " + findOneChild(p.right);
		} else {
			return "";
		}
	}
		
	private String findTwoChildren(StringNode p) {
		if (p.left != null && p.right != null) {
			return findTwoChildren(p.left) + " " + p.info + " " + findTwoChildren(p.right);
		} else if (p.left != null && p.right == null) {
			return findTwoChildren(p.left);
		} else if (p.left == null && p.right != null) {
			return findTwoChildren(p.right);
		} else {
			return "";
		}
	}

	public static int max(int a, int b) {
		return (a>b)?a:b;
	}

	public int countHeight() {
		return countHeight(root);
	}
	
	private int countHeight(StringNode p) {
		if (p == null) {
			return 0;
		} else {
			return 1 + max(countHeight(p.left), countHeight(p.right));
		} 
	}
}