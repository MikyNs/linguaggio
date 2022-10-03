package com.example.container.test;

import static org.junit.jupiter.api.Assertions.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import com.example.container.Coppia;

class ContenitoreCoppiaTest {
	private static final Logger log = LogManager.getLogger(ContenitoreCoppiaTest.class);

	@Test
	void testStringa() {
		String str = "HelloWorld";
		Integer num = 3;

		Coppia<String,Integer> c = new Coppia<>(str,num);
		
		log.info("Contenuto: {} {}", c.getValore1(),c.getValore2());
		
		assertEquals(str, c.getValore1());
		assert(str == c.getValore1());
		
		assertEquals(num, c.getValore2());
		assert(num == c.getValore2());
	}
}