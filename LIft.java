package com.telusko.demo;
import java.util.Scanner;
public class LIft {
	
	

	
		static Scanner s = new Scanner(System.in);
		public static void main(String[]args)throws Exception{
			System.out.println("yoU aRe CUrrenTLy aT Ground FLoor ");
			String floor1 ="1,2,3,4,5";
			String [] floor = floor1.split(" ");
			int [] number = new [floor.length];
			

			for (int i = 1; i<=floor1.length ;i++ )
			{

				System.out.println("moving to "+ i + "th floor");
				Thread.sleep(800);
				
				
				
				if(i==floor1.length) {
					System.out.println("you have Reached "+ floor1.length+ "th floor");
				}
			}
			
			


		}
}
	


