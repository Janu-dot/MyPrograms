package com.browsercommand;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Googlexpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver= new ChromeDriver();
		 
		 driver.get("https://www.google.com/");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("*$x(\"//div[@class='RNNXgb']\")/div/div[2]/div/input*"));
		 Thread.sleep(1000);
		 driver.quit();

	}

}
