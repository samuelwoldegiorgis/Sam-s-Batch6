package com.class787;

public class Cwrk {

	public static void main(String[] args) {
		// check if user has credit card -->
		// check what is the balance is more thatn 1000 -->pay off
		// else"you are good"

		boolean creditCard = true;
		int balance = 1000;

		if (creditCard) {
			System.out.println("let's check the balance");
			if (balance >= 1000) {
				System.out.println("pay off now");

			} else {
				System.out.println("you are safe");
			}
		} else {

			System.out.println("do you want a redit card");
		}

	}
}
