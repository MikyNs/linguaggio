package com.example.test;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;

import com.example.geometria.Cerchio;
import com.example.geometria.Ellisse;
import com.example.geometria.Quadrato;
import com.example.geometria.Rettangolo;

class GeometriaTest {
	
	private static final Logger log = LogManager.getLogger(Log4j2Test.class);

	@Test
	void areaQuadratoTest() {
		Quadrato q = new Quadrato(10);
		double area = q.area();
		assertEquals(100.0, area);
	}

	@Test
	void areaPerimetroTest() {
		Quadrato q = new Quadrato(10);
		double perimetro = q.perimetro();
		assertEquals(40.0, perimetro);
	}

	@Test
	void areaEllisseTest() {
		Ellisse e = new Ellisse(3, 5);
		double area = e.area();
		assertEquals(47.12388980384689, area);
	}

	@Test
	void perimetroCerchioeTest() {
		Cerchio c = new Cerchio(10);
		double perimetro = c.perimetro();
		assertEquals(62.83185307179586, perimetro);
	}
	
	@Test
	void areaCerchioTest() {
		Cerchio c = new Cerchio(10);
		double perimetro = c.area();
		assertEquals(314.1592653589793, perimetro);
	}
	
	@Test
	void rettangoloTest() {
		Rettangolo r1 = new Rettangolo(10,20);
		assertNotNull(r1);
		log.info("Rettangolo 1=()", r1);
		Rettangolo r2 = new Rettangolo(10,20);
		assertEquals(r1, r2);
	}
}