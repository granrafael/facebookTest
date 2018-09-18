package com.facebook.pages;

import org.openqa.selenium.By;

public class HomePage {
	
	public static By getLabelEmailUser() {
		return By.cssSelector("#email");	
	}
	
	public static By getLabelPassword() {
		return By.cssSelector("#pass");
	}
	
	public static By getEnviarButton() {
		return By.cssSelector("#u_0_2");
	}
	
}
