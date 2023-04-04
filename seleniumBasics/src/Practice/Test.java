package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test  {
	
	WebDriver driver;
	
	savaariPage p=new savaariPage(driver);
	
	 public  void selectCity(WebDriver driver,String CityName)

     {
		   
		   WebDriverWait wait=new WebDriverWait(driver,2);
		   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@role='option']")));
		   
		   List<WebElement> Options =driver.findElements(By.xpath("//button[@role='option']"));
		   
         for(WebElement Option :Options)    //enhanced FOR loop
	        {
	        if(Option.getText().equalsIgnoreCase(CityName))

	            {
	        	   Option.click();
	               break;
	            }
          }
         
     }
     
  public void selectPickDate(WebDriver driver,String Month,String Date) throws InterruptedException
     {
  	   
  	   driver.findElement(By.xpath(("//div[@class='col-6 form-group']//descendant::input"))).click();
  	   
  	   System.out.println(driver.findElement(By.cssSelector("span.p-datepicker-month")).getText());
  	   
  	   while(!driver.findElement(By.cssSelector("span.p-datepicker-month")).getText().contains(Month))
     	  {
     		  System.out.println(driver.findElement(By.cssSelector("span.p-datepicker-month")).getText());
     			driver.findElement(By.cssSelector("span.p-datepicker-next-icon")).click();
     	  } 
      
  	   List<WebElement> dates= driver.findElements(By.xpath("//span[contains(@class,'p-ripple')]"));
  	   
  	   for(int i=0;i<dates.size();i++)
  	   {
  		   if(dates.get(i).getText().equals(Date))
  		   {
  			   dates.get(i).click();
  			   break;
  		   }
  	   }
 		  }
     
  public void selectPickTime(WebDriver driver,String time)
    
    {
  	   driver.findElement(By.id("pickUpTime"));
  	   WebElement pickupat=  driver.findElement(By.id("pickUpTime"));
    	   Select Time=new Select(pickupat);
   	   Time.selectByVisibleText(time);
     }
  

}
