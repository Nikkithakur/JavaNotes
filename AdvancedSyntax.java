//single line comments

/*
 * Multiline comments
 * 
 */

// order to be followed while coding
/*
 * 1. package name(optional)
 * 2. import stmt(optional / sometimes mandatory)
 * 3. Class Name
 * 4. Class Definition
 */

package com.cg.day1_ClassesSyntax;

/* many classes can exist within a file, but only one class has to be public*/
public class AdvancedSyntax 
{
//instance variables or instance attributes
// to ensure encapsulation private is added to all instance variables
	private int number1;
	private float number2;
	private String str;
	private String name="Java Practice";
	
/* 
Constructors - special methods whose name is same as their class Name
and with no return type
Used to initialize instance variables	
*/
	public AdvancedSyntax() 
	{
		System.out.println("Constructor called and default values are assigned");
	}
	
//methods which have a return type
		public void method1()
		{
			number1=10;
			System.out.println(number1);
		}
/*
 * getters and setters method used to update and access instance variables
 * They should be public since they will be used to access instance variables from any class
 */
		public int getNumber1() {
			return number1;
		}

		public void setNumber1(int number1) {
			this.number1 = number1;
		}

		public float getNumber2() {
			return number2;
		}

		public void setNumber2(float number2) {
			this.number2 = number2;
		}

		public String getStr() {
			return str;
		}

		public void setStr(String str) {
			this.str = str;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

// when you print an object a hexcode is printed, we can override it using toString()
		@Override
		public String toString() {
			return "AdvancedSyntax [number1=" + number1
					+ ", number2=" + number2 + ", str=" + str + ", name="
					+ name + "]\n";
		}
		
// a class without main can be compiled but can't be executed
		public static void main(String[] args) {
			// class object can be created from here
			AdvancedSyntax bs=new AdvancedSyntax();
			System.out.println(bs);
			
			bs.setNumber1(26);
			bs.setNumber2(27);
			bs.name="Name";
			bs.str="String";
			
			System.out.println(bs);
			
			bs.getNumber1();
			bs.getNumber2();
			bs.getStr();
			bs.getName();
		}
		
}
