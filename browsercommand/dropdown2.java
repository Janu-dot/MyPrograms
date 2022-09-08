package com.browsercommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
         
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath(" ")).click();
		Thread.sleep(1000);
	    
		driver.close();
		
	}

}
