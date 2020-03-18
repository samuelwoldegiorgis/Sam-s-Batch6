package com.syntax.class10;

public class Largest {

	public static void main(String[] args) {
		
		//find largest element from an array
		int[] nums= {200,30,-1,900,56,787};
		
		int max=nums[0];
		for (int i=1; i<nums.length; i++) {
			if(nums[i] > max) {
				max=nums[i];
			}
		}
		        System.out.println("the given array element is:");
for(int i=0; i<nums.length; i++) {
	System.out.println(nums[i]);
}
System.out.println("from the array element largest number is:"+max);		

	}

}
