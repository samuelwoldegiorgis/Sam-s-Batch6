package com.syntax.class19;

public class ConstructorCall {

	public ConstructorCall() {
		System.out.println("I am non argument constructors");
		}
		  public ConstructorCall(String str) {
			  this();
       }
		  public ConstructorCall(String str, String Str1) {
			  this();
		  }
		  public static void main(String[] args) {
			  ConstructorCall obj=new ConstructorCall("Ja");
		  }

}
