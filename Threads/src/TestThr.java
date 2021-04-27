
public class TestThr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiThread obj1=new multiThread("001");
		multiThread obj2=new multiThread("002");
		multiThread obj3=new multiThread("003");
		multiThread obj4=new multiThread("004");
		
		obj1.setPriority(Thread.MIN_PRIORITY);
		obj4.setPriority(Thread.MAX_PRIORITY);
		
		
		obj1.start();
		obj2.start();
		obj3.start();
		obj4.start();
		
		System.out.println("obj1 priority: "+obj1.getPriority());
		System.out.println("obj2 priority: "+obj2.getPriority());
		System.out.println("obj3 priority: "+obj3.getPriority());
		System.out.println("obj4 priority: "+obj4.getPriority());
		
	}

}
