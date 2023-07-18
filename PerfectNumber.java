package com.telusko.demo;

import java.util.Scanner;

public class PerfectNumber {
	
	static Scanner s = new Scanner(System.in);
	public static void main(String[]args) {
		
		System.out.println("Enter the Number: ");
		int number = s.nextInt();
		
		boolean isperfect = perfectnumber(number);
		if (isperfect) {
			System.out.println("The given number is perfect");
		}
		else {
			System.out.println("The Given number is not perfect");
		}
			
		
	}
	public static boolean perfectnumber(int number) {
		int sum = 0;
		for (int i=1; i<number; i++) {
			if(number%i==0) {
				sum+=i;	
			}
			
			
		}
		return sum==number;
	}

}
