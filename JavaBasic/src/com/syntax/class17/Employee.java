package com.syntax.class17;

public class Employee {

	public static String title; 
	
	
	public	String name;
    protected String lastName;
    double salary;
	private	long ssn;
		
public void method() {
	System.out.println("I am public method");
}
 protected void method2() {
	 System.out.println("I am protected method");
 }
 void method3() {
	 System.out.println("I am default method");
 }
  private void method4() {
	  System.out.println("I am a private method");
  }
   public static void main(String[] args) {
	   Employe emp=new Employee();
	   emp.name="John";
	   emp.lastName="Smith";
   }
	}



	