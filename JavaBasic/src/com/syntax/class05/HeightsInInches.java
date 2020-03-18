package com.syntax.class05;

import java.util.Scanner;

public class HeightsInInches {

	public static void main(String[] args) {
		
		
Scanner inches=new Scanner(System.in);
System.out.println("Please enter your heights in inches");

 double height=inches.nextDouble();

if(height<60) {
	System.out.println("you are short");
}else if(height>=60 && height<=72) {
	System.out.println("you are medium");
}else {
	System.out.println("you are tall");

	
	}
}


	
	
	
	
	

}
