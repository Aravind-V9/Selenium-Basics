package seleniumBasics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class getDataProperties {
	
	public static void main(String[] args) throws IOException {

		// TODO Auto-generated method stub



		Properties prop=new Properties();

		FileInputStream fis =new FileInputStream(System.getProperty("user.dir")+"\\data.properties");

		prop.load(fis);

	
		
		String browser=prop.getProperty("browser");
		
		String url= prop.getProperty("url");

		System.out.println(browser);
		System.out.println(url);

		/*prop.setProperty("browser", "firefox");

		System.out.println(prop.getProperty("browser"));

		FileOutputStream fos =new FileOutputStream("C:\\Users\\902303\\eclipse-workspace\\seleniumBasics\\data.properties");

		prop.store(fos, null);*/

		}





}
