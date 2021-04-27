import com.sun.tools.classfile.Opcode.Set;
import java.util.*;

public class set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Set<String> set=new HashSet<String>();
//		
//		set.add("Sham");
//		set.add("bob");
//		set.add("rie");
//		set.add("Sham");
//		set.add("bob");
//		set.add("rie");
//		
//		Iterator<String> it=set.iterator();
//		
//		while(it.hasNext())
//		{
//			System.out.println(it.next());
//		}
//		System.out.println("**********************");
//		for (String temp:set)
//		{
//			System.out.println(temp);
//		}
//		System.out.println("**********************");
//		
		
		Set<String> set=new TreeSet<String>();//used to sort so the addition class myst be an instence of comapriable
		
		set.add("Sham");
		set.add("bob");
		set.add("rie");
		set.add("Sham");
		set.add("bob");
		set.add("rie");
		set.add("a");
		
		Iterator<String> it=set.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("**********************");
		
		
		
		
		

	}

}
