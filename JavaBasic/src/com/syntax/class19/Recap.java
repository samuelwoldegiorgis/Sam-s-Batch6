package com.syntax.class19;

public class Recap {
	
	Recap(){
		System.out.println("constructor with no arguments");
	}
 Recap(int num){
	 System.out.println("constructors with 1 parameter");
 }
	public static void main(String[] args) {
		Recap obj=new Recap(2);

	}

}
