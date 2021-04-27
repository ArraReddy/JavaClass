
public class MultTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		multiThread obj1=new multiThread("001");
		multiThread obj2=new multiThread("002");
		multiThread obj3=new multiThread("003");
		multiThread obj4=new multiThread("004");
		
//		obj1.start();
//		obj2.start();
//		obj3.start();
//		obj4.start();
		
		obj1.run();
		obj2.run();
		obj3.run();
		obj4.run();
		
//		obj1.myWork();
//		obj2.myWork();
//		obj3.myWork();
		
		Thread t=new Thread(new Runnable()
				{

					@Override
					public void run() {
						// TODO Auto-generated method stub
						
					}
			
				});
		
		
		multiThread obj5=new multiThread("004");
		Thread newt=new Thread(obj5);
		newt.start();
		
		newt.setPriority(newPriority);
		


	}

}
