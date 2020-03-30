package com.syntax.reviewclass;

public class TwoDarray {

	public static void main(String[] args) {
		int[][] numbers2 = { { 7, 1, 6, 12 }, { 9, 6, 2, 8 }, { 3, 0, 8, 5 } };
		int maximum = numbers2[0][0];
		int minimum = numbers2[0][0];
		for (int i = 0; i < numbers2.length; i++) {
			for (int j = 0; j < numbers2[i].length; j++) {
				if(numbers2[i][j]>maximum) {
					maximum=numbers2[i][j];
				}else if (numbers2[i][j]<minimum) {
					minimum=numbers2[i][j];
				}
			}
		}
		System.out.println("Maximum of Array Number2 is : "+maximum);
		System.out.println("Minimum of Array Number2 is : "+minimum);
		}
		
		
		
	}


