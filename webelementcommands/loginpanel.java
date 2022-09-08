package com.webelementcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class loginpanel {

	public static void main(String[] args)  throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(5000);
		
		WebElement username =driver.findElement(By.id("txtUsername"));
		
		WebElement pwd =driver.findElement(By.id("txtPassword"));
		
		WebElement Submit =driver.findElement(By.id("btnLogin"));
		
		username.sendKeys("Admin");
		Thread.sleep(5000);
		
		pwd.sendKeys("admin123");
		Thread.sleep(5000);
		
		Submit.click();
		
		Thread.sleep(5000);
		driver.close();

	}

}
