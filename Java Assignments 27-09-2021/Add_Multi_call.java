package com.geekster;

public class Add_Multi_call {

	public static void main(String[] args) {
		Add_Multi m = new Add_Multi();
		int a = m.add(12,13);
		System.out.println(a);
		int b = m.multi(12, 13);
		System.out.println(b);

	}

}
