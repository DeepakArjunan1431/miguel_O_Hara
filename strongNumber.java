package com.telusko.demo;
import java.util.Scanner;
public class strongNumber {
	
	

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter a positive integer: ");
	        int number = input.nextInt();

	        boolean isStrong = isStrongNumber(number);
	        if (isStrong) {
	            System.out.println(number + " is a strong number.");
	        } else {
	            System.out.println(number + " is not a strong number.");
	        }
	    }

	    public static boolean isStrongNumber(int number) {
	      
	        int temp = number;
	        int sum = 0;

	        while (temp != 0) {
	            int digit = temp % 10;
	            sum += factorial(digit);
	            temp /= 10;
	        }

	        return sum == number;
	    }

	    public static int factorial(int n) {
	        int fact = 1;

	        for (int i = 2; i <= n; i++) {
	            fact *= i;
	        }

	        return fact;
	    }
	}


