package ExcelDataDriven;

import java.io.IOException;
import java.util.ArrayList;

public class base {

	public static void main(String[] args) throws IOException  {
		
		ExcelData d=new ExcelData();
		
		ArrayList<String> value=d.getData("Savaari");
		
		System.out.println(value.get(0));
		System.out.println(value.get(1));
		System.out.println(value.get(2));
		System.out.println(value.get(3));
		System.out.println(value.get(4));
		System.out.println(value.get(5));
	}

}
