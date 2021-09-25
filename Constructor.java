package com.geekster;

public class Constructor {
	private int UserId;
	private String UserName;
	private int UserAge;
	//Creating a Constructor with Parameters.
	public  Constructor (int UserId, String UserName, int UserAge) {
		this.UserId=UserId;
		this.UserName=UserName;
		this.UserAge=UserAge;
	}
	//Creating a Constructor with no Parameters.
	//defining values with in the constructor.
	public Constructor() {
		this.UserId=2;
		this.UserName="John Cena";
		this.UserAge=44;
	}
	public  Constructor(int UserId) {
		this.UserId=UserId;
		this.UserName=UserName;
		this.UserAge=UserAge;
	}
	public void show() {
		System.out.println("Provided user id: "+UserId);
		System.out.println("Provided user name: "+UserName);
		System.out.println("Provided user age: "+UserAge);
	}
	
}
