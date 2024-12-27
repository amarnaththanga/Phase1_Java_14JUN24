package com.simplilearn.typecasting;

public class ExplicitTypeCastDemp {

	public static void main(String[] args) {
		// Explicit typecast : does not happen automatically
		/**
		 * Narrowing : Converts data of incompatible type 
		 * Convert data from higher range value to lower range value.
		 * double => float => long => int => short => byte.
		 */
		
		
		double price = 130.34;
		
		long bigPrice = (long) price; // Narrowing => double(8 byte) -> long (8 byte)
		
		int intPrice = (int) bigPrice; // Narrowing => long(8 byte) -> int (4 byte)		
		
		short shortPrice = (short) bigPrice; // Narrowing => long(8 byte) -> short (2 byte)
		
		byte bytePrice = (byte) intPrice; // Narrowing => int(4 byte) -> byte (1 byte)
		// While converting to byte, it should validate the -128 to 127 range and then display the end result after the deduction 
		// For eg. 130.34 going to be like this: Step01 :-  130-127 = 3 ; Step02 :- -128(1),-127(2),-126(3)
		
		
		System.out.println("Double price : "+price);
		System.out.println("Long price : "+bigPrice);
		System.out.println("Integer price : "+intPrice);
		System.out.println("Short price : "+shortPrice);
		System.out.println("Byte price : "+bytePrice);

	}

}
