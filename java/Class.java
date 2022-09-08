package com.java;

public class Class 
{
	static int a=2;
	       int b=3;
	       int c= a+b;
	static int d =5;
	
  public static void main(String[] args) 
	{
		//static can be accessed using class name directly
		System.out.println(a);
		
		//whereas non static should access by creating the object using the class name 
		Class obj = new Class();//object// constructor call
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println("The value of d : "+d);
	}

}
