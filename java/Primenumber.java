package com.java;

import java.util.Scanner;

public class Primenumber 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        
		Scanner tn=new Scanner(System.in);
		System.out.println("enter the num: ");
		int num = tn.nextInt();
			for (int i=2; i<num/2; i++)
			{
				if (i<=0)
				{
		           System.out.println("it is a prime number");
		           break;
		        } 
				else 
				{
				   System.out.println("it is not a prime number");	
				   break;
		        }
		    }   
     }
}
