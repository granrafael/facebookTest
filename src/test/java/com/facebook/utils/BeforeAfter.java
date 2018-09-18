package com.facebook.utils;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BeforeAfter {

	public WebDriver driver;

	@BeforeSuite
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/config.properties");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Properties prop = Utils.getProperties();
		driver.get(prop.getProperty("url"));
		driver.get(prop.getProperty("name"));
		driver.get(prop.getProperty("password"));
		
		
	}
		

		@AfterSuite
		public void tearDown() {
			driver.close();
			driver.quit();
		}
		
		
	}

