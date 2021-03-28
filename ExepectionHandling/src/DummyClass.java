
public class DummyClass {

	public static void main(String[] args) throws IllegalAccessException {
		// TODO Auto-generated method stub
		
		System.out.println("Hellow world");
		
		int a=10,b=0,c;
		try
		{
		c=a/b;
		
		throw new IllegalAccessException();
		}
		catch(ArithmeticException e)
		{
			System.out.println("error "+e);
		}

//		catch(ArithmeticException e)
//		{
//			System.out.println("error "+e);
//		}
//		
		
		System.out.printf("division:");

	}

}
