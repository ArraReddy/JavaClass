package ThreadMethords;

public class Methord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//using extends thread
		ExtendedThread obj1=new ExtendedThread("Process_1");
		ExtendedThread obj2=new ExtendedThread("Process_2");
		ExtendedThread obj3=new ExtendedThread("Process_3");
		ExtendedThread obj4=new ExtendedThread("Process_4");
		
		obj1.start();
		obj2.start();
		obj3.start();
		obj4.start();
		//*********************************************************************
		
		
		//using implements runnable if only class is available
		ImplementsRunnable obj5=new ImplementsRunnable("Process_5");
		ImplementsRunnable obj6=new ImplementsRunnable("Process_6");
		
		Thread objt5=new Thread(obj5);
		Thread objt6=new Thread(obj6);
		
		objt5.start();
		objt6.start();
		//**********************************************************************
		
		
		//Using Unanimous Runnable 
		AnanomousThread obj7=new AnanomousThread("Process_7");
		Thread objt7=new Thread( new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				obj7.task();				
			}			
		});
		objt7.start();
	
	
	//*************************************************************************
	
	
	//Synchronized thread	
	AnanomousThread obj8=new AnanomousThread("Process_8");
	Thread objt8_1=new Thread() {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			synchronized (obj8) {
				obj8.task();
			}
		}
	};
	
	Thread objt8_2=new Thread() {
		@Override
		public void run() {
			// TODO Auto-generated method stub
			synchronized (obj8) {
				obj8.task();
			}
		}
	};	
	objt8_1.start();
	objt8_2.start();

	
	
	}
}
