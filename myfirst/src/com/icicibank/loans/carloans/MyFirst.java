package com.icicibank.loans.carloans;

public class MyFirst {
	
	
	int a = 20;
	int b = 10;
	int c;
	
	public void add() {
		
		c = a + b;
		System.out.println("The result of add is "+ c);
	}
	
    public void sub() {
		
		c = a - b;
		System.out.println("The result of sub is "+ c);
	}

	public static void main(String[] args) {
		
		MyFirst obj = new MyFirst();
		obj.add();
		obj.sub();

	}

}
