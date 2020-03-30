package com.syntax.class15;

public class Google {
//define features such as emp id, name, salary, title
	// define a behavior working, get paid, attending meetings
	
	int empId;
	double salary;
	
	string name, lastName, title;
	void working() {
		System.out.println(title +"is working");
	}
	
	void getpaid() {
		System.out.println(name +"is getting paid "+salary);
		
	}
	void attendingMeetings() {
		System.out.println(name +"attending meetings");
	}
	
	public static void main(String[] args ) {
	Google emp1	=new Google();
	emp1.empId=123;
	emp1.name="Jhon";
	emp1.lastName="Smith";
	emp1.title="CEO";
	emp1.salary=200000;
	
	emp1.working();
	emp1getPaid();
	emp1.attendingMeetings();
	
	Google emp2=new Google();
	emp2.
	
	}
}
