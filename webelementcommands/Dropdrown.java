package com.webelementcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdrown {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/reservation.php");
		
		Select obj = new Select(driver.findElement(By.name("passCount")));
		obj.selectByVisibleText("1");
		Thread.sleep(8000);
		
		Select a = new Select(driver.findElement(By.name("fromPort")));
		a.selectByValue("Frankfurt");
		Thread.sleep(7000);
		
		Select b = new Select(driver.findElement(By.name("fromMonth")));
		b.selectByIndex(9);
		
		Select c = new Select(driver.findElement(By.name("toDay")));
		c.selectByIndex(30);
		Thread.sleep(5000);
		
		driver.close();


	}

}
 