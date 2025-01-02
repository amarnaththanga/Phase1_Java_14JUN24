package com.simplilearn.arrays;

public class Exercise2 {

	public static void main(String[] args) {
		// WAP to create collection ips address array =>
		// String[] ips = {"192.168.11.13","192.168.11.15"}
		// access data by index and iterate over all values.
		
		// arrays with default values
		String ips[] = {"192.168.11.13","192.168.11.14","192.168.11.15","192.168.11.16"};
		
		System.out.println("Size :: "+ips.length);
		
		for (int i = 0; i < ips.length; i++) {
			System.out.println("ip number of index "+ i +" :: "+ips[i]);
		}

	}

}