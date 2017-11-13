package com.icicibank.loans.personalloans;

public class PersonalLoans implements NewInterface {
	int a=10;
	int b=20;
	public void m1() {
		System.out.println("Properties");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Selenium Automated");
		PersonalLoans p1=new PersonalLoans();
		p1.m1();
		System.out.println(p1.a);
		PersonalLoans p2=new PersonalLoans();
		p2.m1();
		System.out.println(p2.b);
		p2.n();
	}

	@Override
	public void n() {
		System.out.println("Abstract");
		// TODO Auto-generated method stub
		
	}

}
