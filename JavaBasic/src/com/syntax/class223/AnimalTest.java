package com.syntax.class223;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal=new Bird();
		animal.sleep();
		animal.whoAmI();

		Animal.whoAmI();
		Bird.whoAmI();

	}

}
