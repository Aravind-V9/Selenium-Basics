package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SigninPage {
	
	
	WebDriver driver;
    
    public SigninPage(WebDriver driver)
    {
   	 this.driver=driver;
   	 
   	 PageFactory.initElements(driver,this);
	}
    
    @FindBy(id="login1")
    WebElement username;
    
    @FindBy(id="password")
    WebElement password;
    
    public WebElement username()
    {
    	return username;
    }
    
    public WebElement password()
    {
    	return password;
    }
	

}
