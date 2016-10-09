package com.mike.cpsc223j.project3;
/*
 * Name			Michael Romero, Anette Ulrichsen
 * Project No.	No.3 problem 4
 * Due Date		Sep 14, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This is a simple Triangle class with two methods for Problem 4.  
 * 			
 */

public class Triangle {
	public double computeArea(double a, double b, double c) {
		double p = (a + b + c)/2;
		return Math.sqrt(p*(p-a)*(p-b)*(p-c));
	}
	public double computePerimeter(double a, double b, double c) {
		return a + b + c;
	}
}