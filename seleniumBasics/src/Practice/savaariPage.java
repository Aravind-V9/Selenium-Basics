package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class savaariPage {
	
	WebDriver driver;

	public savaariPage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver,this);
	}

	@FindBy(id="fromCityList") WebElement fromCityList;
	
	// By option= By.xpath("//button[@role='option']");
	 
	 @FindBy(xpath ="//div[@class='col-6 form-group']//descendant::input") WebElement date;
	
	 @FindBy(css="span.p-datepicker-month") WebElement month;
	 
	 @FindBy(css="span.p-datepicker-next-icon") WebElement nextIcon;
	
	public WebElement fromCityList()
	{
		return fromCityList;
	}

	//public List<WebElement> option()
//	{
//		 return driver.findElements(option);
//	}
	
	public WebElement date()
	{
		return date;
	}
	
	public WebElement month()
	{
		return month;
	}
	
	public WebElement nextIcon()
	{
		return nextIcon;
	}
	
	
}
