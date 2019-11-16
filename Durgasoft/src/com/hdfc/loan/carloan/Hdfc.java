package com.hdfc.loan.carloan;

public class Hdfc implements Rbi
{
   public static void main(String[] args) 
   {
	   Hdfc h=new Hdfc();
	   h.deposit();
	   h.withrawl();
	}
   
   @Override
   public void withrawl()
   {
	   System.out.println(" I m overriden withrawl in HDFC");
   }
   @Override 
   public void deposit()
   {
	   System.out.println("Im Overriden deposite in HDFC");
   }
}
