package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class statusofwebelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub\
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/register");
		Thread.sleep(5000);
		//isEnabled//is Displayed
		WebElement store =driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		System.out.println("Enter a isdisplayed" + store);
		System.out.println("Enter a isSelected" + store);
        System.out.println("Enter a isEnabled" + store);	
		
        store.isEnabled();
        store.isSelected();
        store.isEnabled();
       
	   WebElement female =  driver.findElement(By.id("gender-female"));
	   
	   WebElement male =  driver.findElement(By.id("gender-male"));
	   
	   System.out.println("Enter a isSelected" + female);
	   System.out.println("Enter a isSelected" + male);
	   
	  
	   female.click();
	   
	   Thread.sleep(5000);
		driver.quit();
	
		
		
		
	}

}
