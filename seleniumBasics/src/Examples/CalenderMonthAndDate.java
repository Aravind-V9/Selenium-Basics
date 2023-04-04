package Examples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderMonthAndDate {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\902303\\eclipse-workspace\\Driver\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.findElement(By.id("travel_date")).click();
		
		while(!driver.findElement(By.xpath(("//div[@class='datepicker-days']//child::th[@class='datepicker-switch']"))).getText().contains("March"))
		{
			driver.findElement(By.xpath("//div[@class='datepicker-days']//child::th[@class='next']")).click();
		}
		
		//Grab common attribute//Put into list and iterate
		
		List<WebElement> dates= driver.findElements(By.className("day"));
		
		int count = driver.findElements(By.className("day")).size();
		
		for(int i=0;i<count;i++)
		{
			String date=dates.get(i).getText();
			if(date.equals("26"))
				{
				     dates.get(i).click();
				     break;
				}
		}
		
	}

}
