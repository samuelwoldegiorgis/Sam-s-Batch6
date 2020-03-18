package com.class787;

import java.util.Scanner;

public class CityAndTemp {

	
		// Ask user to enter city and temp in Fahrenhit
		//Your program should convert F--->C
		//Your program should say "The temperature in the city___ is ___"
      
		public static void main(String[] args) {
			
			String cityName;
			int temp;
			
			Scanner myScanner=new Scanner (System.in);
			System.out.println("please enter your city");
			
			cityName=myScanner.nextLine();
			
			System.out.println("please enter temperature in Fahrenhit");
			
			temp=myScanner.nextInt();
			//formula (F-32) * 5/9;
			                                                  
			
			int converetedTemp=(temp-32)*5/9;
			System.out.println("the temperature in the city"+cityName+" is"+converetedTemp+"C");
			
			
		
	}

}
