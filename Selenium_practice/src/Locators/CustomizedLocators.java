package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizedLocators {

	public static void main(String[] args){
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Stuff\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://rediff.com");
		
		
		
	   //driver.findElement(By.xpath("//a[@title='Already a user? Sign in']")).click(); /*wrking  -----regular /customized xpath */
	   driver.findElement(By.cssSelector("a[title*='Sign in']")).click(); /* wrkng ---customized regular exp css :tagname[attribue*='value'] */
	   //driver.findElement(By.cssSelector("[title*='Sign in']")).click(); /* wrkng ---customized regular exp css :tagname(canbe empty )[attribue*='value'] */
		
		//driver.findElement(By.xpath("//a[contains(@title,'Sign in')]")).click(); /* wrkng -customized regular exp xpath : //tagname[contains(@attribute,'value')]*/
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("sureshnemani");
		driver.findElement(By.cssSelector("#password")).sendKeys("password");
	
		driver.findElement(By.xpath("//*[contains(@name,'procee')]")).click();  /* wrkng -customized regular exp xpath : //tagname[contains(@attribute,'value')]*/
		
		// driver.findElement(By.cssSelector("[name*='procee']")).click(); /* wrkng ---customized regular exp css :tagname[attribue*='value'] */
		
		driver.quit();

	}

}
