package com.syntax.class226;

interface Smith {

	}

	interface TakesScreenshot{

		String fileExtension=".png";
		
		void takePicture();
		
		//features below were added from Java 1.8 version
		static void takeSelfie() {
			System.out.println("I can take a selfie");
		}
		
		default void takePanoramaPic() {
			System.out.println("I can take panoramic pistures");
		}
	}

	public interface WebDriver {
	public interface WebDriver extends TakesScreenshot, Smth{

		void openBrowser();

		void closeBrowser();
		void maximizeWindow();
		void findElement();
	}

	class ChromeDriver implements WebDriver, TakesScreenshot {
	class ChromeDriver implements WebDriver {
		@Override
		public void openBrowser() {
			System.out.println("We can open Chrome");
		}
		@Override
		public void closeBrowser() {
			System.out.println("we can close Chrome");
		}
		@Override
		public void maximizeWindow() {
			System.out.println("We can maximize Chrome window");
		}
		@Override
		public void findElement() {
			System.out.println("We can find element in Chrome");
		}
		@Override
		public void takePicture() {
			System.out.println("In crome we can take picture");
		}
	}
	class FireFoxDriver implements WebDriver {
		@Override
		public void openBrowser() {
			System.out.println("We can open FireFox");
		}
		@Override
		public void closeBrowser() {
			System.out.println("We can close FireFox");
		}
		@Override
		public void maximizeWindow() {
			System.out.println("We can maximize FireFox window");
		}
		@Override
		public void findElement() {
			System.out.println("We can find elements in FireFox");
		}
		}

		@Override
		public void takePicture() {
			// TODO Auto-generated method stub

		}
	
	}
	 38  src/com/syntax/class26/Employee.java 
	@@ -0,0 +1,38 @@
	package com.syntax.class26;

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

		public void setAge(int age) {
			this.age=age;
		}

		public void setSalary(double salary) {
			this.salary=salary;
		   }
		}
	}
}
