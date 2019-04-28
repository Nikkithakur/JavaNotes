package com.datatypes.examples;

/*
 * Type Conversion is done automatically by compiler - Widening
 * Type Casting has to be done explicitly -  may lead to loss of precision - Narrowing
 * 
 * Boolean can't be type-casted or type-converted to anything
 * 
 * TYPE CONVERSION :
 * 
 * 	byte --> short --> int --> long
 * 	char --> int
 * 	int, long--> float --> double 
 * 
 * 
 * TYPE CASTING :
 * 
 * long --> int --> short --> byte (loss of precision)
 * int --> char (loss of precision)
 * float --> int
 * double --> float
 * double --> long
 * float,double --> byte,short,int,long (loss of precision)
 * 
 * 
 * char can't be converted to short or byte
 * 
 */
public class TypeConversionAndTypeCasting {

	public static void main(String[] args) {
		boolean a1= true; 
		char b1='F'; 
		byte c1 = 127; 
		short d1= 32247; 
		int e1= 12348; 
		long f1= 1234569871236L; 
		float g1=1.23659874F; 
		double h1=123.2365985556225555555D;
		
		
		System.out.println("TYPE CONVERSION EXAMPLES: \n--------------------------------");
		
		// byte to short
		short d2=c1;
		System.out.println("Short values :"+d2);
		
		// char, byte , short to int - widening - done implicitly by compiler
		// unicode of char will be assigned to int, if exact value is required then use Character.getNumericValue()
		
		int e2=b1,e3=c1, e4=d1;
		System.out.println("Integers are: "+e2+","+e3+","+e4);
		
		// byte, short, int to long - widening- done implicitly
		long l1=c1,l2=d1,l3=e1;
		System.out.println("Long values are: "+l1+","+l2+","+l3);
		
		// byte,short,int,long to float - widening- done implicitly
		float g2=c1,g3=d1,g4=e1,g5=f1;
		System.out.println("Float values are: "+g2+","+g3+","+g4+","+g5);
		
		// float to double - widening- done implicitly
		double dd1=g1;
		System.out.println("Double values :"+dd1+"\n");
		
			
		// TYPECASTING
		System.out.println("TYPE CASTING EXAMPLES: \n-----------------------------------");

		// long, int, short to byte
		byte c2=(byte) f1,c3=(byte) e1,c4=(byte) d1;
		System.out.println("Type Casted into Byte values are: "+c2+","+c3+","+c4);
		
		// long, int to short
		short d3=(short) f1,d4=(short) e1;
		System.out.println("Type Casted into Short values are: "+d3+","+d4);
		
		// long to int
		int e5=(int) f1;
		System.out.println("Type Casted into Integer values are: "+e5);
		
		System.out.println("\n");
		
		//long,int to char
		e1=625;
		char b2=(char) f1,b3=(char) e1;
		System.out.println("Type Casted into Char values are: "+b2+","+b3);
		
		
		
	}

}
