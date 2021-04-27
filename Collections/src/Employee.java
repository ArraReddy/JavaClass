import java.util.NavigableMap;

public class Employee implements Comparable<Employee> 
{
	
	public String name;
	
	public int id;
	
//	public Employee(int id, String name)
//	{
//		this.name=name;
//		this.id=id;
//		
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return this.getName().equals(((Employee) obj).getName());
	}

	@Override
	public int compareTo(Employee obj) {
		// TODO Auto-generated method stub
		
		//Employee temp=(Employee) obj;
		return this.getName().compareTo(obj.getName());
	}

	
	}

