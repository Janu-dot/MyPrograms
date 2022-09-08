package com.string;

public class Reversestring3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String str="How are you";
		 
		 String[] arr=str.split(" ");
			
			for(int i=arr.length-1;i>=0;i--)
				
				
			{
				String S=arr[i];
				 S=S+" ";
				
				 ///String[] str2 = (str.split(" "));
				
				System.out.print(S);
				
			}
			
			

	}

}
