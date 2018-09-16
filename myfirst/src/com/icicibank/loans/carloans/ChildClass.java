package com.icicibank.loans.carloans;

public class ChildClass extends FirstAbstract {

	public static void main(String[] args) {
		
		ChildClass obj = new ChildClass();
		obj.m1();
		obj.m2();
		
	}

		
	@Override
	public void m2() {
		
		System.out.println("I am abstract method m2 from FirstAbstract");
		
	}
	
	

}
