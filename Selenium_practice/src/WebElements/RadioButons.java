package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButons {

	public static void main(String[] args) 
	
	{
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		System.out.println((driver.findElement(By.xpath("//*[@value='Milk']")).isSelected()));
		driver.findElement(By.xpath("//*[@value='Milk']")).click();
		System.out.println((driver.findElement(By.xpath("//*[@value='Milk']")).isSelected()));
		System.out.println(driver.findElements(By.xpath("//*[@name='group1']")).size());
		driver.quit();
		
		

	}

}
