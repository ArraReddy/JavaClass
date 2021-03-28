package com.Nested;

public class NestedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer obj1=new Outer();
		Outer.Inner obj2=new Outer.Inner();
		
		System.out.printf("value i Inner"+obj2+"\n");
		System.out.printf("value of outer"+obj1+"\n");
		
		System.out.println("value of main ois "+Outer.b);
		
		
	}

}
