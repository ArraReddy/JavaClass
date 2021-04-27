package com.expection;

public class ExepectionCheckedExp {
	
	static void throwExp() throws IllegalAccessException {
		System.out.println("location throwExp");
		throw new IllegalAccessException("demo");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			throwExp();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			//System.exit(0);
			e.printStackTrace();
		}finally {
			System.out.println("this is from finaly block");
		}

	}

}
