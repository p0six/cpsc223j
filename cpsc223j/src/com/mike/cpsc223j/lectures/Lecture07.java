package com.mike.cpsc223j.lectures;
import java.io.*;

public class Lecture07 {
	public static void main(String[] args) {
		String file = "src//com//mike//cpsc223j//lectures//data.txt";
		try {
			displayFile(file);
		} catch (IOException e) {
			System.out.print(e.getMessage());
		}
		
		try {
			copy(file, file + "2");
		} catch (IOException e) {
			System.out.print(e.getMessage());
		}
	}
	public static void displayFile(String f) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(f));
		String line;
		while ((line = in.readLine()) != null) {
			String token[] = line.split(" ");
			int age = Integer.parseInt(token[1]);
			float gpa = Float.parseFloat(token[2]);
			System.out.println(token[0] + "\t" + age + "\t" + gpa);
		}
		in.close();	
	}
	public static void copy(String fname, String fname2) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader(fname));
		BufferedWriter out = new BufferedWriter(new FileWriter(fname2));
		String line;
		while ((line = in.readLine()) != null) {
			out.write(line); 
			out.newLine();
		}
		in.close(); out.close();
	}
}