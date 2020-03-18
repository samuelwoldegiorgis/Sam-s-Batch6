package com.class787;

public class NestedIfAgain {
//declare variable for gpa and having a diploma
	//if user has a diploma --> congratulations --> if gpa is higher 3.5 --> person
// else do not hire.
	
	public static void main(String[] args) {
		
		double gpa=3.6;
		double expectedGpa=3.5;
		
		boolean hasDiploma=true;
		
		if (hasDiploma) {
			System.out.println("Congra");
			if (gpa>expectedGpa) {
				System.out.println("you are hired");
			}else{ 
				System.out.println("we cannot hire you"); 
				}
			}else{
				System.out.println("please get your degree");
				
				
			}
		}

	}


