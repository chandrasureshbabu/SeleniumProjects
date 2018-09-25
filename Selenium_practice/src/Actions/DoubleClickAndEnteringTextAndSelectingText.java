package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleClickAndEnteringTextAndSelectingText {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Stuff\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Actions a= new Actions(driver);
		WebDriverWait wb= new WebDriverWait(driver, 10);
		wb.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#twotabsearchtextbox")));
		// enter block letters and double click
		a.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("jeans").doubleClick().build().perform();
		
		WebElement move= driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		// context click
		a.moveToElement(move).contextClick().build().perform();
		
		
		

	}

}
