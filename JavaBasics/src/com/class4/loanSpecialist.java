package com.class4;

import java.util.Scanner;

public class loanSpecialist {

	public static void main(String[] args) {
		
		//If the loan is less than 200,000 then you would lend the money
		//Otherwise you would reject the client
		 int loan;
		  Scanner myScanner = new Scanner(System.in);
		  System.out.println("Enter your loan");
		  
		  loan=myScanner.nextInt();
		  if (loan<200000) {
			  System.out.println("i can lend you money");
		  }else {
			  System.out.println("i can not lend you money");
		  
		  }
		  
	}

}
