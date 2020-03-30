package com.syntax.class14;

public class Garage {

	
	public static void main(String[] args)	{
		//build individual objects
		
		 Car car1=new Car();
		 car1.make="Lamborghini";
		 car1.model="Gallardo";
		 car1.year=2020;
		 car1.color="Blue";
		 //accessing methods of car with car1
		 car1.drive();
		 car1.accelerate();
		 car1.makeNoise();
		 car1.stop();
		 
		 Car car2=new Car();
		 car2.make="BMW";
		 car2.model="M5";
		 car2.year=2019;
		 car2.color="Pink";
		//accessing methods of car2
		 car2.drive();
		 car2.accelerate();
		 car2.makeNoise();
		 car2.stop();
		 
		 Car car3=new Car();
		 car3.make="123";
		 car3.speed=200;
		 //print BMW
		 System.out.println(car1.make);
          //i drive pink BMW
		 
		 
		 System.out.println("I drive "+car2.color+" "+car2.make);
		 
	}

}
