package com.java;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		int sum=5;
		
		int c []= {2,3,5,6,7,8};
		System.out.println(c.length);
		
		String name = "janani r";
		System.out.println(name.length());
	
		
		
		
		
		for (int j = 0; j <name.length(); j++) 
		{
			System.out.println(name);
		}
		for(int i=0;i<c.length;i++) 
		{
			//System.out.println(c[i]);
			sum=sum+c[i];
		
		}
         System.out.println(sum);
  {
	  int add=sum/6;
      System.out.println(add);
}
}
}