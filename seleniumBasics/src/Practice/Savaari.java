package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Savaari {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\902303\\eclipse-workspace\\Driver\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
		
		Test a=new Test();
		Utilities b=new Utilities();
		savaariPage p=new savaariPage(driver);
		ArrayList<String> s=b.getData("Savaari");
		
		driver.get("https://www.savaari.com/");
		
		p.fromCityList().sendKeys(s.get(1));
		
		 a.selectCity(driver,s.get(2));
		 
		 driver.findElement(By.xpath("//input[@placeholder='Start typing city - e.g. Mysore']")).sendKeys(s.get(3));
		
		 a.selectCity(driver,s.get(4));
		
		 a.selectPickDate(driver,s.get(5),s.get(6));
		 
		 a.selectPickTime(driver,s.get(7));
		 
		 driver.findElement(By.cssSelector("button.book-button.btn")).click();
		 
		 b.TakeScreenshot(driver,"Screenshots\\Savaarii.png");
		
	
	}

       
}
