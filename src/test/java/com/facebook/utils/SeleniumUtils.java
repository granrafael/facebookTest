package com.facebook.utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumUtils {
//Metodos que facilitan al driver

	public static void click(WebDriver driver, By elementClick) {
		driver.findElement(elementClick).click();
	}
	
	public static WebElement findElement(WebDriver driver, By elementFind) {
		WebElement element = driver.findElement(elementFind);
		if (element!=null) {
			return driver.findElement(elementFind);
			
		}else
		return null;
	}
	
	
	public static List<WebElement> findElements(WebDriver driver, By elementsFind) {
		return driver.findElements(elementsFind);
	}
	
	public static void sendKeys(WebDriver driver , By elementSendKeys) {
		driver.findElement(elementSendKeys).sendKeys();
	}
	
	public static void goUrl(WebDriver driver, String url) {
		driver.navigate().to(url);
	}
}
