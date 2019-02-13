// basicsyntax for mandatory successful compilation and execution
/*
 * 1. class name follows Pascal Case
 * 
 */

package com.cg.day1_ClassesSyntax;

public class BasicSyntax
{

	public static void main(String[] args)
	{
		
	}

}
/*
- Order for writing java program
	1. package
	2. import(optional, sometimes mandatory)
	3. class name
	4. class definition
	
- package name starts with package keyword followed by space with packagename

- import statement is used to use class within different packages

- class Name follows PascalCaseNamingCoventions

- class definitions may contain

	   instance variables - declared inside class, outside of methods and constructors
						  - each newly created object will have new copy of these variables
						  - default values are assigned when object is created, if values not explicitly assigned
						  - names follow camel case
						  
	   static variables/ class variables - declared inside class, outside of methods and constructors with static keyword
	   									 - memory is allocated when class is loaded by classloader
	   									 - it is accessible by all objects, if modified, changes will refelect in all other object references.
	   
	   Constructors - writing definition is optional since, jvm calls it during every object creation
	   				- same as class name, special methods, no return type
	   				- called when object is created, used to initialize instance variables
	   				- 2 types 1. default 2.parameterized(parameters are passed)
	   				
	   	methods - functions with return type
	   			- names follow camel case
	   			- variabales declared here are local and can't be accessed outside of it.
	   			- decalration and initialization has to be done in same stmt only
	   			
	   	main() - special method be'coz JVM searches fir this when program begins execution
	   		   - entry point for execution
	   		   - public static void main(String[] a) is the signature













*/
