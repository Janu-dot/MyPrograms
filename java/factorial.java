package com.java;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int fact= scn.nextInt();
		int sum =1;
		do
		{
			sum = fact * fact-1;
			System.out.println(sum);
		}while(fact>0);
		
		
		
	}

}
