package com.string;

public class Reversestring1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1= "Hi how are you";
		System.out.println("output :" +s1.length());
		
        char[] ch =s1.toCharArray();
	    for(int i=ch.length-1;i>=0;i--)
	    {
	    	System.out.print(ch[i]);
	    }
	    
	    
	    
	}

			
}