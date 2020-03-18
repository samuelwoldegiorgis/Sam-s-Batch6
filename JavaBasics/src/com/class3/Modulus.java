package com.class3;

public class Modulus {

	public static void main(String[] args) {
		// public static void main(String[] args) {
		
		int a=10;
		int b=3;
		int div=a/b;
		System.out.println(div);//3 or 3.3
		
		//modulus operator
		int mod=a%b;
		
		System.out.println(a%b);
		
		//parentheses, Exponents, Multiplication/Division, Modulus,Addition/Subtraction
		
		int e= -5 + 4*6;
        System.out.println(e);//19
        
        int x=(22+9) % 7;
        System.out.println(x);//3
        
        int y = 20 + -3*5 / 8;
        System.out.println(y);//28; 27; 19; 18;
        
        int z= 5 + 15 / 3 * 2 - 8 % 3; //(5+10-2)
        System.out.println(z);//17; 5; 13

    
  

	}

}
