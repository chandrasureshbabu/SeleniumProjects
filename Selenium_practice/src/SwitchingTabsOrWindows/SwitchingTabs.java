package SwitchingTabsOrWindows;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchingTabs {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Stuff\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm&ltmpl=default&flowName=GlifWebSignIn&flowEntry=SignUp");
		driver.findElement(By.xpath(".//*[@id='initialView']/footer/ul/li[3]/a")).click();
		System.out.println(driver.getTitle());// prints parent window or tab title
		Set<String> ids= driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentid= it.next();
		String Childid=it.next();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().window(Childid);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());

	}

}
