package WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingRadioButtons_Group_Dynamically {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		
		int count= driver.findElements(By.xpath("//*[@name='group1']")).size();// Size() method gives you the size of the radio button  group
		System.out.println("NO of Radio Buttons :" +count);
		
		for(int i=0; i<count;i++)
		{
			
			String Attvalue= driver.findElements(By.xpath("//*[@name='group1']")).get(i).getAttribute("value");
			
			if(Attvalue.equals("Cheese"))
			{
				String OC1=driver.findElements(By.xpath(".//*[@name='group1']")).get(i).getAttribute("value");
				System.out.println("Its a " + OC1);
				driver.findElements(By.xpath(".//*[@name='group1']")).get(i).click();
				boolean result1= driver.findElements(By.xpath("//*[@name='group1']")).get(i).isSelected();
				System.out.println(OC1 +" clicked "+ result1);
				System.out.println("-----------------");
				
			}else
			System.out.println("-----------------");
			String OC2=driver.findElements(By.xpath(".//*[@name='group1']")).get(i).getAttribute("value");
			System.out.println("Its a --" + OC2);
			driver.findElements(By.xpath("//*[@name='group1']")).get(i).click();
			boolean result2= driver.findElements(By.xpath("//*[@name='group1']")).get(i).isSelected();
			
			System.out.println(OC2 +" --clicked-- "+ result2);
			System.out.println("-----------------");
		}
		
		driver.quit();
		

	}

}
