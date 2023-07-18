package com.telusko.demo;

import java.util.Scanner;

public class fibonacciSeries {
	
	static Scanner s = new Scanner(System.in);
	public static void main(String[]args) {
		
		System.out.println("Enter the Number Term");
		int number= s.nextInt();
		
		System.out.println("The Fibonacci Series for the given Term: ");
		PrintfibonacciSeries(number);
		
	}
		
		public static void PrintfibonacciSeries(int number) {
			int firstterm=0;
			int secondterm=1;
			
			for (int i=3; i<=number; i++) {
				int nextterm= firstterm+secondterm;
				System.out.println(nextterm +" ");
				
				firstterm=secondterm;
				secondterm=nextterm;
				
			}
		
		
		}

}
