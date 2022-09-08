package com.string;

public class Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "janani";  // string literal
		String S = new String("Janani");  /// New keyword
		
	
		String v="jjr";
		v.concat("janu");// why string is immutable in java?
		
		String s1="jeeva";
		
		String s4="jeeva";
		
		String s2="JEEVA";//equals()
	    String s3=new String("jeeva");//== operator
	    String s5="welcome";
	    
		System.out.println("output is :" + S);
		System.out.println("output is :" + str);
		System.out.println("Output is :" + v);
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println("output is :" + s1==s4);
		System.out.println("output is : " + s1==s3);
	    System.out.println("string length is :" + s1.length());
	    System.out.println("string length is :" + S.length());
	    System.out.println("output is : " + s5);   
	  
	    //Shows the character at which index it is present.
	    System.out.println("specific character at :" + s5.charAt(0));
	    System.out.println("specific character at :" + s5.charAt(3));
	    System.out.println("specific character at :" + s5.charAt(5));
	    
	    ////It shows number of characters in string class
	    System.out.println(" no of character: "+ s2.length());
	    
	  //This method creates the other equivalent array for the current string
	    char[] ch =s1.toCharArray();
	    for(int i=0;i<ch.length;i++)
	    {
	    	System.out.print(ch[i]);
	    }
	    
	    System.out.println("janani");
	    
	  //indexOf() String method 
	    
		   String X1= "Keerthi Karthiga ";
		   System.out.println(" index in number : " +X1.indexOf('t'));//4
		   
		   String X2="ram is boxer";
		   System.out.println(X2.contains("box"));
		   System.out.println(X2.contains("is"));
		   
	    
	    
	    
	}

}


// why string is immutable in java?
// String v="jjr";
// New String .concat(janu);
//