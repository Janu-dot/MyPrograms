package com.linkedtext;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class linkedtext {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		  WebDriver driver= new ChromeDriver();
		
		 String ExpectedURL ="http://the-internet.herokuapp.com/key_presses";
		 
	  	driver.get(ExpectedURL);
		
	  	WebElement linktextonwindow = driver.findElement(By.linkText("Click Here"));
	  	
	  	linktextonwindow.click();
	  	
	  	Set<String> handle = driver.getWindowHandles();
	  	
	  	Iterator<String> it = handle.iterator();
	  	
	  	String Parentwindowaddress = it.next();
	  	
	  	System.out.println("ParentWindow : "+ Parentwindowaddress);
	  	String childwindowaddress= it.next();
	  	
	  	System.out.println("ChildWindow :"+ childwindowaddress);
	  	
	  	driver.switchTo().window(childwindowaddress);
	  	
	  	String childwindowtext= driver.findElement(By.xpath("//h3[contains(text(),'new')]")).getText();
	  	System.out.println(childwindowtext);
	  	
	  	driver.switchTo().window(Parentwindowaddress);
	  	
	  	Thread.sleep(2000);
	  	
	  	driver.quit();
	   	

	}

}