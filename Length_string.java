package com.geekster;
import java.util.*;
public class Length_string {
	public static void main(String[] args) {
	
	Scanner x = new Scanner(System.in);
	
	String name = x.nextLine();
	
	if(name.length()<4) {
		System.out.println("Name is Short");
	}else {
		System.out.println("Name is Long");
	}
	}
	
}
