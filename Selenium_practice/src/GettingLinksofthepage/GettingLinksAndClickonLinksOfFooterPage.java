package GettingLinksofthepage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GettingLinksAndClickonLinksOfFooterPage {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Stuff\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		
		WebDriverWait ww= new WebDriverWait(driver, 10);
		ww.until(ExpectedConditions.visibilityOfElementLocated(By.className("gf-t")) );
		WebElement FooterDriver= driver.findElement(By.className("gf-t"));
		
		int Footercount= driver.findElements(By.tagName("a")).size();
		
		System.out.println("Links in Footer" +Footercount);
		
		WebElement colDriver= driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[1]"));
		
		int fstColumnlinks= colDriver.findElements(By.tagName("a")).size();
		
		System.out.println( "St column links :"+fstColumnlinks);
		
		for (int i=1;i<fstColumnlinks;i++)
		{
			String ClickonLink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			colDriver.findElements(By.tagName("a")).get(i).sendKeys(ClickonLink);
		}
		
		Set<String> ids=driver.getWindowHandles();
		Iterator<String>it=ids.iterator();
		 while (it.hasNext())
		 {
			 driver.switchTo().window(it.next());
			 System.out.println(driver.getTitle());
		 }
		

	}

}
