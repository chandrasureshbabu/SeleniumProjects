package GettingLinksofthepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksofthepageAndFooterPageLInks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Stuff\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		//finding no fo links of the page 
		int count= driver.findElements(By.tagName("a")).size();
		System.out.println("No of links :"+ count);
		// finding no of links of the footer section of the page
		WebElement footerofpage= driver.findElement(By.cssSelector(".gf-t"));
        int countoflinksinfooter= footerofpage.findElements(By.tagName("a")).size();
        System.out.println("No of links in footer :"+countoflinksinfooter);
	}

}
