package com.geekster;

public class CheckMethod {
	static void check(int n) {
		if (n>50&&n<100) {
			System.out.println(n+"is greater than 50 and less than 100");
		}else if (n<50) {
			System.out.println(n+"is less than 50");
		}else {
			System.out.println(n+"is greater than 100");
		}
	}

}
