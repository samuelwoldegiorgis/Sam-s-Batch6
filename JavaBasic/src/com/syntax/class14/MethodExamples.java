package com.syntax.class14;

public class MethodExamples {

	//want to create a method that
	//will be greeting a person
	void greet() {
		System.out.println("Hello sami");
	}
	 void greet1(String name) {
		 System.out.println("Hello "+name);
	 }
	public static void main(String[] args) {
		// method greet
		MethodExamples object1=new MethodExamples();
	    object1.greet1("Think");
	    object1.greet1("Practice");
	    object1.greet1("Mentor");
	    object1.greet1("Project");
	}

}
