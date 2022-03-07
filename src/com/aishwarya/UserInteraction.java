package com.aishwarya;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UserInteraction {
public static void main(String[] args) {
	String driverPath ="C:\\\\selenium download\\\\chromedriver_win32\\\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", driverPath);
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://facebook.com/");
	WebElement userName = driver.findElement(By.id("email"));
	
	Actions builder = new Actions(driver);
	org.openqa.selenium.interactions.Action seriesOfAction = builder
			.moveToElement(userName)
			.click()
			.keyDown(userName, Keys.SHIFT)
			.sendKeys(userName,"Hello")
			.keyUp(userName, Keys.SHIFT)
			.doubleClick(userName)
			.contextClick()
			.build();
	seriesOfAction.perform();
}
}
