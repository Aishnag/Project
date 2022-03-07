package com.aishwarya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginUsingXPath {
public static void main(String[] args) {
	String driverPath ="C:\\\\selenium download\\\\chromedriver_win32\\\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", driverPath);
	
	WebDriver driver = new ChromeDriver();
	// Assign base URL
		String BaseURL = "https://facebook.com/";
		
		// launch google chrome
		driver.get(BaseURL);
		
		WebElement xPath= driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/script[2]"));
		xPath.getAttribute("placeholder");
		System.out.println(xPath.getAttribute("placeholder"));
		
		xPath.sendKeys("aishnagare12@gmail.com");
		xPath.submit();
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();
}
}
