package com.syntax.class12;

public class Task {

	public static void main(String[] args) {
		//create a string and print it in reverse order
		//(Sunday --> yadnuS)
String str = "Sunday";
 
String reverse = " ";
for (int i=str.length()-1; i>=0; i--){
	reverse=reverse+str.charAt(i);
	
}

System.out.println("Reverse string is:");
System.out.println(reverse);

	}

}
