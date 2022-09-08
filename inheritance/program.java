package com.inheritance;

class InstagramV1
{
	void postphoto()
	{
		System.out.println("post photo()...");
	}
		
}
class InstagramV2 extends InstagramV1
{
	void directmessenger()
	{
		System.out.println("directmessenger()...");
	}
}
public class program
{
	public static void main(String[] args)
{
		// TODO Auto-generated method stub
		InstagramV2 V2=new InstagramV2();
		V2.directmessenger();
		V2.postphoto();
		
		
		InstagramV1 V1=new InstagramV1();	
		V1.postphoto();
		V2.directmessenger();
}
}
		
