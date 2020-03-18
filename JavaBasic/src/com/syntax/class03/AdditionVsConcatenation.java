package com.syntax.class03;

class AdditionVsConcatenation {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		
		String x=" Hello";
		String y="Bye";
		
		//ctrl+space --> autocomplete
		System.out.println(a+b+x+y);//30HelloBye
		System.out.println(a+x);

	}

}
