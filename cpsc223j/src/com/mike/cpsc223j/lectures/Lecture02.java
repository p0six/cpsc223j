package com.mike.cpsc223j.lectures;

public class Lecture02 {
	public static void main(String[] args) {
		// Unicode
		/*
		 * In c++, we convert Hex to Char (Base 10)
		 * In Java, we convert Unicode Char (Base 16)
		 * 
		 * System.out.print('A'); // A
		 * System.out.print('\0041') // Unicode 41, 00 signifies base 16.
		 * 
		 * ex: British Pound has ascii 163 @ Base 10.
		 * 163 @ Base 10 = 
		 * 
		 * 
		 * 128 64 32 16 8 4 2 1
		 * 1   0  1   0 0 0 1 1 // 163 in base 10 becomes 10100011
		 * 
		 * 1010  0011	// Split up into sets of 4
		 * 10     3 	// A3
		 * System.out.print('\u00A3'); // british pound symbol.. 
		 * To Display Ascii Table:
		 * for (int i=i; i <= 255; ++i) {
		 *   System.out.println(i+" "+(char)i);
		 * }
		 * 
		 * The ?: operators
		 * ----------------
		 * if (x>y)		
		 *   max = x;
		 * else
		 *   max = y;
		 * 
		 * The statement above is the same as: max=(x>y)?x:y
		 * 
		 * if (x>y && x>z)
		 * 	max = x;
		 * else if (y > z)
		 *   max = y;
		 * else
		 *   max = z;
		 * The statement above is the same as: max=(x>y&&x>z)? x:((y>z)?y:z);
		 * 
		 * 
		 * Loop Strucutres - Same as C++
		 * int sum = 0;
		 * for (int i=1;i<=5;++i) {
		 *   sum += i;
		 * }
		 * 
		 * or
		 * for (int sum=0, i=1; i<5, ++i) {
		 *   sum += i;
		 * }
		 * 
		 * or
		 * 
		 * int sum=0,i=1;
		 * for (;i<5, ++i) {
		 *   sum += i;
		 * }
		 * 
		 * or
		 * 
		 * int sum=0,i=1;
		 * for (;i<5;) {
		 *   sum += i;
		 *   ++i;
		 * }
		 * 
		 * or
		 * 
		 * int sum=0,i=1;
		 * for (;;) {
		 *   if(i>5) break;
		 *   sum += i;
		 *   ++i;
		 * }
		 * 
		 * Break & Continue
		 * ----------------
		 * for (int sum=0,i=1;i<=5;++i) {
		 *   if (i==3) break;
		 *   sum += i;
		 * }
		 * System.out.print(sum); // 3
		 * 
		 * for (int sum=0,i=1;i<=5;++i) {
		 *   if (i==3) continue; // causes this particular loop iteration to skip to next
		 *   sum += i;
		 * }
		 * System.out.print(sum); // 12 = 1 + 2 + 4 + 5, 3 is skipped
		 * 
		 * while loop
		 * ----------
		 * int sum=0;i=1;
		 * while(i<=5) {
		 *   sum += i;
		 * }
		 * 
		 * do-while loop
		 * -------------
		 * int sum=0;i=1;
		 * do {
		 *   sum += i;
		 *   ++i;
		 * } while (i<=5);
		 * 
		 * Math Methods
		 * ------------
		 * C++						Java				Meaning
		 * ---						----				-------
		 * sqrt(x)					Math.sqrt(x)		sqrt(x)
		 * pow(x,y)					Math.pow(x,y)		x^y
		 * abs(x)					Math.abs(x)			|x|
		 * exp(x)					Math.exp(x)			e^x
		 * log(x)					Math.log(x)			lnx		 <-- base e
		 * log10(x)					Math.log10(x)		logx     <-- base 10
		 * 
		 * note:
		 * loga @ base b = (loga @ base 10) / (logb @ 10)
		 * = (Math.log10(a)) / (Math.log10(b))
		 * 
		 * ceil(x)					Math.ceil(x)		x = smallest int >= x
		 * floor(x)					Math.floor(x)		x = largest int <= x
		 * 							Math.PI				3.14.......
		 * 							Math.E				2.17....
		 * 
		 * 
		 * 
		 */
	}
}


