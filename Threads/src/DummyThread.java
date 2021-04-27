
public class DummyThread extends Thread  
{
	
	
	
	void work() {

		
		for (int i = 0; i < 10; i++) {
		
			
			try {
				System.out.println("Thread :"+currentThread().getId()+" iteration "+i);
				sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		work();
		
	}

}
