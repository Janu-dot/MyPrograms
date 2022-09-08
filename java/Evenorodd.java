package com.java;

import java.util.Scanner;

public class Evenorodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		System.out.println("n :");
		int num=sc.nextInt();
		
		////for (int i=0; i<n/2; i++)
		{
			if(num%2==0)
			
				System.out.println("it is even");
	    	else
			
				System.out.println("it is odd");
		}

	}

}
