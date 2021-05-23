package com.designePatterns.factory;

public class Factory {
	
	
	public Shape getShape(String name)
	{
		if(name==null)
			return null;
		else if(name.equalsIgnoreCase("Square"))
		{
			return new Square();
		}
		else if(name.equalsIgnoreCase("Rectangle"))
		{
			return new Rectangle();
		}
		else
			return null;
	}

}
