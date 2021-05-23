package com.designePatterns;

public class Printer {
	
	//Singleton Pattern
	
	public static Printer hp;
	
	private Printer() {
		// TODO Auto-generated constructor stub
		System.out.println("Printer created "+this);
	}

	public static Printer getPrinter() {
		
		//lazey Initelasitin 
		if(hp==null)
		{
			hp=new Printer();
			
		}
		
		return hp;
		
	}

	
	

}
