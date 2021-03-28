package statickey;

public class Demostatic {
	
	
	
	static int b;
	
	static 
	{
		b=0;
	}
	
	
	
	
	
	public Demostatic()
	{
		
		b=1;
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Demostatic.b);
		
		Demostatic obj=new Demostatic();
		
		System.out.println(Demostatic.b);
		
		

	}

}
