package com.cg.day1_ClassesSyntax;

/* Multiple classes with main() can be executed
 * JVM checks for main() only in public class
 * (String... args) == (String[] a) == (String args[]) 
 */

public class MultipleClassesWithMain {

	public static void main(String... args) {
		System.out.println("Multiple Classes with main()");
	}
}

class A{
	public static void main(String[] args) {
		System.out.println("Class A main()");
	}
}
class B{
	public static void main(String[] args) {
		System.out.println("Class B main()");
	}
}
