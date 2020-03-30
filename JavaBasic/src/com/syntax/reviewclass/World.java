package com.syntax.reviewclass;

public class World {

	public static void main(String[] args) {
		Baby baby1;
		baby1=new Baby();
		
		baby1.cry();
		
		baby1.firstName="John";
		baby1.lastName="Smith";
		baby1.gender='M';
		baby1.weight=7;
		baby.hairColor="yellow";
		//reassign value
		baby1.weight=8;
		
		System.out.println("baby1 firstname is  " + baby1.firstName);
	
	}

}
