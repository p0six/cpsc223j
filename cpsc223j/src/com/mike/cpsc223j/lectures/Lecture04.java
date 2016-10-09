package com.mike.cpsc223j.lectures;

import java.util.Scanner;


public class Lecture04 {
	// Constructors.. imagine Lecture04 is named "Circle"
	double radius;
	Lecture04(double r) {
		radius = r;
	}
	Lecture04() {
		Scanner read = new Scanner(System.in);
		System.out.println("Enter the value of radius: "); radius = read.nextDouble();
		read.close();
	}
	double area() {
		return Math.PI*radius*radius;
	}
	
	// Fibonacci numbers
	// 1 1 2 3 5 8 13 21 ...
	// fib(1) = 1; fib(2) = 1; if n > 1, fib(n) = fib(n-1) + fib(n-2)
}
