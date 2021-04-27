package raperClasses;

public class testClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a=10;
//		Integer t=new Integer(a);
//		
//		a=a+14;
//		t=t+6;
//		System.out.println(a);
//		System.out.println(t.compareTo(a));
		
		String str="UPES";
		String str2="India";
		//str2=str+"India";
		String str5="UPESIndia";
		System.out.println(str2==str5);
		//String str3=new String("UPES");
		
		
		
//		System.out.println(str);
//		System.out.println(str2==str);
//		System.out.println(str3);
		
		 str2=(str + str2).intern();
		 
		 System.out.println(str2==str5);
		 
		 
		 String s1="abcd";
		 String s2=new String(s1);
		 System.out.println(s1==s2);
		 
		 System.out.println(s1.charAt(2));
		 System.out.println(s1.length());
		 System.out.println(s1.substring(2));
		 System.out.println(s1.contains("bc"));
		 System.out.println();
		 
		 
		 String s4=s1.concat(s2);
		 String s5=s1+s2;
		 System.out.println(s5==s4);
		 
		 
		 String s6="     ghfgdbkhbsd";
		 System.out.println(s6.trim());
		 
		 StringBuffer sf1=new StringBuffer("jhsdbk");
		 System.out.println(sf1.capacity());
		 System.out.println(sf1);
		 sf1.insert(0 , "start");
		 System.out.println(sf1);
		 sf1.replace(2, 4, "insert");
		 System.out.println(sf1);
		 
		 
		 
		 
		
		
		
	
		
		

	}

}
