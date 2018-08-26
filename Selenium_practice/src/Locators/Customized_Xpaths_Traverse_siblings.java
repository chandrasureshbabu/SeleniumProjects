package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customized_Xpaths_Traverse_siblings {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Stuff\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com");
		driver.findElement(By.xpath(".//*[@id='homepage']/header/div[2]/div/nav/ul/li[4]/a")).click();
		//driver.findElement(By.xpath(".//*[@id='content']/div/div/div/div/ul/li[1]/following-sibling::li[1]")).click();// travserse though siblings.
		driver.findElement(By.xpath(".//*[@id='tablist1-tab1']/following-sibling::li[1]")).click();// travserse though siblings.
		driver.quit();
		

	}

}
