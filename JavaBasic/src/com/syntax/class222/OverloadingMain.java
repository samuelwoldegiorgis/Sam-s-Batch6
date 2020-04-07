package com.syntax.class222;

public class OverloadingMain {

	static String str="Syntax";

	public static void main(int[] args) {
		System.out.println("Method with int array arguments");
	}

	public static void main(String args) {
		System.out.println("Method with String argument");
		System.out.println("Method with String argument "+args);
	}

	public static void main(String args, String args1) {
    @@ -25,10 +27,10 @@ public static void main(int num, String args) {
	public static void main(String[] args) {//Java always looks for this main method with this signature
		System.out.println("Method with String array arguments");
		OverloadingMain.main("str");
		main("str");
		main(str);
		main("hello", "hi");
		//int[] arr=new int[2];
		main(new int[2]);
	}

	
}
