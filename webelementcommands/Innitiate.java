package com.webelementcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Innitiate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://ncrpnbinnitiate.aparinnosys.com/Login.aspx");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("janani.raghunayakam@aparinnosys.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("password")).sendKeys("J@nu9921");
		
		Thread.sleep(2000);
			
		driver.findElement(By.id("btnLogin")).click();
		
		//driver.close();
		
		
	}

}
