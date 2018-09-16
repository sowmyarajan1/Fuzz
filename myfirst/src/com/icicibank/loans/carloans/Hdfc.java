package com.icicibank.loans.carloans;

public class Hdfc implements Rbi{

	public static void main(String[] args) {
		
		Hdfc obj = new Hdfc();
		obj.deposit();
		obj.withdrawl();
	
	}

	@Override
	public void deposit() {
		
		System.out.println("I am inherited from Rbi");
		
	}

	@Override
	public void withdrawl() {
		
		System.out.println("I am inherited from Rbi");
		
	}

}
