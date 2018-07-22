package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByXpath_Chrome {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Stuff\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.id("username")).sendKeys("sureshnmeani");
		driver.findElement(By.name("pw")).sendKeys("Password");
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

	}

}
