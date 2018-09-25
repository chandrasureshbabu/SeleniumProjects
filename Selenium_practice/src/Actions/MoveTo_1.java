package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MoveTo_1 {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Stuff\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		WebDriverWait wb= new WebDriverWait(driver, 10);
		Actions a= new Actions(driver); // pass driver as argument to the actions class to give capabilities of the actions class to driver object of the Webdriver\
		wb.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[id='nav-link-accountList']")));
		a.moveToElement(driver.findElement(By.cssSelector("a[id='nav-link-accountList']"))).build().perform(); 
		

	}

}
