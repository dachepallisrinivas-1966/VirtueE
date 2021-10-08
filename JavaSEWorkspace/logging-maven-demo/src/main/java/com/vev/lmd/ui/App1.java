package com.vev.lmd.ui;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class App1 {

	public static void main(String[] args) {
		// 1. define logger
		Logger logger = Logger.getLogger(App1.class);
		
		// 2. create layout
		// SimpleLayout layout = new SimpleLayout();
		PatternLayout layout = new PatternLayout("%d %c %t %M %m %n");
		
		// 3. create an appender and link the layout
		ConsoleAppender appender = new ConsoleAppender(layout);
		
		// 4. link the appender to logger
		logger.addAppender(appender);
		
		logger.setLevel(Level.ALL);
		
		logger.debug("this is debug logging");
		logger.info("this is an info logging");
		logger.warn("this is an warn logging");
		logger.error("this is an error logging");
		logger.fatal("this is fatal logging");

	}

}
