package com.project;

public abstract  class project {
	
	public static final int star=5;

	public void synopas()
	{
		System.out.println("this is synopisis");
	}
	public void developAlgo()
	{
		System.out.println("this is develipAlgo");
	}
	public void implement()
	{
		System.out.println("this implementatio is not done");
		specialFunction();
	}
	public void present()
	{
		System.out.println("i a in present");
	}
	
	public void printstar()
	{
		System.out.println("stare:"+star);
	}
	
	
	public Object dummy()
	{
		System.out.println("in dummy");
		return 1;
	}
	
	public abstract void specialFunction();

}
