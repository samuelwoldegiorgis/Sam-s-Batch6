package com.syntax.class05;

import java.util.Scanner;

public class SwitchWithString {

	public static void main(String[] args) {
		
		//as a user where he or she is from
		//based on the country we will define 
		//String favouriteFood;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter your country");
		String country = scan.nextLine();
		
		String favouriteFood;
		switch (country) {
		
		case "Morroco";
		favouriteFood="couscous";
		break;
		
		case "Belarus";
		favouriteFood="Potato";
		break;
		
		case "Tajikistan";
		favouriteFood="Osh";
		break;
		
		case "Turkey";
		favouriteFood="Baklava";
		break;
		
		
		case "Afghanistan";
		favouriteFood="Mantu";
		break;
		
		default:
			favouriteFood="Unknown"
		
		}
		System.out.println("your favourite food if " + favouriteFood);
		
		

	}

}
