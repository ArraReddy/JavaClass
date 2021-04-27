import java.util.StringTokenizer;

public class forString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch[]= {'h','e','l','l','o'};
		
		System.out.println("hdjhdf"+ch);// must print hashcode
		
		String str=new String(ch);
		System.out.println(ch);
		
		System.out.println("equeal check "+str.equals(ch));
		
		
		String s1="ehgk gee";
		String s2="ehgk gee";
		System.out.println("check 2 "+(s1==s2));
		
		String s3=new String("ehgk gee");
		System.out.println("check 3 "+(s1==s3));
		System.out.println( "Check 4 "+(s1.compareTo(s3)));
		System.out.println( "Check 4 here 0 means equeal"+(s1.compareTo(s2)));
		System.out.println("check 5 "+ (s1==s3.intern()));
		
		
		System.out.println(s1.charAt(3));
		System.out.println(s1.length());
		System.out.println(s1.format("date is %d", 30));
		System.out.println(s3.substring(2));
		System.out.println(s3.contains("ge"));
		System.out.println(s1.concat(s2));
		System.out.println(s1.replace("e", "d"));
		
		
		
		
		
		//string buffer
		StringBuffer sf1=new StringBuffer();
		System.out.println("cap"+sf1.capacity());
		sf1.append("hbghfkhbsdfkjhbnbhmsdvbkh");
		System.out.println(sf1);
		sf1.replace(0	, 3	, "2343");
		System.out.println(sf1);
		System.out.println(sf1.reverse());
		System.out.println(sf1.charAt(5));
		System.out.println(sf1.delete(0, 5));
		System.out.println(sf1);
		
		
		
		//String bUilder
		StringBuilder sf2=new StringBuilder();
		System.out.println(sf2.capacity());
		
		
		String s9="tshvg sdkv s ub ,h  akjb  khdvn b ";
		StringTokenizer stk=new StringTokenizer(s9);
		
		while (stk.hasMoreTokens())
		{
			System.out.println(stk.nextToken());
		}
		
		String[] s11=s9.split(",");
		System.out.println(s11);
		 
		
		
		System.out.println(s3.contains("ge"));
		
		
		
		
		

	}

}
