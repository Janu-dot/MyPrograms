package com.java;

import java.util.Scanner;

public class fact
{

	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int num = scn.nextInt();
		int fact =1;
	    //for(int i=0;i<num;num--)
	    do
	    {
	    	fact = fact * num;
	    	num--;
	    }while(num>0);
    	System.out.println("The entered factorial for given number is : "+fact);
	}
}
		
		

		
		
		

