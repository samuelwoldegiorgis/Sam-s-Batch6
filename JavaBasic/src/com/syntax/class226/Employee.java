package com.syntax.class226;

public class Employee {

	//define private variables
		private String name;
		private int age;
		private double salary;

		//define public methods to give an access to private variables
		//getters
		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}

		public double getSalary() {
			return salary;
		}

		//setters
		public void setName(String name) {
			if(!name.isEmpty() && name.length()>3) {
				this.name=name;
			}
		}

		public String getName() {
			return name;
		}

		public void setAge(int age) {
			this.age=age;
			if(age>1) {
				this.age=age;
			}
		}

		public int getAge() {
			return age;
		}

		public void setSalary(double salary) {
			this.salary=salary;
		}
		} 

		public double getSalary() {
			return salary;
		}	
	
}
