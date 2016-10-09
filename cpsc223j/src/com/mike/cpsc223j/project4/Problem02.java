package com.mike.cpsc223j.project4;
import java.util.Random;
/*
 * Name			Michael Romero, Anette Ulrichsen
 * Project No.	No.4 problem 2
 * Due Date		Sep 22, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		Demonstrating how to use the "Random" class. 
 */
public class Problem02 {
	public static void main(String[] args) {
		String[] fortune={"Study more","Go to movie","Relax","Sleep"};
		Random r = new Random();
		int x = 0;
		while (x != 3) {
			x = r.nextInt(fortune.length);
			System.out.println("\t" + fortune[x]);
		} 
		System.out.println("OK");
	}
}