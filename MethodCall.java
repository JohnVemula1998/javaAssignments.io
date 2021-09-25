package com.geekster;
//creates class name as Methodcall to call the methods from 
//Method_Overloading class.
public class MethodCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calling Method_Overloading class by using "new".
		Method_Overloading A = new Method_Overloading();
		//Calling different methods having same method name.
		A.add(1,2);
		A.add(1,2,3);
		A.add(2.5, 3.20);
		A.add(4.002, 5);

	}

}
