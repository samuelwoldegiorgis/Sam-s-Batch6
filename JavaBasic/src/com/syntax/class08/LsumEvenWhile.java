package com.syntax.class08;

public class LsumEvenWhile {

	public static void main(String[] args) {
		
		//add even numbers
		// print numbers from 15-35
		//but don't print the numbers that 
		//aren't divisible by 2 and 3
		
  for (int i=15; i<=35; i++) {
	  if(i%2 !=0 && i%3 !=0) {
		  continue;
	  }
  System.out.println(i);
  }
  System.out.println("************");
  
  
  for (int i=15; i<=35; i++) {
	  if(i%2!=0 && i%3!=0) {
		  continue;
	  }
  System.out.println(i);
	}
	}

}
