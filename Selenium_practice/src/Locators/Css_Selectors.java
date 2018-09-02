package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Selectors {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium Stuff\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Stuff\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.cssSelector("#username")).sendKeys("Username");// if id is there we can write #idvalue
		driver.findElement(By.cssSelector("[id='password']")).sendKeys("Password");// here we didnt use tagname in css we leave tagname
		driver.findElement(By.cssSelector(".button.r4.wide.primary")).click();//if class value is there we can write css as .class vlaue ,ex- ".button.r4.wide.primary"
		//driver.findElement(By.cssSelector("#Login")).click();
		driver.quit();

	}

}
