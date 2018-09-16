package com.icicibank.loans.carloans;

public class Icici implements Rbi{

	public static void main(String[] args) {
		
		Icici obj = new Icici();
		obj.deposit();
		obj.withdrawl();

	}

	@Override
	public void deposit() {
		
		System.out.println("I am inherited from parent Rbi");
		
	}

	@Override
	public void withdrawl() {
		
		System.out.println("I am inherited from parent Rbi");
		
	}

}
