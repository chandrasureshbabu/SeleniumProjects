package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Traditional_Dropdown_Spicejet {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Stuff\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com/");
		Select s= new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));// by id we are able find this element  id / classname but not by css/xpath dnt know why
		s.selectByIndex(2);
		driver.quit();

	}

}
