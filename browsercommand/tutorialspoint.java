package com.browsercommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tutorialspoint 
{

	public static void main(String[] args) throws InterruptedException 
{
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();   
			
		   WebDriver driver= new ChromeDriver();		
		
		   driver.get("http://www.tutorialsninja.com/");
		   Thread.sleep(2000);
		   
		   driver.findElement(By.xpath("//a [text()='demo/']")).click();
		   Thread.sleep(2000);
		   
		   driver.findElement(By.xpath("// a [text()='Desktops']")).click();
		   ///driver.findElement(By.xpath("/html/body/div[1]/nav/div[2]/ul/li[1]/a")).click();
		   Thread.sleep(2000);
		
		   driver.findElement(By.xpath("//  a[text()='PC (0)']")).click();
		   Thread.sleep(2000);	 
			
		   driver.findElement(By.xpath("//  a[text()='Continue']")).click();
		   Thread.sleep(2000);
		   
	   	   driver.quit();
	}

}
/////driver.findElement(By.xpath("/html/body/div[1]/nav/div[2]/ul/li[1]/a")).click();
	