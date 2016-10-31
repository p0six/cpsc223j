package com.mike.cpsc223j.project05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * Name			Michael Romero, Anette Ulrichsen
 * Project No.	No.5 problem 1
 * Due Date		Sep 29, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This program demonstrates using text files as input, as well as using
 * 				getters of the PERSON class to return private vars.
 */

public class Problem01 {
	private static PERSON[] a = new PERSON[6];

	public static void main(String[] args) {
		try {
			copyData("data.txt");
		} catch (IOException e) {
			System.out.print(e.getMessage());	
		}		
		display(a);
		float ageAvg = computeAgeAverage();
		float gpaAvg = computeGpaAverage();
		display(ageAvg, gpaAvg);
		display(a, gpaAvg);
	}
	
	public static void copyData(String f) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("src//com//mike//cpsc223j//project5//" + f));
		String line;
		int counter = 0;
		while ((line = in.readLine()) != null) {
			String token[] = line.split("\\s");
			int age = Integer.parseInt(token[1]);
			float gpa = Float.parseFloat(token[2]);
			a[counter] = new PERSON(token[0], age, gpa) ;
			counter++;
		}
		in.close();	
	}
	
	public static void display(PERSON[] x) {
		// This method will only display NAME of TEENAGERS (13<=age<=19)
		for (int i = 0; i < x.length; i++) {
			if (x[i].getAge() < 20 && x[i].getAge() > 12) {
				System.out.println(x[i].getName());
			}
		}
	}
	public static float computeAgeAverage() {
		float ageAvg = 0;
		for (int i = 0; i < a.length; i++) {
			ageAvg += a[i].getAge();
		}
		return ageAvg / a.length;
	}
	
	public static float computeGpaAverage() {
		float gpaAvg = 0;
		for (int i = 0; i < a.length; i++) {
			gpaAvg += a[i].getGpa();
		}
		return gpaAvg / a.length;
	}
	
	public static void display(Float ageAvg, Float gpaAvg) {
		System.out.printf("Age Average: %.2f\n", ageAvg);
		System.out.printf("GPA Average: %.2f\n", gpaAvg);
	}
	
	public static void display(PERSON[] a, Float gpaAvg) {
		for (int i = 0; i < a.length; i++) {
			if (a[i].getGpa() > gpaAvg) {
				System.out.println(a[i].getName() + "\t" + a[i].getAge() + "\t" + a[i].getGpa());
			}
		}
	}
}