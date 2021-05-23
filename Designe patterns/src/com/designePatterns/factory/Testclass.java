package com.designePatterns.factory;

public class Testclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Shape cir=new Square();
//		Shape rec=new Rectangle();
		
		Factory muFact=new Factory();
		
		Shape sqr=muFact.getShape("Square");
		sqr.draw();
		

	}

}
