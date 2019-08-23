package com.viv;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Main {

	private static Logger logger = Logger.getLogger(Main.class);
	static final String LOG_PROPERTIES_FILE = "log4j.properties";
	
	public static void main(String[] args) {

		BasicConfigurator.configure();
		initializeLogger();
		
        logger.warn("Sample debug message");
        
        //logger.info("Sample info message");
        //logger.warn("Sample warn message");
	
	}
	
	
	
	private static void initializeLogger() {
        Properties logProperties = new Properties();
 
        try {

            logProperties.load(new FileInputStream(LOG_PROPERTIES_FILE));
            PropertyConfigurator.configure(logProperties);
            logger.info("Logging initialized.");
        } catch (IOException e) {
            logger.error("Unable to load logging property :", e);
        }
       
    }
	
	
	
	public static void setName() {
		System.out.println("ok");
	}

}
