package wrapperClasses;

public class dummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		Integer b=105;
		
		String num="1255";
		Integer q=new Integer(num);
		
		
		
		
		String s1="the";
				
		String s3="thewith";
		
		
		s1=s1+"with";
		System.out.println(s1==s3);
		
		s1=s1.intern();
		System.out.println(s1==s3);
		
		
		int ab=5;
		
		Integer ba=new Integer(ab); //wrapping or boxing
		
		//ba.
		
		int v=ba.intValue();//un-wrapping or un-boxing
		
		
		//int to string
		int tr=1894;
		String s4=String.valueOf(tr);  //String str2=new String(tr2); dosnot work
		
		Integer tr2=new Integer(s4);
		
		String s11="11dhbs";
		Integer re11=new Integer(s11);
		System.out.println(re11);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
