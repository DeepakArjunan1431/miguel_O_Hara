package com.telusko.demo;

import java.util.Scanner;

public class FirstAndLast {
	
	static Scanner s= new Scanner(System.in);
	public static void main(String[]args) {
		
		System.out.println("Number ah Enter Pannu: ");
		int number = s.nextInt();
		
		int firstdigit=firstNumber (number);
		int lastdigit=lastNumber(number);
		
		System.out.println("The first Number is: " + firstdigit);
		System.out.println("The Last number is: "+ lastdigit);
		
		
		
	}
	private static int firstNumber(int number) {
		
		while (number>=10) {
			number /= 10;
		}
		return number;
		
	
	}
		
		
	
	private static int lastNumber(int number) {
		
		return number%10;
	}

}
