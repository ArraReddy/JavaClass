package ThreadMethords;

public class AnanomousThread {
	
	String name;
	AnanomousThread(String name)
	{
		this.name=name;
	}
	
	public void task() 
	{
		
		for(int i=0;i<5;i++)
		{
			
			try {
				Thread.currentThread().sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			System.out.println("Thread name: "+name+"            count :"+i);			
		}
	}

}
