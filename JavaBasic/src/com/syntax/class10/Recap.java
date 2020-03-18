package com.syntax.class10;

public class Recap {

	public static void main(String[] args) {
	String [] cities= {"Washington DC, "New York", "Paris", "Miami","
			+ "LosAngles" , "Dallas", "Chantilly"};
	
	//I live in Paris
	System.out.println("I live in "+cities[2]);
	int x=1;
	System.out.println(cities[x]);
	x+=3;
	System.out.println("I mmoved to "+cities[x]);
	
	//how many elements stored inside an array?
	int arraySize=cities.length;//7
	System.out.println("Total elements"+arraySize)

	}

}
