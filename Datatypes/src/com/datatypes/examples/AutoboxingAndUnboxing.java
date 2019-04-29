package com.datatypes.examples;
/*
 * AUTOBOXING:
 *  Converting a primitive value (an int, for example) into an object of the corresponding wrapper class (Integer) is called autoboxing. The Java compiler applies autoboxing when a primitive value is:

    1.Passed as a parameter to a method that expects an object of the corresponding wrapper class.
    2.Assigned to a variable of the corresponding wrapper class.

 * UNBOXING:
 *  Converting an object of a wrapper type (Integer) to its corresponding primitive (int) value is called unboxing. The Java compiler applies unboxing when an object of a wrapper class is:

    1.Passed as a parameter to a method that expects a value of the corresponding primitive type.
    2.Assigned to a variable of the corresponding primitive type.
    
    
 *
 * 
 */
public class AutoboxingAndUnboxing 
{
	// Default values of class will be null, unlike primitive datatypes
	Boolean a; Character b; Byte c; Short d; Integer e;
	Long f; Float g; Double h;
	
	Boolean a1=true; Character b1='K'; Byte c1=123; Short d1=3256; Integer e1=123456;
	Long f1=13312L; Float g1=1.2365f; Double h1=9.36212;

	
	public static void main(String[] args) 
	{
		AutoboxingAndUnboxing t=new AutoboxingAndUnboxing();
		System.out.println("Boolean value: "+t.a);
		System.out.println("Character value: "+t.b);
		System.out.println("Byte value: "+t.c);
		System.out.println("Short value: "+t.d);
		System.out.println("Integer value: "+t.e);
		System.out.println("Long value: "+t.f);
		System.out.println("Float value: "+t.g);
		System.out.println("Double value: "+t.h);
		
		System.out.println("\n");
				
		System.out.println("Boolean value: "+t.a1);
		System.out.println("Character value: "+t.b1);
		System.out.println("Byte value: "+t.c1);
		System.out.println("Short value: "+t.d1);
		System.out.println("Integer value: "+t.e1);
		System.out.println("Long value: "+t.f1);
		System.out.println("Float value: "+t.g1);
		System.out.println("Double value: "+t.h1);
		
		System.out.println("\n");
		
		// All classes takes only 2 types of arguments except character(only its corresponding type )
		//1. String
		//2. Their corresponding data type
		// Float can accept above 2 + double
		// If no arguments are given, then default values are assigned
		// string of numbers with _ within digits will raise exception
		// only f,d for Float wrapper as a prefix is allowed, L and D not allowed for Long and Double
		Boolean a2= new Boolean("true"); 
		Character b2=new Character('K');
		Byte c2=new Byte("123");
		Short d2=new Short("3256"); 
		Integer e2=new Integer("1234567");
		Long f2=new Long("13312153313515613"); 
		Float g2=new Float("1.2365f"); 
		Double h2= new Double("9.36212D");
				
		System.out.println("Boolean value: "+a2);
		System.out.println("Character value: "+b2);
		System.out.println("Byte value: "+c2);
		System.out.println("Short value: "+d2);
		System.out.println("Integer value: "+e2);
		System.out.println("Long value: "+f2);
		System.out.println("Float value: "+g2);
		System.out.println("Double value: "+h2);
		
		System.out.println("\n");
		
		// corresponding values as args
		Boolean a3= new Boolean(true); 
		Character b3=new Character('\u1234');
		byte b=123;
		Byte c3=new Byte(b);
		short s=3256;
		Short d3=new Short(s); 
		Integer e3=new Integer(1234_567);
		Long f3=new Long(13312153313_51561355L); 
		Float g3=new Float(1.236564484_89_5353313131319979113366f); 
		Double h3= new Double(9.36212545566868942212453566624146465555554831366444656888888888);
		
		System.out.println("Boolean value: "+a3);
		System.out.println("Character value: "+b3);
		System.out.println("Byte value: "+c3);
		System.out.println("Short value: "+d3);
		System.out.println("Integer value: "+e3);
		System.out.println("Long value: "+f3);
		System.out.println("Float value: "+g3);
		System.out.println("Double value: "+h3);
		
		System.out.println("\n");
		
		// UNBOXING
		// Integer objects unboxed into primitive datatypes, in below assignment
		int var1= e2,var2= e3;
		System.out.println("unboxed integer sum: "+(var1+var2));
		System.out.println("Integer object sum: "+(e2+e3));
		
	}
}
