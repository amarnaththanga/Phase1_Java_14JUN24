package com.simplilearn.arrays;

public class Exercise1 {

	public static void main(String[] args) {
		// WAP to create collection price array => float[] prices
		// access data by index and iterate over all values.

		// arrays with default values
		float price[] = new float[4];
		
		// add values 
		price[0] = (float) 125.36;
		price[1] = (float) 138.54;
		price[2] = (float) 156.65;
		price[3] = (float) 145.68;
		
		System.out.println("Price list length is :: "+ price.length);
		
		for (int i = 0; i < price.length; i++) {
			System.out.println("Price of index "+ i +" is :: "+ price[i]);
		}
		
	}

}