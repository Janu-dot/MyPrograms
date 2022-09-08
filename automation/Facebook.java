package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("Janani");
		driver.findElement(By.name("lastname")).sendKeys("Raghu");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type=\"text\"])[4]")).sendKeys("9842676595");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type=\"password\"])[2]")).sendKeys("jbhcdj");
		Thread.sleep(2000);
		
		Select obj = new Select(driver.findElement(By.name("birthday_day")));
		obj.selectByVisibleText("9");
		Thread.sleep(3000);
		
		Select obj1 = new Select(driver.findElement(By.id("month")));
		obj1.selectByVisibleText("Sep");
		Thread.sleep(2000);
		
		Select obj2 = new Select(driver.findElement(By.name("birthday_year")));
		obj2.selectByVisibleText("2000");
		Thread.sleep(3000);
		driver.findElement(By.name("sex")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(2000);
		
		
		driver.close();
		
		
		
	}

}
