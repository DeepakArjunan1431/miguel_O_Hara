package com.telusko.demo;

import java.util.Scanner;

 class reverseTheNumber {
	
	static Scanner s = new Scanner(System.in);
	public static void main (String [] args) {
		
		System.out.println("Enter the Integer: ");
		int number = s.nextInt();	
		
		int reversedInteger= reversenumber(number);
		System.out.println("The reversed Number is " + reversedInteger);
	}
	public static int reversenumber(int number) {
		int reversedInteger = 0;
		while(number != 0) {
			int remainder = number%10;
			reversedInteger = reversedInteger * 10 +remainder;
			number /= 10;
		}
		return reversedInteger;
	}

}
