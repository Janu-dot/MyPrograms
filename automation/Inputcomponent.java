package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Inputcomponent {

	private static WebElement findElement;

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/input.xhtml;jsessionid=node0tmb2389go0xlxjvuy66xu9p668024.node0");
		Thread.sleep(555);
		
		driver.findElement(By.name("j_idt88:name")).sendKeys("janajn");
		Thread.sleep(1000);
		
		WebElement hm = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']"));
		hm.clear();
		hm.sendKeys("chack");
		Thread.sleep(1000);
		//to verify the disabled box
		
		WebElement st =driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		boolean displayed = st.isDisplayed();
        if(displayed == true)
        {
        	System.out.println("the box is disabled");
        }
        else {
        	System.out.println("the box is enabled");
        }
        ///to clear
        driver.findElement(By.xpath("(//input[@type='text'])[5]")).clear();
        System.out.println("the clear the type text cleared");
        Thread.sleep(2000);
        
        //to retrieve the text
        
        String t= driver.findElement(By.xpath("//h5[contains(text(),'Retrieve the typed text.')]/following::input[1] ")).getAttribute("value");
        System.out.println("Text content is : " + t);
        Thread.sleep(2000);
       
        //TO ENTER EMAIL AND CONFRIM TO CHECK
        
        driver.findElement(By.xpath("//input[@placeholder='Your email and tab']")).sendKeys("jdcnhduj@gmail.com",Keys.TAB);
        Thread.sleep(2000);
        WebElement activeElement = driver.switchTo().activeElement();
        String attribute = activeElement.getAttribute("placeholder");
        if(attribute.contains("About yourself"))
        {
        	System.out.println("moved to next element");
        }
        else {
        	System.out.println("does not moved ");
        }
        driver.findElement(By.xpath("//textarea[@role='textbox']")).sendKeys("fgtuviehlrguvkerbguvjrbj");
        Thread.sleep(2000);
        
        ///to driscription  //h5[contains(text(),'Text Editor')]//following::div[4]/span[2]/button[1]
        
        for(int i=1;i<=3;i++) 
        {
        driver.findElement(By.xpath("//h5[contains(text(),'Text Editor')]//following::div[4]/span[2]/button[1]"));
        Thread.sleep(2000);

        
	    }
 }
 }

