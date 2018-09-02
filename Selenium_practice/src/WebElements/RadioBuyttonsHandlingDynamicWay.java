package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBuyttonsHandlingDynamicWay {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Stuff\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		int i= driver.findElements(By.xpath("//*[@name='group1']")).size();// give you size of the group(i.e No of Buttons)
		System.out.println("No of radio Buttons in group1  :"+i);
		
		for(int x=0; x<i ;x++)
		{
			String RadioButton = driver.findElements(By.xpath("//*[@name='group1']")).get(x).getAttribute("value");
			
			if(RadioButton.equals("Cheese"))
			{
				driver.findElements(By.xpath("//*[@name='group1']")).get(x).click();
				
               // verifying cheese is clicked 
				boolean result =driver.findElements(By.xpath("//*[@name='group1']")).get(x).isSelected();
				String clickedOne =driver.findElements(By.xpath("//*[@name='group1']")).get(x).getAttribute("value");
				System.out.println("ClickedOne :"+ clickedOne +" "+ result );
			}
		}
		driver.quit();

	}

}
