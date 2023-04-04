package Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utilities {
	
	 public void TakeScreenshot(WebDriver driver,String Path) throws IOException
	    {
	    	
	    	List<WebElement>carNames  =driver.findElements(By.xpath("//div[@class='car-name']"));
	        System.out.println(carNames.get(1).getText());
	    	 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 FileUtils.copyFile(src,new File(Path));
			 
	    }
	 
	 
	 public ArrayList<String> getData(String TestcaseName) throws IOException {
			ArrayList<String> a = new ArrayList<String>();

			FileInputStream inputStream = new FileInputStream("C:\\Users\\902303\\eclipse-workspace\\seleniumBasics\\ExcelData.xlsx");

			XSSFWorkbook wb = new XSSFWorkbook(inputStream);                                           //Excel

			XSSFSheet sheet = wb.getSheet("STUDENT_DATA");                                            // Sheet

			//To get the values of the particular testcase
			
			Iterator<Row> rows = sheet.iterator();

			while (rows.hasNext()) 
			 {
				Row r = rows.next();
				if (r.getCell(0).getStringCellValue().equals(TestcaseName)) 
				{
					Iterator<Cell> acell = r.cellIterator();
					
					while (acell.hasNext()) 
					{
						Cell c = acell.next();
						if (c.getCellType() == CellType.STRING)
						{
							a.add(c.getStringCellValue());
						} 
						else 
						{
							a.add(NumberToTextConverter.toText(c.getNumericCellValue()));

						}
					}
				}
			}

			return a;
		}
	
	

}
