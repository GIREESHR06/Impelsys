package com.hrms.lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class General extends Global{
	static WebDriver driver;
public void openbrowser() {
	
	System.setProperty("webdriver.chrome.driver","C:\\Chromedriver\\driver\\chromedriver.exe");
	this.driver= new ChromeDriver();
	driver.get(url);
	driver.manage().window().maximize();
	//Thread.sleep(10000);
		
	
}
public void closebrowser() {
	driver.quit();
}
}
