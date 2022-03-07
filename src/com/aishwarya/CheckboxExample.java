package com.aishwarya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxExample {
public static void main(String[] args) {
////step-1 declare path
	String driverPath ="C:\\\\selenium download\\\\chromedriver_win32\\\\chromedriver.exe";
	//System.setProperty("webdriver.chrome.driver","D:\\Phase-5\\chromedriver_win32\\chromedriver.exe");
	// initiate driver////
	System.setProperty("webdriver.chrome.driver", driverPath);
	
	WebDriver driver = new ChromeDriver();

	 driver.get("https://www.shine.com/registration/");
	 WebElement check = driver.findElement(By.id("id_privacy"));
	 
	 if(check.isSelected()) {
		 System.out.println("checkbox is selected by default ");
		 }
	 
	 else{
		
		 System.out.println("checkbox is not selected.");
	}
	 WebElement name = driver.findElement(By.cssSelector("body > script:nth-child(9)"));
	 name.sendKeys("Aishwarya Nagare");
	  WebElement email = driver.findElement(By.xpath("/html/body/div[3]/div[1]"));
	  email.sendKeys("aishnagare12@gmail.com");
	  WebElement mobileNumber = driver.findElement(By.className("Legal"));
	  mobileNumber.sendKeys("9834567800");
	  WebElement password = driver.findElement(By.className("Legal"));
	  password.sendKeys("aish@1234");
	  
	 
}
}
