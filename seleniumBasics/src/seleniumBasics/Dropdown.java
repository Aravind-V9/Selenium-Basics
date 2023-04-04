package seleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\902303\\eclipse-workspace\\Driver\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		//Static dropdown
		
		WebElement CurrencyDropdwn=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select Currency=new Select(CurrencyDropdwn);
		Currency.selectByValue("AED");
		Thread.sleep(3000);
		
		
		//Dynamic dropdown
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000);
        //Parent child xpath -unique locator
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
        
        
        
        //  Auto-suggestive dropdown
        
        
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
      //a[@id='ui-id-199'] 
        Thread.sleep(3000);

        List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

        for(WebElement option :options)                                 //enhanced FOR loop

        {

        if(option.getText().equalsIgnoreCase("India"))

        {

        option.click();

        break;

        }

        }

        }
		

}
