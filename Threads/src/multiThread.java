
public class multiThread extends Thread {
	
	String name;
	
	public multiThread(String name)
	{
		this.name=name;
		
	}
	
	public void myWork()
	{
		
		for(int i=0;i<10;i++)
		{
			try {
				Thread.currentThread().sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
			
			System.out.printf(" "+i+" name: "+name+"\n");
		}
		System.out.println("\n");
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		myWork();
	}

}
