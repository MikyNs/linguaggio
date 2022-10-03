package com.example.container.test;

import static org.junit.jupiter.api.Assertions.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import com.example.container.ContenitoreGenerics;

class ContenitoreGenericsTest {
	private static final Logger log = LogManager.getLogger(ContenitoreGenericsTest.class);

	@Test
	void testStringa() {
		String str = "HelloWorld";

		ContenitoreGenerics<String> c = new ContenitoreGenerics<String>(str);

		log.info("Contenuto: {}", c.getObject());

		String xstr = c.getObject();
		
		// Integer i = (Integer) c.getObject(); Illegale
		
		assertEquals(str, xstr);
		assert(str == c.getObject());
	}

}
