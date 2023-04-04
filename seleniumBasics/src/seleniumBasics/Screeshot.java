package seleniumBasics;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screeshot {
	
	public static void main(String[] args) throws IOException {
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();		
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File(System.getProperty("user.dir")+"\\Screenshots1\\image.png"));
		
		
	}


}
