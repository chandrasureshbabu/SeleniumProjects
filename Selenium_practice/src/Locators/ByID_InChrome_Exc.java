package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByID_InChrome_Exc {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Stuff\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://facebook.com");
		
		//By.id("ID")
		driver.findElement(By.id("email")).sendKeys("sureshnemani@gmail.com");
		//By.name("name")
		driver.findElement(By.name("pass")).sendKeys("password1");
		//Getting Current URL + Page Title
		System.out.println("Page URL :" +driver.getCurrentUrl()+ "--||||||--" +" Page Title :" + driver.getTitle());
		
		//By.linktext("link Text");
		driver.findElement(By.linkText("Forgotten account?")).click();
		//Getting Current URL + Page Title
		System.out.println("Page URL :" +driver.getCurrentUrl()+ "--||||||--" +" Page Title :" + driver.getTitle());
		driver.quit();
		

	}

}
