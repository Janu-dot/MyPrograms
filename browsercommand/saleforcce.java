package com.browsercommand;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class saleforcce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		
		///driver.findElementById("username").sendKeys("jjr");
	
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("hello");
		Thread.sleep(1000);
		driver.findElementByName("pw").sendKeys("123456");
		Thread.sleep(1000);
		driver.findElementById("Login").click();
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
		Thread.sleep(1000);
		
    
	}

}
