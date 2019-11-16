package com.hdfc.loan.carloan;

public interface Rbi 
{
  //hiring the implemation details and 
	//exposing the service name is called Interface.
	
	public void withrawl();
	public void deposit();
	//Rbi i= new Rbi();
	
	
	public static void main(String [] args)
	{
	Rbi i;
	i=new Icici();
	i.deposit();
	i.withrawl();
 
	
	i=new Hdfc();
	i.deposit();
	i.withrawl();
	
	}
	
}
