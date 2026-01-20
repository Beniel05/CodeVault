package com.basics.beniel;

public class PrimitiveTypes {

	public static void main(String[] args) {
		
		byte b = 1;
		short s;
		s = 2;
		s = 3; // s = 3
		
		int i = 3;
		long l = 4; // l = 4
		
		char c = 'a';
		
		boolean bool = true;
		
		float f = 1.2f;
//		float f = 1.2F; -> F f both are acceptable.
		
		double d = 1.2;
		
//		long l2 = 2_000_000_000_000;
//		(l2) just ready the error message by un-commenting it!
		
		long l3 = 2_000_000_000_000L;
//		long l3 = 2_000_000_000_000l; -> L l both are acceptable
	
		// var - only be used with java 10 or above.
		var v = 10; // v is assigned with an integer.
		
//		v = true;
//		v = 1.3
		
		
		
		// Widening Conversion:
		
		int i3 = s; // i3 = 3
		// A smaller data type can be assigned to a larger data type — Widening Conversion

		
		/* Java Widening Conversion: In Java, a smaller data type can be automatically assigned to a larger data type.
		 * This is called widening conversion or implicit casting. */
		
		char c2 = 65; // ASCII value
		System.out.println(c2);
		
		double d2 = i3; // d2 = 3
		System.out.println(d2);
		d2 = l; // d2 = 4
		System.out.println(d2);
		
		
		// Narrow Conversion: converts a larger data type to a smaller one, requires explicit casting, and may cause data loss.
		b = (byte)i3; // b = 3
		System.out.println(b);
		
		byte b2 = 100; // literals (100 - value) can be converted automatically
		
		byte b3 = (byte)130; // Overflow. byte ranges from only -128 to 127. 
		System.out.println(b3);
		
		// Converting long -> double and back to long from double
		long number = 499_999_999_000_000_001L;
		double converted = (double) number;
		System.out.println(number - (long) converted);
		// IEEE-754 precision loss
		
		// Wrapper class
		Integer i4 = 1;   // autoboxing (int -> Integer)
		int i5 = i4;     // unboxing (Integer -> int)
		
		Integer x = null;
		int y = x; // NullPointerException

	}
}
