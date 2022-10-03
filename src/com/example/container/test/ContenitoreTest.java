package com.example.container.test;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import com.example.container.Contenitore;

class ContenitoreTest {
	private static final Logger log = LogManager.getLogger(ContenitoreTest.class);

	@Test
	void testStringa() {
		Object str = "HelloWorld";

		Contenitore c = new Contenitore(str);

		log.info("Contenuto: {}", c.getObject());

		assertEquals(str, c.getObject());
		assert(str == c.getObject());
	}

	@Test
	void testNumero() {
		int x = 100;
		Contenitore c = new Contenitore(x); // compilatore auto-converte int ==> Integer ==> Boxing
		log.info("Contenuto: {}", c.getObject());
		int k = (Integer) c.getObject() * 2; // (Integer) c.getObject() ==> int Unboxing
		assertEquals(x, c.getObject());
		//assert(x == c.getObject());
	}

	@Test
	void testStringa2() {
		Object str = "HelloWorld";
		Contenitore c = new Contenitore(str);

		log.info("Contenuto: {}", c.getObject());

		Object o = c.getObject();

		Integer integ = (Integer) o; // ClassCastException

		String s = (String) o; // cast o conversione forzata a stringa

		log.info("Lunghezza della stringa: {}", s.length() );

		assertEquals(str, c.getObject());
		assert(str == c.getObject());
	}


}
