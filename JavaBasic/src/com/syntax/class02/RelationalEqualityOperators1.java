package com.syntax.class02;

public class RelationalEqualityOperators1 {

	public static void main(String[] args) {
		
		int i=20;
		int y=20;
		
		System.out.println(1>y);//false
		System.out.println(1<y);//true
		System.out.println(1==y);//false
		System.out.println(1!=y);//false
	
		System.out.println("______________");
		double a=900.99;
		double b=100.99;
		
		boolean result=a>b;//true;
		boolean result1=a==b;//false;
		
		boolean result2=a!=b;//true
		
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
	
	}
}
