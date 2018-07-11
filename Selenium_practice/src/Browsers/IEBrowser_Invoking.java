package Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser_Invoking 
{
	
public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "D:\\Selenium Stuff\\IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		

		

		
		}

}
