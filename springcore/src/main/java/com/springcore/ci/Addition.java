package com.springcore.ci;

public class Addition {
	
	private int A;
	private int B;
	
//	public Addition(int a, int b) {
//		super();
//		A = a;
//		B = b;
//	}
//
//	public Addition() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	
	public Addition(double a, double b) {
		A = (int)a;
		B = (int)b;
		System.out.println("constructor double: double");
		
	}	
	
	public Addition(int a, int b) {
		A = a;
		B = b;
		System.out.println("constructor int: int");
		
	}
	
	public Addition(String a, String b) {
		A = Integer.parseInt(a);
		B = Integer.parseInt(b);
		System.out.println("constructor String : String");
		
	}
	

	public void dosum() {
		
		System.out.println("a = " +this.A);
		System.out.println("b = " +this.B);
		
		System.out.println("sum is = " +(this.A + this.B ));
		
	}
	
	
	
	

}
