package clone;

public class Test {

	public static void main(String[] args) //throws CloneNotSupportedException 
	{
		// TODO Auto-generated method stub
		 
		
		
		
		Department dep1=new Department("Accounting", 1022);
		Employee emp1=new Employee(122, "kiran",dep1);
		
		System.out.println("Befor cloning");
		emp1.printble();
		
		System.out.println("After cloning");
		
		
		
		Employee emp2;
		try {
			emp2 = (Employee)emp1.clone();
			emp2.printble();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			System.out.println("Not an isntence cannot deep clone");
			
			
		}
		//emp2.printble();
		
		
		Department dep2=new Department("HR", 1028);

		
		emp1.setName("don");
		emp1.setId(135);
		emp1.setDep(dep2);
		emp1.printble();
		
		//Object obj9=emp1.clone();
		
//		Object wrr=emp1.clone();
//		wrr.printble();
		
	

	}

}
