package com.mike.cpsc223j.project4;
/*
 * Name			Michael Romero, Anette Ulrichsen
 * Project No.	No.4 problem 1
 * Due Date		Sep 22, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This program features multi-dimensional arrays (2D).
 */
public class Problem01 {
	public static void main(String[] args) {
		int[][] inventory = new int[4][4];
		int count=1;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (count == 10) count = 1;
				inventory[i][j] = count;
				count++;
			}
		}
		String[] colors = {"RED","BLACK","BLUE","GREEN"};
		System.out.println("This is our inventory");
		System.out.println("\tS M L XL");
		for (int i = 0; i < inventory.length; i++) {
			System.out.print(colors[i] + "\t");
			for (int j = 0; j < inventory[i].length; j++) {
				System.out.print(inventory[i][j] + " ");
			}
			System.out.println();
		}
		System.out.print("Total of all shirts ");
		int shirtCount = 0;
		for (int i = 0; i < inventory.length; i++) {
			for (int j = 0; j < inventory[i].length; j++) {
				shirtCount += inventory[i][j];
			}
		}
		System.out.println(shirtCount);
		int redCount = 0;
		System.out.print("Total of red shirts: ");
		for (int i = 0; i < inventory[0].length; i++) {
			redCount += inventory[0][i];
		}
		System.out.println(redCount);
		int largeCount = 0;
		System.out.print("Total of large shirts: ");
		for (int i = 0; i < inventory.length; i++) {
			largeCount += inventory[i][2];
		}
		System.out.println(largeCount);
	}
}