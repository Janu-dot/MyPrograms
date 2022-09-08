package com.browsercommand;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chromeclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date currentdate = new Date();
		 SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");	
		 String date = formatDate.format(currentdate);
		 System.out.println(date);
		 
 
	}

}

