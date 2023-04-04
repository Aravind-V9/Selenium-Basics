package Examples;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommerceApp {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\902303\\eclipse-workspace\\Driver\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		
		String[] itemsNeeded= {"Cucumber - 1 Kg","Brocolli - 1 Kg","Beetroot - 1 Kg"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		
		int j=0;
		
		for(int i=0;i<products.size();i++)
		{
	    	String name=products.get(i).getText();
	    	
	    	List itemsNeededList = Arrays.asList(itemsNeeded);     //converting array to arraylist
	    	
			if(itemsNeededList.contains(name))
			{
				j++;
				 
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(itemsNeeded.length==j)
				{
					break;
				}
				
			}
		}
	}

}
