package com.webelementcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class formyproject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/form");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.id("first-name")).sendKeys("janu");
		Thread.sleep(500);
		
		driver.findElement(By.id("last-name")).sendKeys("Ram");
		Thread.sleep(900);
		
		driver.findElement(By.id("job-title")).sendKeys("Testing");
		Thread.sleep(800);
		
		driver.findElement(By.id("radio-button-2")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.id("checkbox-2")).click();
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.xpath("//option[text()='Select an option']//following::option[1]"));
		year.click();
		Thread.sleep(5000);
		
		
		//driver.findElement(By.id("form-control")).
		/*
		 * WebElement rr = driver.findElement(By.
		 * xpath("//option[text()='Select an option']//following::option[1]")); Select
		 * obj = new Select(rr); obj.selectByVisibleText("0-1"); Thread.sleep(2000);
		 */
		
		
		driver.close();
		
	}

}
