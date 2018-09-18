package com.facebook.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.facebook.pages.HomePage;
import com.facebook.utils.BeforeAfter;
import com.facebook.utils.SeleniumUtils;

public class HomeTest extends BeforeAfter{
	//TODO CREAR LAS VARIABLES DE TODOS LOS ELEMENTOS CAPTURADOS EN EL "PAGE"
	private By LabelEmail = HomePage.getLabelEmailUser();
	private By LabelPassword = HomePage.getLabelPassword();
	private By ButtonEnviar = HomePage.getEnviarButton();
	
	
	@Test
	public void test01() {
		WebDriver elemento;
		elemento = SeleniumUtils.click(driver, LabelEmail);
		
	}
	
	
	
}
