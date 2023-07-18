package com.telusko.demo;

import java.util.Scanner;

public class PrimeNumber {
	
	static Scanner s= new Scanner(System.in);
	public static void main(String[]args) {
		System.out.println("Enter the positive Integer: ");
		int number=s.nextInt();
		
		boolean isPrime=isPrimeNumber(number);
		if (isPrime) {
			System.out.println("The given Number is Prime Number");
		}
		else {
			System.out.println("The given number is not a Prime Number");
		}
		
	}
	public static boolean isPrimeNumber(int number) {
		
		if(number<1) {
			return false;
		}
		
		for (int i = 2; i <= Math.sqrt(number); i++) {
			
			if (number%i==0) {
				return false;
			}
			
			
		}
		return true;
		
	}
}







