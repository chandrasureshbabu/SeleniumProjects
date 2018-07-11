package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FireFoxBrowser_Invoking {
	
	public static void main(String args[])
	{
		
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://google.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}

}
