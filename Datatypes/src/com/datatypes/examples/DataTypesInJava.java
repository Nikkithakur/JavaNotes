package com.datatypes.examples;

/*
 * Literal - a literal is a fixed value in java
 * 
 * Unicode - is a representation of characters mainly used for internationalization, it supports ASCII 255 with
 * 			 all language characters
 * 
 * There are 2 datatypes in JAVA
 * 1. Primitive datatype
 * 2. Non Primitive datatype or Reference datatype or Object datatype
 * 
 * Primitive datatype includes boolean, CHARACTER(char), INTEGRAL(byte, short, int, long), FLOATING POINT(float, double)
 * Non Primitives include String, Array etc
 * 
 * Signed vs Unsigned:
 * 						Signed datatypes include both +ve and -ve values
 * 						UnSigned includes 0 and +ve values
 * Range of a datatype:
 * 						Signed: -2^(n-1) to 2^(n-1)-1 where n = no of bit
 * 						UnSigned: 2^(n-1)
 * boolean : 1 bit
 * 			 true, false are only values allowed
 * 			 false id default
 * 
 * byte : 1 byte(8 bits) 
 * 		  -127 to 128 (by substituting n=8 in above signed range formula we get these values)
 * 			0 by default
 * 
 * short : 2 bytes(16 bits)
 * 			0 by default
 * 
 * int : 4 bytes (32 bits)
 * 		 0 by default
 * 
 * long : 8 bytes (64 bits)
 * 		  0 by default
 * 		  ex: long a = 123151513163L or 123151513163l;
 * 
 * float : 4 bytes (32 bits)
 * 			0.0 by default
 * 			float t = 1.36f or 1.36F;
 * 			7 significant digits
 * 
 * double : 8 bytes (64 bits)
 * 			0.0 by default
 *  		double a = 132133.15313133345 or 132133.15313133345d or 132133.15313133345D;
 *  		15-16 significant digits
 * 		    
 * 
 * char : 2 bytes (16 bits)
 * 		  whitespace or \u0000 by default
 * 
 */
public class DataTypesInJava 
{
	// Default values can be assigned only to instance variables and class variables not local variables
	boolean a; char b; byte c; short d; int e; long f; float g; double h;
	boolean a1= true; char b1='F'; byte c1 = 127; short d1= 32247; int e1= 12345678; long f1= 1234569871236L; float g1=1.23659874F; double h1=123.2365985556225555555D;
	byte c2 = 1_27; short d2= 3224_7; int e2= 123_4567_8; long f2= 1234569_871236L; float g2=1.2365__9874F; double h2=123.2365_98__5556225555555D;

	public static void main(String[] args) 
	{
		DataTypesInJava data = new DataTypesInJava();
		// with default values and size in bytes
		System.out.println("Boolean default value: "+data.a);
		System.out.println("Char default value: "+data.b+", char datatype size in bytes: "+Character.SIZE/8);
		System.out.println("Byte default value: "+data.c+", byte datatype size in bytes: "+Byte.SIZE/8);
		System.out.println("Short default value: "+data.d+", short datatype size in bytes: "+Short.SIZE/8);
		System.out.println("Integer default value: "+data.e+", int datatype size in bytes: "+Integer.SIZE/8);
		System.out.println("Long default value: "+data.f+", long datatype size in bytes: "+Long.SIZE/8);
		System.out.println("Float default value: "+data.g+", float datatype size in bytes: "+Float.SIZE/8);
		System.out.println("Double default value: "+data.h+", double datatype size in bytes: "+Double.SIZE/8);
		
		System.out.println("\n\n");
		// with values assigned
		System.out.println(data.a1);
		System.out.println(data.b1);
		System.out.println(data.c1);
		System.out.println(data.d1);
		System.out.println(data.e1);
		System.out.println(data.f1);
		System.out.println(data.g1);
		System.out.println(data.h1);
		
		System.out.println("\n\n");
		// only _  is allowed within digits
		System.out.println(data.c2);
		System.out.println(data.d2);
		System.out.println(data.e2);
		System.out.println(data.f2);
		System.out.println(data.g2);
		System.out.println(data.h2);
		
		// local variables should be assigned with values, sames goes for all other datatypes
		int a=51333333;
		System.out.println("local variable a: "+a);
	}

}
