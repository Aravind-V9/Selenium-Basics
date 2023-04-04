package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffApplication {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\902303\\eclipse-workspace\\Driver\\Chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.rediff.com/");
		
		HomePage h=new HomePage(driver);
		
		SigninPage s=new SigninPage(driver);
		
		System.out.println(h.mailtext().getText());
		
		h.signinbtn().click();
		
		s.username().sendKeys("Aravind");
		
		s.password().sendKeys("arvi");
	}

}
