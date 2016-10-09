package com.mike.cpsc223j.lectures;

public class Lecture09 {
	public static void main(String[] args) {
		// Hashing is a method of searching
		// Data: 32, 35, 17, 14, 45, 34, 13, 19, 20
		// hashing allows searches to go faster
		// hash function: i = data % 5
		// has table is an array of size 5
		// h[0], h[1], h[2], h[3], h[4] each get set to null.
		// 32 mod 5 gets assigned to h[2], 35 mod 5 gets assigned to h[0]
		// 17 mod 5 gets assigned to h[2] as the second node of the h[2] linked list
		// newest entry becomes first node in the linked list for the hash table of
		// that particular entry, original entry gets pushed behind it. 
		// similar to a stack
		// now if i want to find an int, i plugin the <int mod 5> which takes me 
		// to the hash table entry that corresponds to the integer.  i can then
		// search for the integer in much less time than searching the entire list
		// this is useful when dealing with large amounts of data
		// eventually we can make the hash table use binary search trees instead of
		// linked lists which will make it even faster.
		// look at "Hashing.java", which also utilizes "node.java"
		
		// delete the first node
		// p = list;
		// list = p.next;
		// p = null; // same as 'delete p' in c++
				
				
	}
}
