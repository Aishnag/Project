package com.aishwarya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukariRegistrationForm {
	 public static void main(String[] args) {
		 String driverPath ="C:\\\\selenium download\\\\chromedriver_win32\\\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverPath);
			  String BaseURL="https://www.naukri.com/";
			  WebDriver driver = new ChromeDriver();
			  
			  WebElement fullName = driver.findElement(By.id("name"));
			   fullName.sendKeys("Aishwarya Nagare");
			   WebElement emailId = driver.findElement(By.id("email"));
			   emailId.sendKeys("aishwaryanagare36@gmail.com");
			   WebElement password = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div[2]/div[2]"));
			   password.sendKeys("hello@234");
			   WebElement mobileNumber = driver.findElement(By.id("mobile"));
			   mobileNumber.sendKeys("7869542311");
			   WebElement FullName = driver.findElement(By.id("name"));
			   WebElement check = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div[2]/div[6]/a"));
				  if(check.isSelected()) {
					 System.out.println("checkbox is selected by default ");
					 }
				WebElement workStatus = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[2]/div/div/div[1]/form/div[2]/div[4]/div[2]/div[1]/i"))  ;
			   
	}
	}


