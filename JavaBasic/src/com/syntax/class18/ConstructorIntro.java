package com.syntax.class18;

public class ConstructorIntro {

	
	
	ConstructorIntro(){
		System.out.println("I am a Constructor");
	}
	public static void main(String[] args) {
		ConstructorIntro obj=new ConstructorIntro();
		System.out.println("code after constructor");
		
		obj.hello();

	}
 void hello() {
	 System.out.println("Hello Class");
 }
}
