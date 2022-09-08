package com.browsercommand;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate {

	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver= new ChromeDriver();
		 
		 driver.get("https://www.snapdeal.com/");
		 driver.navigate().to("https://www.amazon.in/");//
		 
		 ///driver.get("https://www.amazon.in/");
		 Thread.sleep(1000);
		 
		 driver.navigate().back();  // snapdeel
		 driver.navigate().forward();  //amazon
		 Thread.sleep(1000);
		 
		 driver.navigate().refresh();  //refresh or reload
		 Thread.sleep(1000);
		 
		 driver.close();
	}

}
