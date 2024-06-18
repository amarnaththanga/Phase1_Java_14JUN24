package com.simplilearn.typecasting;

import java.util.Scanner;

public class NumericDataConvertor {

	public static void main(String[] args) {
		// step 1 : collect input from user
		Scanner vInput = new Scanner(System.in);
		System.out.println("-----------------------------------------");
		System.out.println(" :: Welcome to numeric convertor :: ");
		System.out.println(" :: Enter a integer number vaule (-128 to 127) :: ");
		System.out.println("-----------------------------------------");
		int userInput = vInput.nextInt();
		
		// System.out.println("User input : "+userInput);
		// step 2: convert user input into other types
		
		// Implicit Type cast
		long bigValue = userInput;
		
		float floatValue =  userInput;
		
		double doubleValue = userInput;
		
		// Explicit Type Cast
		byte byteValue = (byte) userInput;
		
		short shortValue = (short) userInput;
		
		
		System.out.println("Numeric values after conversion");
		System.out.println("byteValue is:"+byteValue);
		System.out.println("shortValue is:"+shortValue);
		
		System.out.println("bigValue is:"+bigValue);
		System.out.println("floatValue is"+floatValue);
		System.out.println("doubleValue is "+doubleValue);
		
	}

}
