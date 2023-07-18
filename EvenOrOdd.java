package com.telusko.demo;

import java.util.Scanner;


class EvenOrOdd{
	
	static Scanner s= new Scanner(System.in);
	public static void main(String[]args) {
		System.out.println("Enter the Number: ");
		int a=s.nextInt();
		
		if (a%2==0) {
			System.out.println("The Given number is Even");
		}
		else {
			System.out.println("The Given number is Odd");
		}
	}
	
	
}