package com.telusko.demo;

import java.util.Scanner;

public class factors {
	
	static Scanner s=new Scanner(System.in);
	public static void main(String[]args) {
		
		System.out.println("Enter the number: ");
		int number = s.nextInt();
		
		
		System.out.println("The factors of the Given Number are" );
		factors(number);
		
	}
	public static void factors(int number) {
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.println(i);
			}
		}
		
	}

}
