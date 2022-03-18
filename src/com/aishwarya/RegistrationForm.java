package com.aishwarya;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationForm {
public static void main(String[] args) {
	String driverPath ="C:\\phase5\\chromedriver_win32\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", driverPath);
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.shine.com/myshine/login/");
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	 WebElement Check= driver.findElement(By.id("id_privacy"));
     
     WebElement Email= driver.findElement(By.id("id_email"));
     Email.sendKeys("nikunj@gmail.com");
     
     WebElement Name= driver.findElement(By.id("id_name"));
     Name.sendKeys("Nikunj Soni");
     
     WebElement Pass= driver.findElement(By.id("id_password"));
     Pass.sendKeys("Nikunj@123");
     
     WebElement Mobile= driver.findElement(By.id("id_cell_phone"));
     Mobile.sendKeys("9876543210");
     
     WebElement Continue= driver.findElement(By.id("registerButton"));
     Continue.click();

}
}
