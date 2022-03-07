package com.aishwarya;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {
public static void main(String[] args) {
////step-1 declare path
	String driverPath ="C:\\\\selenium download\\\\chromedriver_win32\\\\chromedriver.exe";
	//System.setProperty("webdriver.chrome.driver","D:\\Phase-5\\chromedriver_win32\\chromedriver.exe");
	// initiate driver////
	System.setProperty("webdriver.chrome.driver", driverPath);
	
	WebDriver driver = new ChromeDriver();
////step-2 baseurl
		String BaseUrl ="http://www.google.com/";
		//// step-3 launch google chrome///
		driver.get(BaseUrl);
		driver.close();
}
}
