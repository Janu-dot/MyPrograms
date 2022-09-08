package com.browsercommand;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class erail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://erail.in/");	
		Thread.sleep(500);
		
		driver.findElement(By.id("txtStationFrom")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.id("txtStationFrom")).sendKeys("mas",Keys.ENTER);
		Thread.sleep(2000);
		
		driver.findElement(By.id("txtStationFrom")).click();
		Thread.sleep(2000);
		
	     driver.findElement(By.id("chkSelectFromOnly")).click(); Thread.sleep(2000);
	     Thread.sleep(2000);
	     
	     driver.findElement(By.id("txtStationTo")).clear();
		 Thread.sleep(2000);
			
	     driver.findElement(By.id("txtStationTo")).sendKeys("sbc",Keys.ENTER);
	     Thread.sleep(2000);
	     
	     driver.findElement(By.id("txtStationTo")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("buttonFromTo")).click();
		 Thread.sleep(2000);
		 
		 List<WebElement> totalrows = driver.findElements(By.xpath("//table[@class='DataTable DataTableHeader TrainList TrainListHeader']//following::tr"));
		 System.out.println(totalrows.size());
		 
		
		 
		 for (int i = 1; i<=totalrows.size(); i++) 
		 {
			 List<WebElement> totalcolns = driver.findElements(By.xpath("//table[@class='DataTable DataTableHeader TrainList TrainListHeader']//following::td"));
			 System.out.println(totalcolns.size());
			 
			for (int j = 1; j <=totalcolns.size(); j++) 
			{
			String trains = driver.findElement(By.xpath("table[@class='DataTable DataTableHeader TrainList TrainListHeader']//following::tr["+i+"]//following::td["+j+"]")).getText();
			  System.out.println(trains);
			}
		 }
	     
	     driver.close();
	}

}
