package log4j;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4j {
	
	private static Logger log=LogManager.getLogger(log4j.class.getName());
	
	public static void main(String[] args)
	{
		
		log.info("Order is created");
		
		log.error("order is not created");
		
		
		
		
	}

}
