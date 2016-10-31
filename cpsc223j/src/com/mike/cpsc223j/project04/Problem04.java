package com.mike.cpsc223j.project04;
/*
 * Name			Michael Romero, Anette Ulrichsen
 * Project No.	No.4 problem 4
 * Due Date		Sep 22, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This program demonstrates using some methods from the Math class. 
 */
public class Problem04 {
	public static void main(String[] args) {
		int[] testVals = {89,95,72,83,99,54,86,75,92,73,79,75,82,83,73};
		double testValsAvg = calcAverage(testVals);
		double testValsVar = variance(testVals, testValsAvg);
		System.out.println("calcAverage() = " + testValsAvg + ", variance() = " + testValsVar);
	}
	public static double calcAverage(int[] x) {
		double sum = 0;
		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		return sum / x.length;
	}
	public static double variance(int[] x, double y) {
		double variance = 0.0;
		for (int i = 0; i < x.length; i++) {
			variance += Math.pow((x[i] - y),2);
		}
		return variance / x.length;
	}
}