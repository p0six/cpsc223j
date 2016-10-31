package com.mike.cpsc223j.project04;
import java.util.Arrays;
import java.util.Scanner;
/*
 * Name			Michael Romero, Anette Ulrichsen
 * Project No.	No.4 problem 3
 * Due Date		Sep 22, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This program demonstrates using Java's built in Arrays classe for Binary Search
 * 				and Array Sorting.
 */
public class Problem03 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] numbers = new int[7];
		populateArray(numbers, s);
		displayArray(numbers);
		Arrays.sort(numbers);
		displayArray(numbers);
		System.out.print("Enter an int number: ");
		int searchFor = s.nextInt();
		int searchResult = Arrays.binarySearch(numbers, searchFor);
		if (searchResult >= 0) {
			System.out.println(searchFor + " is at location " + searchResult + " of the sorted array");
		} else {
			System.out.println(searchFor + " was not found in the sorted array.");
		} 
		s.close();
	}
	public static void populateArray(int[] x, Scanner s) {
		System.out.print("Enter 7 int numbers: ");
		for (int i = 0; i < x.length; i++) {
			x[i] = s.nextInt();
		}
		s.nextLine();
	}
	public static void displayArray(int[] x) {
		System.out.print("Original data: ");
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
	}
}