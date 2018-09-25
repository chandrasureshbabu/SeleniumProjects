package Actions;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchToFrameAndDragandDrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Stuff\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
	//	driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		driver.switchTo().frame(0);
		
		Actions a= new Actions(driver);
		WebElement target= driver.findElement(By.id("droppable"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		a.dragAndDrop(driver.findElement(By.cssSelector("[id='draggable']")), target).build().perform();

	}

}
