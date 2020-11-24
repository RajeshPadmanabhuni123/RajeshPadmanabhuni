package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggerHtmlEx {

	static Logger log=Logger.getLogger(LoggerHtmlEx.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PropertyConfigurator.configure("log4j.properties");
		log.debug("haii this is debug");
		log.info("haii this is info");
		
	}

}
