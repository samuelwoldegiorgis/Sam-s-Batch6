package com.syntax.class08;

public class BreakAndContinueAtTheSameTime {

	public static void main(String[] args) {
		
		for (int i=1; i<=100; i++) {
			if (i>=35 && i <=55) {
				continue;
			}
			System.out.println(i);
		}
System.out.println("*********");
	}

}
