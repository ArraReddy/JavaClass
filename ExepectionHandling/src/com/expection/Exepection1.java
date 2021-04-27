package com.expection;

public class Exepection1 {
	
	static void nestedCatch(int a)
	{
		
		
		try {
			if(a==1)
				a=a/(a-a);
			if(a==2) {
				int c[]= {1};
				c[4]=55;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Arry aut of bound"+e);
		}
		
	}
	
	
	
	
	
	public static void main(String[] args)
	{
		try {
			nestedCatch(1);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("divided by zero exepection"+e);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Unknown Exepection"+e);
		}
	}
	
	
	

}
