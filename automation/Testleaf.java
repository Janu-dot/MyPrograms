package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testleaf {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
			
		driver.get("http://leaftaps.com/opentaps/control/login");
		Thread.sleep(555);
		
		// write code
		String firstWindow =driver.getWindowHandle();
		
		driver.findElement(By.xpath("//input[@class=\"inputLogin\"]")).sendKeys("demosalesmanager");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(2000);
	
		driver.findElement(By.className("decorativeSubmit")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("label")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[text()='Leads']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("hi-tech");
	    Thread.sleep(2000);
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("hucj");
	    Thread.sleep(2000);
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("lcuh");
	    Thread.sleep(2000);
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("lcuh");
	    Thread.sleep(2000);
	    driver.findElement(By.name("departmentName")).sendKeys("eCe");
	    Thread.sleep(2000);
	    driver.findElement(By.name("description")).sendKeys("jbhgyjehfoiqwdasuikfhaeoefjaischkasnhc");
	    Thread.sleep(2000);
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kdjcnsdjkh@gmail.com");
	    Thread.sleep(2000);
	    
	    Select obj = new Select(driver.findElement(By.name("generalStateProvinceGeoId")));
		obj.selectByVisibleText("New York");
		Thread.sleep(3000);
		driver.findElement(By.name("submitButton")).click();
		Thread.sleep(2000);
		//http://leaftaps.com/crmsfa/control/viewLead?partyId=12033
		System.out.println(driver.getTitle());
		driver.close();
	    
	    
	}

}
