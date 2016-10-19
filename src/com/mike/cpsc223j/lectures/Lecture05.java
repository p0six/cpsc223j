package com.mike.cpsc223j.lectures;

import java.util.Scanner;

public class Lecture05 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// Arrays
		// Declaration and initialization
		int[] a = {1,3,5,2,7};
		for (int i=0; i< a.length; i++) { // a.length, NOT a.length();
			System.out.print(a[i] + " ");
		}
		
		// Declaration
		int[] b = new int[4];
		b[0]=b[1]=b[2]=b[3]=5;
		readData(b);
		
		// Making copy of array a
		int[] c = new int[4];
		c = (int[]) b.clone(); // Need to cast to int[]
		for (int i=0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
		
		// Two Dimensional Arrays
		int[][] d = { {1,2,3}, {4,5,6}, {7,8,9}};
		display(d);
		// if we don't have data to initialize with...
		int[][] e = new int[5][5];
		readData(e);
		s.close();
		
		// Three Dimensional Arrays
		int[][][] f = new int[3][3][2]; // row,col,slice
		display(f);
		
		// Ragged Arrays // when not all rows have same # of elements. 
		int[][] g = new int[3][]; // do not specify amount of rows..
		g[0] = new int[] {1,2,3,4,5};
		g[1] = new int[] {6,7,8};
		g[2] = new int[] {9,10,11,12};
		for (int row = 0; row < g.length; row++) {
			for (int col = 0; col < g[row].length; col++) {
				System.out.print(g[row][col] + " ");
			}
			System.out.println();
		}
		
	}
	public static void readData(int[] x) { // never have to pass length of array
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < x.length; i++) {
			System.out.print("Enter a number: ");
			x[i] = s.nextInt();
		}
		s.close();
	}
	public static void readData(int[][] x) {
		Scanner s = new Scanner(System.in);
		for (int row=0; row < x.length; ++row) {
			for (int col = 0; col < x[row].length; col++) {
				x[row][col] = s.nextInt();
			}
		}
		s.close();
	}
	public static void display(int[][][] x) {
		for (int row=0; row < x.length; row++) {
			System.out.println("row = " + row);
			for (int col = 0; col < x[row].length; col++ ) { // ?
				for (int slice = 0; slice < x[row][col].length; slice++) {
					System.out.print(x[row][col][slice]);
				}
				System.out.println(x);
			}
		}
	}
	public static void display(int[][] x) {
		for (int row=0; row < x.length; ++row) {
			for (int col = 0; col < x[row].length; col++) {
				System.out.print(x[row][col] + " ");
			}
			System.out.println();
		}
	}

}
