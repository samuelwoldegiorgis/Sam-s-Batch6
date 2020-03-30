package com.syntax.class16;

public class LocalVariables {

	void nameInside() {
		String name="John";//visible only within method
	}
	public static void main(String[] args) {
     
		boolean flag=true;
		if(flag) {
			String answer="yes";
		}
  System.out.println();
	}

}
