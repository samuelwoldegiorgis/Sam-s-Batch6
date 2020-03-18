package com.syntax.class04;

public class NestedIfContinues {

	public static void main(String[] args) {
		
		
		//check if patient has any allergies
		//if no allergies --> you are healthy
		//otherwise check if patient has:
		   //orange allergy --> do not eat oranges
		//apple allergy donot eat apples
		//kiwi allergy donot eat kiwi
		
		boolean allergy=true;
		boolean appleAllergy=false;
		boolean orangeAllergy=true;
	    boolean kiwiAllergy=false;
	    
	    if (allergy) {
	    	System.out.println("please do not eat");
	    	
	    	if (orangeAllergy) {
	    		System.out.println("Do not eat oranges");
	    	}
	    	
	    } else {
	    	System.out.println("You are healthyy");
	    }

	}

}
