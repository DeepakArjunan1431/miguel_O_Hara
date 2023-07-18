package com.telusko.demo;

import java.util.Scanner;

public class EvenNUM_ntoM {
	
	static Scanner s = new Scanner(System.in);
	public static void main(String[]args) {
		
		System.out.println("Enter the number M : ");
		int m=s.nextInt();
		
		System.out.println("Enter the number N : ");
		int n=s.nextInt();
		
		System.out.println("Print Even numbers between "+ m + " to "+ n );
		PrintEvenNumbers(m,n);
		
		System.out.println("Print Odd numbers between "+ m + " to "+ n );
		PrintOddNumbers(m,n);
	}
	
	private static void PrintOddNumbers(int m, int n) {
		for (int i = m; i <= n; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		
	}

	public static void PrintEvenNumbers(int m, int n) {
		for (int i = m; i <= n; i++) {
			if(i % 2==0) {
				System.out.println(i);
			}
		}
	}

}
