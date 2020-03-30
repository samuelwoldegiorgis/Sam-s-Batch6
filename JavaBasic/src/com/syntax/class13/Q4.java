package com.syntax.class13;

public class Q4 {

	public static void main(String[] args) {
		//find number of words in string?
		
		String str="sam9989mmkhhkakahhdlkdddmm";
		str.replaceAll("(^A-Za-z)", "");
		int number=str.length();
		System.out.println("Number of alpha ="+number);

		String myString="Today is Wednesday";
		String[] array=myString.split(" ");
		int words=array.length;
		System.out.println("total words in string:"+myString+"="+words);
		
	}

}
