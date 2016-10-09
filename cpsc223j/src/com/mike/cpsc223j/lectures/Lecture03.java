package com.mike.cpsc223j.lectures;
import java.util.Scanner;
//import java.util.*;

public class Lecture03 {
	public static void main(String[] args) {
		// Draw a solid line
		for (int i=1; i<=10; ++i) {
			System.out.print('\u005F');
		}
		
		// Character class methods:  import java.util.Scanner OR import java.util.*
		char c = 'A';
		if (Character.isUpperCase(c)) {} // returns true if c = 'A' ... 'Z'
		if (Character.isLowerCase(c)) {} // returns true if c = 'a' ... 'z'
		if (Character.isLetter(c)) {} // returns true if c = 'A' ... 'Z', or 'a' ... 'z'
		if (Character.isDigit(c)) {} // returns true if c = '0' ... '9'
		if (Character.isLetterOrDigit(c)) {} // returns true if letter or digit.
		if (Character.isWhitespace(c)) {} // any whitespace char..
		// vs c++
		// include<iostream>
		// if (isupper(c)), if(islower(c)), if(isalpha(c)), 
		// if(isdigit(c)), if(isalnum(c)), if(isspace(c))
		
		// Strings
		String aName = "John";
		String yourName;
		Scanner read = new Scanner(System.in);
		System.out.print("Enter a name: ");;
		yourName = read.nextLine();
		// Compare two strings
		if (aName.equals(yourName)) {} 
		read.close();
		// String length
		int len = aName.length();
		
		// Read a sentence.. find the number of upper case letters, and # of words.
		// I/O -  Enter a sentence i.e. Enter a sentence: Today Is Thursday,
		// num of uppercase is 3, num of words is 3. to count words, we count spaces + 1.
		int Uc=0, Wc=0;
		// char c; duplicate var c
		String st;
		System.out.print("Enter a sentence: ");;
		st=read.nextLine();
		for (int i=0; i< st.length(); ++i) {
			c = st.charAt(i);
			if (Character.isUpperCase(c)) Uc++;
			if (Character.isWhitespace(c)) Wc++;
		}
		// Generating random numbers
		// import java.lang.*;
		for (int i = 1; i<=5; ++i) {
			System.out.println((int)(Math.random()*10)); // returns a number between 0.0 - 1.0
			// random() returns # between 0.0 and 1.0
			// random()*10 returns # between 0.0 and 10.0
			// (int)(random()*10) returns # between 0 and 10
		}
	}
}
