package com.string;

public class Reverse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="How are you";
		
		System.out.println(str);
		
		System.out.println(str.length());
		
		char ch[]=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		
		String[] arr=str.split("  ");
		
		for(int i=arr.length-1;i>=0;i--)
		{
			
			System.out.println(arr[i]);
		}
		
		

	}

}
