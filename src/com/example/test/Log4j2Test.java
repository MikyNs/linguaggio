package com.example.test;

import static org.junit.Assert.assertNotNull;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

public class Log4j2Test {
	
	private static final Logger log = LogManager.getLogger(Log4j2Test.class); // LogManager factory per Logger
	
	@Test
	void loggerTest() {
		assertNotNull(log);
		log.trace("Messaggio di trace");
		log.debug("Messaggio di debug");
		log.info("Messaggio di info");
		log.warn("Messaggio di warn");
		log.error("Messaggio di error");
		log.fatal("Messaggio di fatal");
	}

}
