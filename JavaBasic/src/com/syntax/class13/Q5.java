package com.syntax.class13;

public class Q5 {

	public static void main(String[] args) {
		// Reverse String
		//character by character
		//word by word
		
		String given="I love java";
		String reversed="";
		
		for(int i=given.length()-1; i>=0; i--);{
		reversed=reversed+given.charAt(i);
	}
	System.out.println("reserved string = "+reversed);
	

	}

}
