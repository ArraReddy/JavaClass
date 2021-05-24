package clone;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException //throws CloneNotSupportedException 
	{
		// TODO Auto-generated method stub
		 
		
		
		
		
		
//		System.out.println("Befor cloning");
//		emp1.printble();
//		
//		System.out.println("After cloning");
		
		
		
//		Employee emp2;
//		try {
//			emp2 = (Employee)emp1.clone();
//			emp2.printble();
//		} catch (CloneNotSupportedException e) {
//			// TODO Auto-generated catch block
//			System.out.println("Not an isntence cannot deep clone");
//			
//			
//		}
		//emp2.printble();
		
//		emp2 = (Employee)emp1.clone();
//		Employee emp3=new Employee(emp1);
		
		
		

		
//		emp1.setName("don");
//		emp1.setId(135);
//		emp1.setDep(dep2);
//		
		
		
		
		
		//Object obj9=emp1.clone();
		
//		Object wrr=emp1.clone();
//		wrr.printble();
//		
//		Department dep1=new Department("Accounting", 1022);
//		Department dep2=new Department("HR", 7000);
//		
//		
//		
//		Employee emp1=new Employee(122, "kiran",dep1);
//		Employee emp2=new Employee(emp1);
//		Employee emp3=(Employee) emp1.clone();
//		
//		dep1.setDname("CE");
//		dep1.setDId(7000);
//		
//		
//		
//		
//		emp1.printble();
//		emp2.printble();
//		emp3.printble();
		
		Department dep1=new Department("Accounting", 1022);
		
		Employee emp1=new Employee(122, "kiran",dep1);
		Employee emp6=emp1;
		
		emp1.setId(546);
		emp6.setName("ram");
		
		emp1.printble();
		emp6.printble();
		System.out.println("***********************************************");
		
		Employee emp2=new Employee(122, "kiran",dep1);
		Employee emp3=(Employee) emp2.clone();
		Employee emp4=new Employee(emp2);
		
		
		emp2.setId(852);
		emp3.setName("Rob");
		//dep1.setDId(852852);
		emp2.getDep().setDId(456456);
		
		
		
		emp2.printble();
		emp3.printble();
		emp4.printble();
		System.out.println("***********************************************");
	
		Employee emp10=new Employee(122, "kiran",dep1);
		Employee emp11=emp10.clone();
		
		emp11.setId(888);
		emp10.setName("fish");
		emp11.getDep().setDId(4444566);
		
		
		emp11.printble();
		emp10.printble();
		
		
		
		
		
		
		
		
		
	
		

	

	}

}

