package clone;

public class Department implements Cloneable
{

	private String Dname;
	private int DId;
	public String getDname() {
		return Dname;
	}
	public void setDname(String dname) {
		Dname = dname;
	}
	public int getDId() {
		return DId;
	}
	public void setDId(int dId) {
		DId = dId;
	}
	public Department(String dname, int dId) {
		super();
		Dname = dname;
		DId = dId;
	}
	
	public Department(Department dep) {
		// TODO Auto-generated constructor stub
		
		this.DId=dep.getDId();
		this.Dname=dep.getDname();
	}
	public void printble()
	{
		System.out.printf("Department name:"+Dname+" Id: "+DId+"\n");
		
	}
	
	@Override
	protected Department clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Department)super.clone();
	}
	
	
	
	
		
}
