package com.facebook.test;

import org.openqa.selenium.By;

import com.facebook.pages.HomePage;
import com.facebook.utils.BeforeAfter;

public class HomeTest extends BeforeAfter{
	//TODO CREAR LAS VARIABLES DE TODOS LOS ELEMENTOS CAPTURADOS EN EL "PAGE"
	private By LabelEmail = HomePage.getLabelEmailUser();
	private By LabelPassword = HomePage.getLabelPassword();
	private By ButtonEnviar = HomePage.getEnviarButton();
	

}
