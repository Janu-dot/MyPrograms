package com.browsercommand;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {
	
public static void main(String[] args) throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	
	String baseUrl = ("http://demo.guru99.com/test/newtours/");
	Thread.sleep(5738);
	
	driver.get(baseUrl);
	String innerText = driver.findElement(By.xpath("//table/tbody/tr/td[2]" + "//table/tbody/tr[4]/td/" + "table/tbody/tr/td[2]/" + "table/tbody/tr[2]/td[1]/" + "table[2]/tbody/tr[3]/td[2]/font")).getText(); 		
	System.out.println(innerText); 
	driver.quit();
}
}