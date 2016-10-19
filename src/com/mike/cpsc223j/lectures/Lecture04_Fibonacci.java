package com.mike.cpsc223j.lectures;

public class Lecture04_Fibonacci {
	// Fibonacci numbers
	// 1 1 2 3 5 8 13 21 ...
	// fib(1) = 1; fib(2) = 1; if n > 1, fib(n) = fib(n-1) + fib(n-2)
	public static void main (String[] args) {
		System.out.println("The 10th Fibonacci number is " + Fib(10)); // 55
	}
	static long Fib(int n) {
		if (n == 1 || n == 2) return 1;
		else {
			return Fib(n-1) + Fib (n-2);
		}
	}
}
