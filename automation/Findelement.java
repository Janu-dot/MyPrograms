package com.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Findelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		
		/*
		 * //1 findElement -- return single webelement
		 * 
		 * WebElement store=
		 * driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		 * store.sendKeys("JJR");
		 * 
		 * //2 findElements -- WebElement box =
		 * driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
		 * System.out.println(box.getText());
		 */
		
		//1 findElements -- return multiple webelements
		
		List<WebElement>links = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println("output is " + links.size());
		Thread.sleep(1000);
		for (WebElement ele :links)
		{
			System.out.println(ele.getText());
		}
		
		List<WebElement>store =driver.findElements(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println(store.size());
		
		driver.close();
		
	}

}
