package com.string;

public class Stringbasics {
		
		  public static void main(String[] args)
		  {
		                           //TOTAL LIST OF STRING METHODS
		   //Shows the character at which index it is present.
		   System.out.println("============charAt()");
		   String str ="computer";
		   System.out.println("specific index :" + str.charAt(4));//u
		   System.out.println("specific index :" + str.charAt(7));//r
		   System.out.println("specific index :" + str.charAt(2));//m
		   System.out.println("specific index :" + str.charAt(0));//c
		   System.out.println("==============length()=========================");
		   
		   //It shows number of characters in string class
		   String s1 ="qspiders";

		   System.out.println("number of given array :" + s1.length());//7
		   System.out.println("===================toCharArray()=========================");
		   
		   //This method creates the other equivalent array for the current string
		   String s2 = "welcome";
		   char[] ch = s2.toCharArray();  
		    for(int i=0;i<ch.length;i++)
			{
				System.out.print(ch[i]);
			}
			
		   System.out.println("====================indexof==================");
		   
		   
		   
		   //indexOf() String method 
		   String s3 = "Developer";
		   System.out.println("diplays current index in number : " +s3.indexOf('v'));//2
		   int x = s3.indexOf('e');
		      System.out.println("number of occurence of indexOf e : " +x);
		   int y = s3.indexOf('e',x+1);
		      System.out.println("number of occurence of indexOfof e : " +y);
			int z = s3.indexOf('e',y+1);
		   System.out.println("number of occurence of indexOf e : " +z);
		   
		   System.out.println("============lastindexof=====================");
		   
		   
		   
		   //lastIndexOf() String method
		   System.out.println("displays current index in number : " + s3.lastIndexOf('D'));//0
		   
		   int a = s3.lastIndexOf('e');
		      System.out.println("number of occurence lastIndexOf of e : " +a);
		   int b = s3.lastIndexOf('e',a-1);
		      System.out.println("number of occurence lastIndexOf of e : " +b);
			int c = s3.lastIndexOf('e',b-1);
		   System.out.println("number of occurence lastIndexOf of e : " +c);
		   
		   System.out.println("==============contains()==============================");
		   //contains() method
		    String arg = "qspiders training institude";
			 System.out.println(arg.contains("train"));//true
			 System.out.println(arg.contains("spid"));//true
			 
			System.out.println("==============startswith()==============================");
		   //startsWith() method
		    String arg1 = "qspiders training institude";
			 System.out.println(arg1.startsWith("qspider"));//true
			 System.out.println(arg1.startsWith("Qspider"));//false
			 
			 System.out.println("==============endswith()==============================");
		   //endsWith() method
		    String arg2 = "qspiders training institude";
			 System.out.println(arg2.endsWith("tude"));//true
			 System.out.println(arg2.endsWith("ning"));//false
			 
			  System.out.println("==============equals()==============================");
		   //equals() method
		    String arg3 = "j2ee";
			 System.out.println(arg3.endsWith("J2ee"));//false
			 System.out.println(arg3.endsWith("j2ee"));//true
			 System.out.println(arg3.endsWith("Adv j2ee"));//false
			 
			System.out.println("==============equalsIgnoreCase()==============================");
		     //equalsIgnoreCase() method
		     String arg4 = "j2ee";
			 System.out.println(arg4.equalsIgnoreCase("J2ee"));//true
			 System.out.println(arg4.equalsIgnoreCase("j2ee"));//true
			 System.out.println(arg4.equalsIgnoreCase("Adv j2ee"));//false
			 
			 System.out.println("==============toUpperCase()==============================");
		     //toUpperCase() method
		     String arg5 = "JavA@123";
			 System.out.println(arg5.toUpperCase());//JAVA@123
			
			 
			 System.out.println("==============toLowerCase()==============================");
		     //toLowerCase() method
		     String arg6 = "hi METHO how ARE you";
			 System.out.println(arg6.toLowerCase());///hi metho how are you
			 
			 System.out.println("==============substring()==============================");
		     //substring() method	
			 
		     String arg7 = "Developer";
			 System.out.println(arg7.substring(4));//loper
			 System.out.println(arg7.substring(3));//per
			 System.out.println(arg7.substring(3,8));//elope(her 3 is considered and 8 is not considerd)
			 System.out.println(arg7.substring(0,9));//
			 
			 System.out.println("==============trim()==============================");
		     //trim() method (it elimintes the beginning and ending of thespace in the string)
		     String arg8 = " Roses are Red. ending ";
			 System.out.println(arg8);
			 System.out.println(arg8.trim());
			 
			 System.out.println("==============split()==============================");
		     //split()
		     String arg9 = " values of equality kindness loyality and integrity ";
			 String[] str2 = (arg9.split(" "));
			 for(int i=0;i<str2.length;i++)/////////////////////
			 {

				System.out.print(str2[i]); 
			 }
			 //length
			 //length()
			    
		  }
		}
	







	