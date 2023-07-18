package com.telusko.demo;

import java.util.Scanner;

public class factorial {
	
	static Scanner s = new Scanner(System.in);
	public static void main(String[]args) {
		System.out.println("Enter the number : ");
		int number = s.nextInt();
		
		int factorial = integer(number);
		System.out.println("The factorial of the given number is "+ factorial);
		}
	private static int integer(int number) {
		int factorial = 1;
		for (int i = 2; i <= number; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

}
