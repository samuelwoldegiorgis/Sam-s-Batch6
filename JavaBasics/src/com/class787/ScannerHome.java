package com.class787;

import java.util.Scanner;

public class ScannerHome {

	public static void main(String[] args) {
		// ask user for the name and print Good Morning --
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your name");
		String name=input.nextLine();
		
		System.out.println("Good morning " + name);
		//
	}
	}