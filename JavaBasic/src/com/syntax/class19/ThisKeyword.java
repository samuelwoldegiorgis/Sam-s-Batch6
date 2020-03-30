package com.syntax.class19;

public class ThisKeyword {

	
		int a,b;
		
		public static void main(String[] args) {
			this.a=a;
			this.b=b;
		}
		public void sum(int a, int b) {
	System.out.println("sum of local variables");
System.out.println("sum of instance variables"+(this.a+this.b));
	}
 public static void main(String[] args) {
	 ThisKeyword obj=new ThisKeyword(10,20);
	 obj.sum(100,200);
	 System.out.println("__________________________");
	 
	 ThisKeyword obj2=new ThisKeyword();
	 obj2.sum(20, 40);
 }
}
