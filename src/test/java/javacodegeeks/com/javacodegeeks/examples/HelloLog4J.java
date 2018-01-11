package com.javacodegeeks.examples;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloLog4J {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(HelloLog4J.class);
		logger.info("This is how you configure Log4J with SLF4J");
	}
}
