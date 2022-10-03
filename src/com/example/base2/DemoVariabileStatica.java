package com.example.base2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DemoVariabileStatica {
	private static final Logger log = LogManager.getLogger(DemoVariabileStatica.class);

	private static int contatoreStatico = 0;
	private int contatore = 0;

	public void incrementa() {
		contatore = contatore + 1;
		log.info("incremento variabile di istanza {}", contatore);
	}

	public void incrementaStatico() {
		contatoreStatico = contatoreStatico + 1;
		log.info("incremento variabile statica {}", contatoreStatico);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("VariabileStatica [contatore=");
		builder.append(contatore);
		builder.append(" contatoreStatico=");
		builder.append(contatoreStatico);
		builder.append("]");
		return builder.toString();
	}


	public static void main(String[] args) {
		DemoVariabileStatica vs1 = new DemoVariabileStatica();
		vs1.incrementa();
		vs1.incrementa();
		vs1.incrementaStatico();

		DemoVariabileStatica vs2 = new DemoVariabileStatica();
		vs2.incrementa();
		vs2.incrementa();
		vs2.incrementa();
		vs2.incrementaStatico();
		vs2.incrementaStatico();

		log.info("Variabile statica vs1: {}",vs1);
		log.info("Variabile statica vs2: {}",vs2);
	}

}