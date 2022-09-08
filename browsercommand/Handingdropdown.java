package com.browsercommand;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Handingdropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		Thread.sleep(2000);
		
		WebElement dropcty=driver.findElement(By.id("input-country"));
		Select drop=new Select(dropcty);
        //drop.selectByVisibleText("Bulgaria");
        //drop.selectByIndex(13);
       //drop.selectByValue("11");
		
		// selcet the option from dropdown woithout using methods
		
		List<WebElement>alloptions=drop.getOptions();
		for(WebElement option :alloptions)
		{
			if(option.getText().equals("Canada"))
			{
				option.click();
				break;
			}
		}
	}

}
