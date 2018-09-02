package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_NewGen_Spice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Stuff\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com/");
		driver.findElement(By.cssSelector("#divpaxinfo")).click();
		//driver.findElement(By.cssSelector("#adultDropdown")).click();
		driver.findElement(By.cssSelector("#hrefIncAdt")).click();
		driver.quit();
		

	}

}
