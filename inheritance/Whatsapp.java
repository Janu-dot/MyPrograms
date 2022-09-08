package com.inheritance;

		class whatsappv1
		{
			void sms()
			{
				System.out.println("messenger()...");
			}
		}
		class whatsappv2 extends whatsappv1
		      {
		       void calls()
		       {
		    	   System.out.println("calling");
		       }
			
		      }
		class whatsappv3 extends whatsappv2
		{
			void status()
			{
				System.out.println("status");
			}
		}

public class Whatsapp 
{

	public static void main(String[] args) 
			
{
		whatsappv3 v3=new whatsappv3();
		v3.status();
		v3.calls();
		
		
		whatsappv2 v2=new whatsappv2();
		v3.status();
		v2.calls();	
	
}

}
