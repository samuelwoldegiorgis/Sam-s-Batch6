package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		int num=10;
		int num1;
		num1=10;
		
		//declare
		
		int [] array=new int[4];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		
  System.out.println(array[1]);
	}
//2 way
	
	

     int[] numbers=new int[3];
  numbers[0]=100;
  numbers[1]=200;
  numbers[2]=300;
	//change value of numbers[1]
  
  numbers[1]=2000;
  
  System.out.println(numbers[1]+numbers[0]);
}
}