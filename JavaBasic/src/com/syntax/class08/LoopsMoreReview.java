package com.syntax.class08;

public class LoopsMoreReview {

	public static void main(String[] args) {
		//write a program to calculate sum of odds and 
		//sum of even numbers
		// 1 to 99
		
		for (int i=50; i>=1; i--) {
			System.out.println(i);
			
		}
		 System.out.println("---- printing odd numbers---");
		 		//print odd numbers between 20 and 50
		 for (int i=20; i<=50; i++ ) {
			 
			 if(i%2!=0) {
				 System.out.println(i);
			 }
		//what is the output
			 
			 int total=2;
			 for (int k=1; k<4; k++) {
				 total=total*k;
			 }
			System.out.println(total); 
		 }
	}
}
