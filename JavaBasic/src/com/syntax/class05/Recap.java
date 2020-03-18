package com.syntax.class05;

public class Recap {

	public static void main(String[] args) {

       //* 1-11
		
		
		int hour=23;
		String timeOfDay;
		if(hour>=1 && hour<=11) {
			timeOfDay="Morning";
		}else if(hour >=16 && hour <=20) {
			timeOfDay="Evening";
		}else if (hour >=21 && hour <=24) {
			timeOfDay="Night";
			
		}else {
			timeOfDay="Unknown";
			
		}
		//if time of the Day is not unknown--> only then
		//i want to see the message
		
		if(!timeOfDay.equals("Unknown")) {
			System.out.println("Right now is "+timeOfDay);
		}
		

	}

}
