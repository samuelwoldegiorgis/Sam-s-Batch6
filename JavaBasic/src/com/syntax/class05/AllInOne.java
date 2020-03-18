package com.syntax.class05;

import java.util.Scanner;

public class AllInOne {

	public static void main(String[] args) {
	
  // write a program to ask user if there is a sale
		//if no sale --> not going shopping 
		//if sale we will ask the price of the item
		//based on the price we will apply discount and calculae final price
		
		//if price less than 20--> apply 10%
		//if price between 20 and 100-->apply 20%
		//if price between 100 and 500-->apply 30%
		//if price more than 500--> apply 50%
		
		//After discount____ the price of the item reduced from____to__
		
		Scanner scan=new Scanner(System.in);
		String sale;
		System.out.println("Enter Price");
		
		price=scan.hasNextLine();
		
		
		if(sale.equalsIgnoreCase("YEs")) {
			System.out.println("What is the price");
			price=scan.hasNextDouble();
			
			if (price <= 20) {
				discount=price*0.1;
			}else if(price>20 && price<=100) {
				discount = price*0.2;
			}else if(price>100 && price<=500) {
				discount=price*3;
			}else {
				discount=price*0.5;
			}
			final
			}
		}
		
		double price;
		double discount;
		double finalPrice;
		
	
		
		
		
	}

}
