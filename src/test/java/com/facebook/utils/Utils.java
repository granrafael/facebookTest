package com.facebook.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class Utils {
	
	public static Properties getProperties() {
		Properties properties = new Properties();
	
		try {
			properties.load(new FileInputStream("src/test/resources/config.properties"));

		} catch (Exception e) {
			e.printStackTrace();
		}
		return properties;
	}

}
