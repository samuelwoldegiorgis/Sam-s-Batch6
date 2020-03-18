package com.syntax.class10;

public class RetrieveElements {

	public static void main(String[] args) {
		//create an array of fruits and retrieve all elements
		
		String[] fruits= {"Banana", "Kiwi", "Apple", "Mango"};
		//if fruit is apple-->that is your favourite
		//advanced for loop, enhanced for , for each loop
		for(String fruit:fruits) {
			if(fruit.contentEquals("apple")) {
				System.out.println(fruit+"is your favourite fruit");
			}else {
				System.out.println(fruit);
			}
			System.out.println(fruit);
		}
		System.out.println("____________");
		
		//regular for loop
		//fruits.length=number of elements
		for(int i=0; i<fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		
		}

	}


