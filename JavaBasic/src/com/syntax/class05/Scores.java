package com.syntax.class05;

import java.util.Scanner;

public class Scores {

	public static void main(String[] args) {
	 
	 //score>=90-->grade =A
		//score>=70 and <90-->grade =B
		//score>=50 and <70-->grade =C
		//score<50-->grade=F
	 

	Scanner scan=new Scanner(System.in);
	int score;
	 System.out.println("Please enter your quiz score in calss");
     int quiz=scan.nextInt();
     
     System.out.println("your midterm score");
     int midterm=scan.nextInt();
     
     System.out.println("Final score");
     int fin=scan.nextInt();
     double av=(quiz+fin+midterm)/3;
     
     //perform verification
     String grade=scan.nextLine();
	 if((av/3) >=90) {
		 grade="A";
		 
	 } else if ((av/3)>= 70 && (av/3)<90) {
	    grade="B";
	 
	 } else if ((av/3)>=50 && ((av)/3)<70) {
		 
		 grade="C";
	 } else if ((av/3)<50) {
		 
		grade="F";
	 }  
	 System.out.println("score is "+ grade);
		if (grade.contentEquals("A")) {
			System.out.println("cool score");
		}
                        
		            }
	            }     
		
	

