package com.aishwarya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShineLogIn {
public static void main(String[] args) {
	String driverPath ="C:\\\\selenium download\\\\chromedriver_win32\\\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", driverPath);
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.shine.com/myshine/login/");
	
	WebElement email = driver.findElement(By.xpath("//*[@id=\"id_email_login\"]"));
		email.sendKeys("aish09@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"id_password\"]"));
		password.sendKeys("aish@123");

}
}
