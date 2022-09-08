package com.browsercommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flightdetails {

	public static void main(String[] args) throws InterruptedException {
										
    		
	    	 WebDriverManager.chromedriver().setup();   
				
				WebDriver driver= new ChromeDriver();		
				
				driver.get("http://demo.guru99.com/test/newtours/reservation.php");
				
			    Thread.sleep(5000);
			    
			    WebElement oneway = driver.findElement(By.xpath("//input[@value='oneway']"));
			    
			    Thread.sleep(5000);
			    
			    boolean display = oneway.isDisplayed();
			    
			    System.out.println("Element displayed : "+display);
			    
			    boolean enable = oneway.isDisplayed();
			    
			    System.out.println("Element enabled : "+enable);
			    
			    if(oneway.isSelected()!=true){
			    	
			    	oneway.click();
			    
			    }

       
			    System.out.println("Element selected :"+ oneway.isSelected());
			    
			    Thread.sleep(5000);
			    
			    driver.close();
			    
			    
			    

	}

}