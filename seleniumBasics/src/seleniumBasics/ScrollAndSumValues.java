package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ScrollAndSumValues {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\902303\\eclipse-workspace\\Driver\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,500)");
		
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		List<WebElement> values=driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
		
		int n=values.size();
		int Sum=0;
		for(int i=0;i<n;i++)
		{
		
			Sum=Sum+Integer. parseInt(values.get(i).getText());
		}
		
		int total=Integer.parseInt(driver.findElement(By.cssSelector("div.totalAmount")).getText().split(":")[1].trim());
      
		Assert.assertEquals(Sum, total);
	}


}
