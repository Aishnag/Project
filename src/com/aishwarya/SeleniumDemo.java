package com.aishwarya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
public static void main(String[] args) {
	String driverPath ="C:\\\\selenium download\\\\chromedriver_win32\\\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", driverPath);
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	// Assign base URL
	String BaseURL = "https://facebook.com/";
	
	// launch google chrome
	driver.get(BaseURL);
	
	WebElement email1 = driver.findElement(By.id("email"));
	WebElement email2 = driver.findElement(By.name("email"));
	
	System.out.println(email1.equals(email2));
	
	WebElement email3 = driver.findElement(By.className("_6lux"));
	System.out.println(email1.equals(email3));
	
	// link text
	
	//WebElement link = driver.findElement(By.linkText("Forgotten password?"));
	//link.click();
	
	//By Using Relative Path
	
	WebElement xpathEmail = driver.findElement(By.xpath("//*[@id=\"facebook\"]/head"));
	System.out.println(email1.equals(xpathEmail));
	
	//
	}
}
