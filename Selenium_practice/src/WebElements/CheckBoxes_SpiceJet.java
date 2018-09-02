package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes_SpiceJet {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Stuff\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.spicejet.com/");
		System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_friendsandfamily']")).isSelected());
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_friendsandfamily']")).click();
		driver.quit();
				
	
	}

}
