package com.browsercommand;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rediff {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		Thread.sleep(100);
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("helo");
		driver.findElement(By.cssSelector("input#password")).sendKeys("goodbye");
		driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();    
		Thread.sleep(100);
		/*$x("//div[@class='RNNXgb']")/div/div[2]/div/input*/
	
	}

}
