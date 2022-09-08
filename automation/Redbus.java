package com.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notification");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.redbus.in/");
		Thread.sleep(1000);
		
		driver.manage().window().maximize();
		
		//To type FROM is chennai
		
		driver.findElement(By.id("src")).sendKeys("Chennai");
		Thread.sleep(2000);
		
		//To type TO is Bangalore
		driver.findElement(By.id("dest")).sendKeys("Bangalore");
		Thread.sleep(2000);
		
		//Select calendar(sep9-2022)

		driver.findElement(By.id("onward_cal")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']//tbody/tr[4]/td[5]")).click();	
		Thread.sleep(3000);

		//To click search button
		driver.findElement(By.id("search_btn")).click();
		Thread.sleep(4000);
		
         //To print all bus names
		
		List<WebElement> totalbuses = driver.findElements(By.xpath("//div[@class='clearfix row-one']"));
		System.out.println();
		
		 for (int i = 1; i < args.length; i++) 
		 {
			
			 (//div[@class='clearfix row-one'])[]/div[1]/div[1]
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
		
		/*
		 * { driver.findElement(By.xpath("//td[contains(text(),'Sept 2022')]")).
		 * 
		 * }
		 
	
		
		  List<WebElement> dates =driver.findElements(By. xpath("//table[@class='rb-monthTable first last']//td"));
		  
		  for(WebElement ele:dates) 
		  { 
			  String t=ele.getText(); 
			  if(t.equals(date)) 
			  {
		          ele.click(); 
		           break; 
		  }
			  }
		 
		driver.findElement(By.id("search_btn")).click();
		Thread.sleep(2000);
		//print the total result found
		
		
		
		/*
		 * List<WebElement> x= driver.findElements(By.xpath(
		 * "//div[@id=\\\"root\\\"]/div/div[2]/div[2]/div[2]/div[1]/span[1]"));
		 * x.size(); System.out.println("Text content is : " + x); Thread.sleep(2000);
		 */
		
		/*
		 * String result= driver.findElement(By.xpath(
		 * "//div[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[1]/span[1]")).getAttribute(
		 * "found"); System.out.println("total result"+ result.length());
		 * Thread.sleep(2000);
		 */
		
		/*
		 * List<WebElement> found =driver.findElements(By.xpath(
		 * "//div[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[1]/span[1]/span"));
		 * System.out.println("Total no of result" + found.size()); Thread.sleep(2000);
		 */
		
		//driver.close();
	}

}
