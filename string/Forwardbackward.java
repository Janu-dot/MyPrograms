package com.string;

import java.util.Iterator;

public class Forwardbackward {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S="welcome";
		
		char ch[]=S.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.println(ch[i]);
		}
		
		System.out.println("output :" + S);
	    
        /*for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			*/
		}
        
	}


