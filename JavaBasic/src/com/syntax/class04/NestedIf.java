package com.syntax.class04;

public class NestedIf {
	public static void main(String [] args) {
		
		boolean classToday=true;
		boolean flag=false;
		
		if (flag) {
			System.out.println("Hello");
			
			if (classToday) {
				System.out.println("Hello Friends");
			}else { 
				System.out.println();
			}
		}
	}

}
