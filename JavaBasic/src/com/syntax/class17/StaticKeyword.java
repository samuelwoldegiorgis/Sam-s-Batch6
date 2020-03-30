package com.syntax.class17;

public class StaticKeyword {

	public static void main(String[] args) {
		//create a template for a phone
		String color;
		int memory;
		
		static String brand;
		static boolean touchScreen;
		//return type, name, parameters
		void displayGeneralInfo() {
			System.out.println("we are building "+brand+" with touch screen="+touchScreen);

	}
		void displaySpecificagtions() {
			System.out.println("we build phone with "+memory+"GB memory in "+color+" color");
		}
		
	

}
