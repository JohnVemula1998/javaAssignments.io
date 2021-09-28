package com.geekster;

public class Age_Vote {
	static boolean vote(int n) {
		if(n>18) {
			System.out.println("He is eligible to vote");
			return true;
		}else {
			System.out.println("He is not eligible to vote");
			return false;
		}
	}

}
