package seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actions {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\902303\\eclipse-workspace\\Driver\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		
		driver.get("https://www.amazon.in/");
		
		Actions a=new Actions();
		//Actions rightClickAction = new Actions(driver);
		
		
	}

}
