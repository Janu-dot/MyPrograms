package com.string;

public class Reversestring2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    String str="How are you";
	    
		/*
		 * char ch[]=str.toCharArray(); for(int i=ch.length-1;i>=0;i--) {
		 * System.out.println(ch[i]); }
		 */
		
		String[] arr=str.split(" ");
		
		for(int i=arr.length-1;i>=0;i--)
		{
			
			System.out.print(arr[i]);
		}
		
		


	}

}
