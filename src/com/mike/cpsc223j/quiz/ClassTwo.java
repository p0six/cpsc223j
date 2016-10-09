package com.mike.cpsc223j.quiz;
/*
 * Name			Michael Romero
 * Quiz No. 2
 * Due Date		Sep 15, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		Instantiate objects using different constructors, call methods.
 */
public class ClassTwo {
	int x,y,z;
	public ClassTwo() {
		x = 10;
	}
	public ClassTwo(int i, int j) {
		y = i;
		z = j;
	}
	public void displayXYZ(int i, int j, int k) {
		System.out.println("These are the values of x, y, and z");
		System.out.println("\tX=" + i + "\tY=" + j + "\tz=" + k);
	}
	public void total(int i, int j, int k) {
		System.out.println("The total of x, y, and z is " +  (i + j + k) + " and their average is " + average(i,j,k));
	}
	public int average(int i, int j, int k) {
		return (i + j + k)/3;
	}
	public void maximum(int i, int j, int k) { // needs work
		int max = i;
		if (j > max) max = j;
		if (k > max) max = k;
		System.out.println("The maximum of x, y, and z is " + max);
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
}
