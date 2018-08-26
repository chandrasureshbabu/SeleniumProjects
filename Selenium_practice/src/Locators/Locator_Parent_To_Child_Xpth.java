package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Parent_To_Child_Xpth {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Stuff\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://google.com");
		driver.findElement(By.xpath("//div[@class='lst-c']/div/div[2]/div/input")).sendKeys("seleniumHq");
		//driver.findElement(By.xpath("//div[@class='tsf-p']/div[3]/center/input[1]")).click();
		driver.quit();
		

	}

}
