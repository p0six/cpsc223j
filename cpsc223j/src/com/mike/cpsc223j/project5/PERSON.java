package com.mike.cpsc223j.project5;

/*
 * Name			Michael Romero, Anette Ulrichsen
 * Project No.	No.5 problem 1
 * Due Date		Sep 29, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This is the "PERSON" class which we use within Problem01.
 */

public class PERSON {
	private String name;
	private int age;
	private float gpa;
	
	PERSON(String n, int a, float g) {
		name = n; age = a; gpa = g;
	}
	public String getName() { return name; }
	public int getAge() { return age; }
	public float getGpa() { return gpa; }
}