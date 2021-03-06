package Synchrinization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitAndExaplicitWaits {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Stuff\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://alaskatrips.poweredbygps.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("tab-hotel-tab-hp")).click();
		driver.findElement(By.id("hotel-destination-hp-hotel")).sendKeys("nyc");
		driver.findElement(By.id("hotel-destination-hp-hotel")).sendKeys(Keys.TAB);
		driver.findElement(By.id("hotel-checkin-hp-hotel")).sendKeys(Keys.ENTER);
		
		WebDriverWait d= new WebDriverWait(driver, 30);
		d.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[contains(@class,'hotel listing col dealOfDay')]/div[2]/div/a")));
		driver.findElement(By.xpath(".//*[contains(@class,'hotel listing col dealOfDay')]/div[2]/div/a")).click();
		driver.quit();
	}

}
