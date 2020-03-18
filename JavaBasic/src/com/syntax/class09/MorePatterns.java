package com.syntax.class09;

public class MorePatterns {

	public static void main(String[] args) {
		
for (int i=1; i<=5; i++ ) {
	for(int j=1; j<=5; j++) {
		System.out.print(j);
	}
 System.out.println();
}
System.out.println(("__priting pattern____"));
	
/* 11111
 * 22222
 * 33333
 * 44444
 * 55555
 */

for (int i=1; i<=5; i++ ) {
for(int j=1; j<=9; j++) {
System.out.print(j);
}
System.out.println();
}
System.out.println("---printing 5 rows of 1-9-----");
	

for (int i=1; i<=5; i++ ) {
for(int j=5; j>=1; j--) {
System.out.print(i);
}
System.out.println();

}
for (int i=5; i>=1; i-- ) {
for(int j=5; j>=1; j--) {
System.out.print(i);
}
System.out.println();

}



for(int c=5; c>=1; c--) {
	for (int r=1; r<=c; r++) {
		System.out.print(c);
	}
System.out.println();
}


for (int c=1; c<=5; c++) {
	for (int r=1;r<=c; r++) {
		System.out.print("*"+" ");
	}
	System.out.println();
}
for (int c=4; c>=1; c--) {
	for (int r=1;r<=c; r++) {
		System.out.print("*"+" ");
	}
	System.out.println();
}
	}
	}






