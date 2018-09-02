package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElements_Validations1 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com/");
		
		System.out.println((driver.findElement(By.xpath(".//*[@id='hp-widget__return']")).isDisplayed()));
		driver.findElement(By.xpath(".//*[@id='multicity']/label")).click();
		System.out.println((driver.findElement(By.xpath(".//*[@id='hp-widget__return']")).isDisplayed()));
		driver.quit();
		

	}

}
