package com.Nested;

public class Outer {
	
	private int a=89;
	static int b=90;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "in Outer Class"+a+""+b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	public static class Inner {

		
		//Outer obj=new Outer();
			
			Outer obj=new Outer();
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "in inner Class"+obj.a+""+b;
			
			

		}

	}

	

	
	
	
	

}
