package com.java;

import java.util.Scanner;

public class scannerclass 
{
	public static void main(String[] args) 
	{
		Scanner en = new Scanner(System.in);
		
		System.out.println("Enter the num1 : ");
		int num1 = en.nextInt();
		
		System.out.println("Enter the num2 : ");
		int num2 = en.nextInt();
		
		System.out.println("Enter the num3 : ");
		int num3 = en.nextInt();
		
		int val = num1+num2+num3;
		
		System.out.println("The value is : "+val);

	}

}
