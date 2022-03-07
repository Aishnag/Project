package com.aishwarya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
public static void main(String[] args) {
	String driverPath ="C:\\\\selenium download\\\\chromedriver_win32\\\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", driverPath);
	  String BaseURL="https://www.facebook.com/";
	  
	WebDriver driver = new ChromeDriver();
	driver.get(BaseURL);
	WebElement email=driver.findElement(By.id("email"));
	email.getAttribute("placeholder");
	System.out.println(email.getAttribute("placeholder"));
	
	email.sendKeys("aishnagare12@gmail.com");
	email.submit();
	
	WebElement login = driver.findElement(By.name("login"));
	login.click();
	
	
}
}
