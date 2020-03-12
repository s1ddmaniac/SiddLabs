package lab12.exercise1;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class UsingLoggers {

	private static Logger logger = Logger.getRootLogger();
	
	public static void main(String[] args) {
		
		//BasicConfigurator.configure();
		PropertyConfigurator.configure("C:\\Users\\humpt\\Sidd\\Module1\\usingLoggers.properties");
		
		logger.debug("debug message");
		logger.info("info message");
		logger.warn("warn message");
		logger.error("error message");
		logger.fatal("fatal message");
		
	}
}