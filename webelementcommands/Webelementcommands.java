package com.webelementcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Webelementcommands {

	public static void main(String[] args) throws InterruptedException {									
		    		
		    	    WebDriverManager.chromedriver().setup();   
					
					WebDriver driver= new ChromeDriver();		
					
					driver.get("http://demo.guru99.com/test/newtours/register.php");
					
				    Thread.sleep(5000);
				    
				    driver.findElement(By.name("firstName")).sendKeys("mercury");
				    
				    Thread.sleep(5000);
				    
				    driver.findElement(By.name("lastName")).sendKeys("mercury");
				    
				    Thread.sleep(5000);
				    
				    driver.findElement(By.name("phone")).sendKeys("9842676595");
				    
				    Thread.sleep(5000);
				    
				    driver.findElement(By.name("userName")).sendKeys("abc@gmail.com");
			        
				    Thread.sleep(5000);
				    
                     driver.findElement(By.name("address1")).sendKeys("kasinayakanpatti");
			        
				    Thread.sleep(5000);
				    
                    driver.findElement(By.name("city")).sendKeys("Tirupattur");
			        
				    Thread.sleep(5000);
				    
                    driver.findElement(By.name("state")).sendKeys("TamilNadu");
			        
				    Thread.sleep(5000);
				    
                    driver.findElement(By.name("postalCode")).sendKeys("635 601");
			        
				    Thread.sleep(5000);
				    
                    driver.findElement(By.name("country")).sendKeys("canada");
			        
				    Thread.sleep(5000);
				    
				    driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
				    
				    Thread.sleep(5000);

				    driver.findElement(By.name("password")).sendKeys("anun2A1@");
				    
				    Thread.sleep(5000);
				    
				    
				    driver.findElement(By.name("confirmPassword")).sendKeys("anun2A1@");
				    
				    Thread.sleep(5000);
				    
				    
				    driver.findElement(By.name("submit")).click();
					
				    
				    Thread.sleep(5000);

				    
				    driver.close();
				    
				    
		        		
				    
}
	
}
