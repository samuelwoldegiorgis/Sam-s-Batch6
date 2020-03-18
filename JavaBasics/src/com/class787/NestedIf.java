package com.class787;

public class NestedIf {

	
		// write a program to check work eligibility
		 // if user is younger than <16 --> not allowed to work
		// otherwise --> allow to work. if user is younger than 64
		// --> go to work
		//otherwise --> enjoy your life
	public static void main(String[] args) {
		int age=15;
		int eligibleAge=16;
		int retirementAge=64;
		
		if (age<eligibleAge) {
			System.out.println("you are too young, no work for you");
		}else {
			System.out.println("you are eligible to work");
			if (age<retirementAge) {
				System.out.println("go work hard");
			}else {
				System.out.println("please enjoy your life. you do need to work");
 				
			}
			
		}
	}

}
