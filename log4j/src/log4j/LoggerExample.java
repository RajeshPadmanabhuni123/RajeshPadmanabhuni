package log4j;

import org.apache.log4j.Logger;

public class LoggerExample {

	static Logger log=Logger.getLogger(LoggerExample.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		log.debug("Hello this is debug message");
		
		log.info("this is some info message");
	}

}
