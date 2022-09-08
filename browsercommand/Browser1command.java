
package com.browsercommand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser1command {
	
	   
	public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();   
			
		   WebDriver driver= new ChromeDriver();		
		
		
		
		//driver.get("http://newtours.demoaut.com/index.php")  ;
		
		driver.get("https://www.amazon.in/");
		
		String url = driver.getCurrentUrl();
		
	    System.out.println("URL : "+url);
	    
	    System.out.println("URL:"+driver.getCurrentUrl());
	   
	    
		String title = driver.getTitle();
		
		System.out.println("URL:"+ driver.getTitle());
		
		System.out.println(title);
        
		//System.out.println(driver.getPageSource());
		
		
		driver.navigate().to("http://demo.guru99.com/test/newtours/");
		
		Thread.sleep(5000);
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		Thread.sleep(5000);
		
		
		
		driver.close();
		
		//driver.quit();
		
		
	}

}
