package com.hdfc.loan.carloan;

public class ChildClass extends  FirstAbstract
{
	public static void main(String[] args) 
	{
		 ChildClass c=new ChildClass();
		 c.m1();
		 c.m2();
		
	}
	@Override
	public void m1()
	{
		System.out.println("  I  m M1 overrired by  conrete from child  Class ");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println(" I m overriden m2 from Child Class");
	}
	
}
