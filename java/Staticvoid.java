package com.java;

public class Staticvoid {
	
	    static int x=10;
	           int y=20;
	           
	     void games()
	     {
	    	 System.out.println("FREEFIRE");
	     }
	     static void Icecream ()
	     {
	    	 System.out.println("BLUEBERRY");
	     }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(x);
		
		Staticvoid ref = new Staticvoid();
		System.out.println(ref.y);
		ref.games();
		Staticvoid.Icecream();

	}

}
