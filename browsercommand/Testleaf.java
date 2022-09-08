package com.browsercommand;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testleaf {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leafground.com/");
		Thread.sleep(555);
		
		driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[8]/a/img")).click();
		Thread.sleep(5555);
		
		
		
		List <WebElement>col=driver.findElements(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/table//following::td"));
		System.out.println(col.size()); 
		
		
		List <WebElement> rows=driver.findElements(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/table/tbody/tr[1]//following::tr"));
		System.out.println(rows.size());
		
		for (int i = 1; i<=col.size(); i++) 
		 {
			for (int j = 1; j <=rows.size(); j++) 
			{
			  WebElement leafs = driver.findElement(By.xpath(""));
			  System.out.println(leafs);
			}

			driver.close();
			}

	}
	
}
		
		
		
		/*//*[@id="contentblock"]/section              //*[@id="contentblock"]/section/div[1]/table
		 * List<WebElement> totalrows = driver.findElements(By.xpath(
		 * "//*[@id=\"contentblock\"]/section/div[1]/table/tbody/tr[2]/td[1]/font"));
		 * System.out.println(totalrows.size());
		 * 
		 * List<WebElement> totalcolns = driver.findElements(By.xpath(
		 * "//*[@id=\"contentblock\"]/section/div[1]/table/tbody/tr[2]/td[2]/font"));
		 * System.out.println(totalcolns.size());
		 * 
		 * //*[@id="contentblock"]/section/div[1]/table/tbody/tr[1]/th[1]/font
		 */
		/*
		 * String leaf=driver.findElementByXPath("//table/tbody/tr[2]/td[1]/font" +
		 * "//table/tbody/tr[3]/td[1]/font" + " //table/tbody/tr[4]/td[1]/font" +
		 * " //table/tbody/tr[5]/td[1]/font" +
		 * "//table/tbody/tr[6]/td[1]/font").getText(); System.out.println(leaf);
		 */
		
     

//*[@id="contentblock"]/section/div[1]/table
//*[@id=\"contentblock\"]/section/div[1

//*[@id="contentblock"]/section/div[1]/table/tbody/tr[6]/td[1]/font

//*[@id="contentblock"]/section/div[1]/table/tbody/tr[6]/td[1]/font/text()