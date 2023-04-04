package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	WebDriver driver;
     
     public HomePage(WebDriver driver)
     {
    	 this.driver=driver;
	 }
     
     
     @FindBy(css="a[class='mailicon']")
     WebElement mailtext;
     By mailText= By.xpath("//a[@class='mailicon']");
     By signinbtn= By.xpath("//a[@class='signin']");
     
     
	public WebElement mailtext()
     {
    	 return driver.findElement(mailText);
     }
	
	public WebElement signinbtn()
    {
   	 return driver.findElement(signinbtn);
    }
	
	
}
