package com.simplilearn.arrays.account;

public class AccountArray {

	public static void main(String[] args) {
		// TODO ::  WAP to create collection Accounts array => Accounts[] accounts
		// access data by index and iterate over all values.
		
		// create account type array
		Account[] accounts = new Account[5];

		// insert data into account array
		accounts[0] = new Account(10001,140000.00,"Nishant","nishant@gmail.com");
		accounts[1] = new Account(10002,135000.00,"Kumar","kumar@gmail.com");
		accounts[2] = new Account(10003,130000.00,"Ramakrishna","ramakrishna@gmail.com");
		accounts[3] = new Account(10004,125000.00,"Sundar","sundar@gmail.com");
		accounts[4] = new Account(10005,110000.00,"Mark","mark@gmail.com");
		
		System.out.println("Accounts count are "+ accounts.length);
		
		for (int i = 0; i < accounts.length; i++) {
			System.out.println("Account Details ["+ i +"] is -  " + accounts[i]);
		}
	}

}