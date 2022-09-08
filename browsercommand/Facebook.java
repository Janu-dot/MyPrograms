package com.browsercommand;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver= new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 Thread.sleep(1000);
		 //driver.findElement(By.cssSelector("#email")).sendKeys("emailaddress");////input[@id="email"]
		// Thread.sleep(1000);
		/* driver.findElement(By.name("email")).sendKeys("janu@gamil.com");
		 Thread.sleep(1000);*/
		 driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("janu");
		 Thread.sleep(5555);
		 
		 driver.findElement(By.id("pass")).sendKeys("jjt");
		 Thread.sleep(1000);
		 driver.findElementByLinkText("Forgotten password?").click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id=\'u_0_2_LZ\']/div[3]/a")).click();
		 Thread.sleep(1000);	 
		 driver.quit();
		 
	}

}
