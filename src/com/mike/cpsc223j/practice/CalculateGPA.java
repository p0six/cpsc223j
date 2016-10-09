package com.mike.cpsc223j.practice;
import java.util.Scanner;
public class CalculateGPA {
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		// Factoring in Rio Salado, Mid-Fall 2016
		double lastCheckedQualPoints = 385.2; 
		int lastCheckedUnitCount = 103; 
		System.out.printf("Current GPA = %.4f.%n", lastCheckedQualPoints / lastCheckedUnitCount);
		System.out.print("Enter Total Completed Quality Points (" + (lastCheckedQualPoints) + ") : ");
		double qualityPoints = s.nextDouble(), gradePoints; s.nextLine();
		System.out.print("Enter Total Completed Units (" + (lastCheckedUnitCount) + ") : ");
		int units, unitCount = s.nextInt(); s.nextLine();
		System.out.print("How many classes taken this semester? ");
		int classCount = s.nextInt(); s.nextLine();
		for (int i = 0; i < classCount; i++) {
			System.out.print("(Expected|Actual) Grade Points for Class " + (i+1) + "? ");
			gradePoints = s.nextInt(); s.nextLine();
			System.out.print("Units for Class " + (i + 1) + "? ");
			units = s.nextInt(); s.nextLine();
			gradePoints *= units;
			unitCount += units;
			qualityPoints += gradePoints;
		}
		System.out.printf("Your GPA is %.4f.", qualityPoints / unitCount);
		s.close();
	}
}