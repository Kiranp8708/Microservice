package com.hdfc.loan.carloan;

public class Icici  implements Rbi
{
	public static void main(String[] args)
	{
		
		Icici  icici=new Icici();
		icici.deposit();
		icici.withrawl();
				
	}


	@Override
	public void withrawl()
	{
		System.out.println(" I  m withrawl in Icici Bank");
	}
	
	
	@Override 
	public void deposit()
	{
		System.out.println("I   m deposite In Icici bank");
	}
	

	
}
