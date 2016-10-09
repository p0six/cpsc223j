package com.mike.cpsc223j.lectures;

public class Lecture06 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println("The 50th Fibonacci number is " + NRFib(50));;
		long finish = System.currentTimeMillis();
		System.out.println("Run-time=" + (finish-start));;
		
		//start = System.currentTimeMillis();
		//System.out.println("The 50th Fibonacci number is " + Fib(50));;
		//finish = System.currentTimeMillis();
		//System.out.println("Run-time=" + (finish-start));;
		
		String x = "123";
		int g = Integer.parseInt(x);
		System.out.println(g+10);
		
		String y = "123.45";
		float f = Float.parseFloat(y);
		System.out.println(f+1.3);
		
		Employee[] a = new Employee[2]; // instantiating array of Employee class below
		a[0] = new Employee("Michael Romero", 38);
		a[1] = new Employee("Anette Ulrichsen", 21);
		
		for (int i = 0; i < a.length; ++i) {
			System.out.println(a[i].getName() + "\t" + a[i].getAge());
		}
		
	}
	public static long Fib(int n) {
		if (n==1 || n==2) {
			return 1;
		} else {
			return Fib(n-1) + Fib(n-2); // runtime ridiculous
		}
	}
	
	public static long NRFib(int n) {
		long f1=1,f2=1,fn=0;
		for (int i = 3; i<=n; i++) {
			fn=f1+f2;
			f1=f2;
			f2=fn;
		}
		return fn; // runtime = O(n)
	}
}

class Employee {
	private String name;
	private int age;
	public Employee(String x, int y) {
		name = x; age = y;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}