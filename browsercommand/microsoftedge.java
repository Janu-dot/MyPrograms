package com.browsercommand;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class microsoftedge {

	public static void main(String[] args) {
			
		     WebDriverManager.edgedriver().setup();
				
				WebDriver driver= new EdgeDriver();
				
				//driver.get("http://newtours.demoaut.com/index.php")  ;
				
				driver.get("https://www.amazon.in/");
				
				String url = driver.getCurrentUrl();
				
			    System.out.println("URL : "+url);
			    
			    System.out.println("URL:"+driver.getCurrentUrl());
			   
			    
				String title = driver.getTitle();
				
				System.out.println("URL:"+ driver.getTitle());
				
				System.out.println(title);
				
				driver.close();
				
				//driver.quit();

			}

	}


