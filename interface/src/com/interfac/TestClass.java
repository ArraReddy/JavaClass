package com.interfac;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Printing obj=new Printing();
//		obj.Hellow();
//		obj.Bye();
		
		Netflex obj=new Netflex();
		obj.Asia();
		obj.Europe();
		obj.UK();
		
		NetflexAsia asia=obj;
		asia.Asia();
		
		//Netflex obj44=(Netflex)new NetflexAsia();
		
		NetflexUK UK=new Netflex();
		UK.UK();
		
		System.out.println(asia instanceof NetflexEurope  );
		
		
		
		
		
		Printable dummy=new Printable() {
			
			@Override
			public void Hellow() {
				// TODO Auto-generated method stub
				System.out.println("hellow again");
				
			}
			
			@Override
			public void Bye() {
				// TODO Auto-generated method stub
				System.out.println("bay again");
				
			}
		};
		
		dummy.Bye();
		
		
		
		System.out.println(obj.PLATINUMPLANE);
		System.out.println(NetflexAcc.PLATINUMPLANE);
		
		//NetflexAcc.platinumPlan=300; //dosnot work as platniumplan is static final
		
		
		
//		Netflex obj55=new Netflex();
//		NetflexAsia obj77=new Netflex();
//		System.out.println(obj55 instanceof Netflex);
//		System.out.println( instanceof NetflexEurope);
		
		
		
		System.out.println(obj instanceof NetflexAsia);

		

	}

}
