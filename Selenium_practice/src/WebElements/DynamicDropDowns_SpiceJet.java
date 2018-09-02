package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDowns_SpiceJet {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Stuff\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.spicejet.com/");
		driver.findElement(By.xpath(".//div[@class='row1']/div/input[1]")).click();
		driver.findElement(By.xpath("//option[@value='HYD']")).click();
		driver.findElement(By.xpath("(//*[@value='GOI'])[2]")).click();

	}

}
