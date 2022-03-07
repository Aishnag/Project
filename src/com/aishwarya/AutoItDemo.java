package com.aishwarya;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoItDemo {
public static void main(String[] args) throws InterruptedException, IOException {
	String driverPath ="C:\\\\selenium download\\\\chromedriver_win32\\\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", driverPath);
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.shine.com/registration/");
    driver.findElement(By.id("id_name")).sendKeys("nikunj");
    
    WebElement element = driver.findElement(By.id("id_file"));
    
    
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();", element);
     
     Thread.sleep(5000);
     Runtime.getRuntime().exec("Documents\\FileUpload.exe");
    //driver.close();
}
}
