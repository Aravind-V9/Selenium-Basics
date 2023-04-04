package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\902303\\eclipse-workspace\\Driver\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.get("https://jqueryui.com/droppable/");
		
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		
		driver.findElement(By.id("draggable")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.cssSelector("input.ds-input")).click();
		
	}


}
