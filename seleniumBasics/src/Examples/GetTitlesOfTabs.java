package Examples;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitlesOfTabs {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\902303\\eclipse-workspace\\Driver\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));
		
		WebElement CustomFdriver=driver.findElement(By.xpath("//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul"));
		
		System.out.println(CustomFdriver.findElements(By.tagName("a")).size());
		
		
		//opening each link in a new tab
		for(int i=1;i<CustomFdriver.findElements(By.tagName("a")).size();i++)
		{
			String rightClk=Keys.chord(Keys.CONTROL,Keys.ENTER);
			CustomFdriver.findElements(By.tagName("a")).get(i).sendKeys(rightClk);
			Thread.sleep(5000);
		}
		
		
		//Switching to every window and getting title
		
	    Set<String> windows	=driver.getWindowHandles();
	    
		Iterator<String> it=windows.iterator();
		
		while(it.hasNext())
		{
			
			System.out.println(driver.switchTo().window(it.next()).getTitle());
			
		}
		
		driver.close();
	}


}
