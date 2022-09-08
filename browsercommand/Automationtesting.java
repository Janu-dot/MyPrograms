package com.browsercommand;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automationtesting 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver= new ChromeDriver();	
		 driver.get("http://demo.automationtesting.in/Register.html");
		 driver.manage().window().maximize();
		 String title = driver.getTitle();
		 System.out.println(title);
		 driver.findElement(By.xpath("//label[text()='Full Name* ']//following::input[1]")).sendKeys("janani");
		 driver.findElement(By.xpath("//label[text()='Full Name* ']//following::input[2]")).sendKeys("Raghu");
 
		
		 

		
	}

}
