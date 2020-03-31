package com.syntax.class131;

public class Q1 {

	public static void main(String[] args) {
	  /*
	   * strings without a temporary variable?
	   */
int a=10;
int b=20;

a=a+b;//30
a=a-b;//30-20=10
a=a-b;

System.out.println("The value of a = "+a);
System.out.println("The value of b = "+b);

String str1="Day";
String str2="Night";
 
str1=str1+str2;//DayNight
str2=str1.substring(0,3);//Day
str1=str1.substring(3);//Night

System.out.println("The value of str1 = "+str1);
System.out.println("The value of str2 = "+str2);

	}

}
