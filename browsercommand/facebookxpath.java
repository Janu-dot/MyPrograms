package com.browsercommand;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebookxpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver= new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(1000);
		 ///tagName[@attribute='value'] -xpath
		 /*driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Janu");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("JJR");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@value='1']")).click();*/
		 
		 //tagName[attribute='value'] - CSS
		 driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Janu");
		 Thread.sleep(1000);
		 driver.findElement(By.cssSelector("input[value='1']")).click();
		 Thread.sleep(1000);
		 
		 
		 
		 driver.quit();

	}

}
