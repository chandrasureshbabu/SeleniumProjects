package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAlerts {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Stuff\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		
		driver.findElement(By.xpath("//div[@class='display']/form/input")).click();
		String textONAlert=driver.switchTo().alert().getText();// to get text on alerts
		System.out.println(textONAlert);
		driver.switchTo().alert().accept(); // to click on 'ok'on alert pop ups.
	//	driver.switchTo().alert().dismiss();// to click on 'cancel /no' on alerts
	//	driver.switchTo().alert().sendKeys("abc");// to type on alerts pop ups
		driver.quit();
		
		
	}

}
