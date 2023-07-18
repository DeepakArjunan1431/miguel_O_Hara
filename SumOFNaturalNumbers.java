package com.telusko.demo;

import java.util.Scanner;

public class SumOFNaturalNumbers {
	
	static Scanner s = new Scanner(System.in);
	public static void main(String[]args) {
		
		System.out.println("Enter the Natural number : ");
		int m=s.nextInt();
		
		int sum= Calulatatesum(m);
		System.out.println("The sum of the given natural number is " + sum);
	}
		
		public static int Calulatatesum(int m) {
	
			int sum=0;
			for (int i=1; i<=m; i++) {
				
				sum =sum + i;
				
			}
		return sum;
	}

		
		
		
		

}
