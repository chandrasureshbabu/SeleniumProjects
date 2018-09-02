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
		//System.out.println(driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTNR']/div/table/tbody/tr[2]/td[2]/div[3]/div/div/ul[2]/li[5]/a")).isDisplayed());
		System.out.println(driver.findElement(By.xpath(".//*[@id='dropdownGroup1']/div/ul[2]/li[5]/a")).isDisplayed());
		driver.findElement(By.xpath(".//*[@id='dropdownGroup1']/div/ul[2]/li[5]/a")).click();
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		//driver.findElement(By.xpath("(//*[@value='GOI'])[2]")).click(); with this xpath elements cannot visisble you must get with parent as below 
		System.out.println((driver.findElement(By.xpath("(.//*[@id='dropdownGroup1']/div/ul[2]/li[1]/a)[2]")).isDisplayed()));
		driver.findElement(By.xpath("(.//*[@id='dropdownGroup1']/div/ul[2]/li[2]/a)[2]")).click();
		driver.quit();

	}

}
