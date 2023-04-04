package ExcelDataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

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
