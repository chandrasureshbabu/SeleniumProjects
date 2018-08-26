package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Using_Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Stuff\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com");
		driver.findElement(By.xpath(".//*[@id='homepage']/header/div[2]/div/nav/ul/li[4]/a")).click();
		driver.findElement(By.xpath(".//*[text()=' Selenium ']")).click();
		driver.quit();

	}

}
