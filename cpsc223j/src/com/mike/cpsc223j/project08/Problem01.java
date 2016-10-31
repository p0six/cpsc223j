package com.mike.cpsc223j.project08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * Name			Michael Romero
 * Project No.	No.8 part 1
 * Due Date		Oct 20, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This is the driver class for the solution to Problem01.
 */

public class Problem01 {

	public static void main(String[] args) {
		try {
			TreeString myTreeString = readInput("monthDays.txt");
			myTreeString.displayInOrder(myTreeString.root);
			System.out.println("Leaves of the tree are: " + myTreeString.findLeaves()); // no children
			System.out.println("Parents with two children are: " + myTreeString.findTwoChildren()); // two children
			System.out.println("Parents with only one child are: " + myTreeString.findOneChild()); // one child
			System.out.println("There are " + myTreeString.countNodes() + " nodes in the tree");
			System.out.println("The height of tree is " + myTreeString.countHeight());
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}
	
	public static TreeString readInput(String f) throws IOException {
		TreeString x = new TreeString();
		BufferedReader in = new BufferedReader(new FileReader("src//com//mike//cpsc223j//project8//" + f));
		String line;
		while ((line = in.readLine()) != null) {
			String token[] = line.split("\\s");
			int days = Integer.parseInt(token[1]);
			x.insert(token[0], days);
		}
		in.close();	
		return x;
	}
}