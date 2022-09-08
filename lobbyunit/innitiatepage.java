package com.lobbyunit;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class innitiatepage {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		Date currentdate = new Date();
		 SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");	
		 String date = formatDate.format(currentdate);
		
	
		//Date vv = new Date();
		 //System.out.println(vv);
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://192.168.1.208/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("username")).sendKeys("admin");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("password")).sendKeys("123456");
		
		Thread.sleep(2000);
			
		driver.findElement(By.id("b_login")).click();
		
		Thread.sleep(2000);
		
		File source1 = driver.getScreenshotAs(OutputType.FILE);
		File target1 = new File("./ScreenShots/"+date+"/"+10514062+"/livestream.png");
		FileUtils.copyFile(source1, target1);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Playback']")).click();
		driver.findElement(By.xpath("//label[text()='Stream Type']//following::select[1]")).click();
		Thread.sleep(3000);
		
		
		Select obj = new Select(driver.findElement(By.id("streamtypeselect")));
		obj.selectByVisibleText("Sub Stream");
		Thread.sleep(2000);                  
		
		driver.findElement(By.id("go_page_fileList")).click();
		
		driver.findElement(By.id("playback_dates_title")).click();
		
		//driver.navigate().refresh();
		
		File source11 = driver.getScreenshotAs(OutputType.FILE);
		File target11 = new File("./ScreenShots/"+date+"/"+10514062+"/download.png");
		FileUtils.copyFile(source11, target11);
		Thread.sleep(2000);
		
	    //javascriptExecutor jse = (JavascriptExecutor)driver;
		//jse.executeScript("history.go(0)");
		
		driver.close();
		
	}

}
