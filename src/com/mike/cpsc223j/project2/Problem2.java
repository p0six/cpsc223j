package com.mike.cpsc223j.project2;
import java.util.*;

/*
 * Name			Michael Romero, Anette Ulrichsen
 * Project No.	No.2 part 2
 * Due Date		Sep 6, 2016
 * Professor	Ray Ahmadnia
 * 
 * Purpose:		This program demonstrates handling input from user, processing a
 * 				string, one character at a time.
 */

public class Problem2 {
	public static void main (String[] args) {
		Scanner read = new Scanner(System.in);
		
		char c;
		int i = 0;
		int upper = 0;
		int digit = 0;
		int vowel = 0;
		String sentence;		
		
		System.out.print("Enter a sentence: ");
		sentence = read.nextLine();

		while (i < sentence.length())
		{
			c = sentence.charAt(i);
			if(Character.isUpperCase(c))
				upper++;
			if(Character.isDigit(c))
				digit++;
			
			c = Character.toLowerCase(c);
			if((c == 'a')||(c == 'e')||(c == 'i')||(c == '0')||(c == 'u'))
				vowel++;	
			i++;
		}	
		System.out.print("Number of uppercase letters: "+upper);
		System.out.println();
		System.out.print("Number of digits: "+digit);
		System.out.println();
		System.out.print("Number of vowels: "+vowel);
		
		read.close();	
	}
}
