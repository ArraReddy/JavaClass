package com.expection;

public class Exepection2 {
	
	static void demo()
	{
		try {
			throw new NullPointerException("Demo");
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Caught in Exp2/demo");
			throw e;
		}
	}



public static void main(String[] args)
{
	
	try {
		demo();
	} catch (NullPointerException e) {
		// TODO: handle exception
		System.out.println("Caught in main");
	}
	
}

}