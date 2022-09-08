package com.string;

public class stringreverseyou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "Hi how are you";
		
		 char[] ch=str.toCharArray();
				 
		 for(int i=ch.length-1;i>=0;i--)
	   {
			 for(int j=ch.length+1;j<=0;j++)
			 {
		    	System.out.println(ch[i]);
		     }
		
		
			    System.out.println();
		}

	}

}
