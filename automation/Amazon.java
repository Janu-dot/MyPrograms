package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		Thread.sleep(1000);
        
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags",Keys.ENTER);
		Thread.sleep(8000);
			
        driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[5]/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();
		Thread.sleep(2000);
		
		 driver.navigate().back(); 
		 Thread.sleep(2000);
		 
	     driver.quit();
	}

}














/*
 * //Testcase 1(Amazon) 01) Launch Chome 02) Load https://www.amazon.in/ 03)
 * Type "Bags" in the Search box 04) Choose the third displayed item in the
 * result (bags for boys) 05) Print the total number of results (like 30000)
 * 1-48 of over 30,000 results for "bags for boys" 06)Choose New Arrivals (Sort)
 * 07)Click on Get it by tommorow 08)Print the total number of results (like
 * 891) 1-48 of 891 results for "bags for boys" 09)Confirm the results have got
 * reduced (use step 05 for compare) 10)Print the first resulting bag info
 * (name, discounted price) 11)Get the number of bags with Deals of the Days
 * 12)Get the color of the Deals of the Days 13)Click on the First Deal of the
 * day 14)Take screenshot and close///
 */