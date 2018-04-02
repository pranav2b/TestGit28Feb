package com.kpit.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample {
	
	@Test
	public void first(){
		
		System.setProperty("webdriver.chrome.driver", "D:\\PranavData\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mvnrepository.com/");
		
	}
	

}
