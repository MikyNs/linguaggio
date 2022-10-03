package com.example.collezioni;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class IntegerCollectionDemo {
	private static final Logger log = LogManager.getLogger(IntegerCollectionDemo.class);

	private List<Integer> interi = new ArrayList<>();

	private Random rnd = new Random();

	private void filList(int numeroElementi, int limiteDelValore) {
		for (int i = 0; i < numeroElementi; i++) {
			interi.add(rnd.nextInt(limiteDelValore));
		}
	}

	public static void main(String[] args) {

		IntegerCollectionDemo icd = new IntegerCollectionDemo();

		icd.filList(100, 1000);
		log.info("Numero oggetti contenuti {}", icd.interi.size());

		Integer rimosso = icd.interi.remove(55);
		log.info("Rimosso {}, numero oggetti ora contenuti {}", rimosso, icd.interi.size());

		int somma = 0;
		for (int i = 0; i < icd.interi.size(); i++) {
			somma += icd.interi.get(i);
		}
		log.info("La somma di {} elementi è {}", icd.interi.size(), somma);

		somma = 0;
		for (int valore : icd.interi) {
			somma += valore;
		}
		log.info("La somma di {} elementi è {}", icd.interi.size(), somma);

		log.info("L'elemento zeresimo è {}", icd.interi.get(0));
		log.info("L'ultimo elemento è {}", icd.interi.get(icd.interi.size() - 1));

		Iterator<Integer> it = icd.interi.iterator();
		while (it.hasNext()) {
			Integer in = it.next();
			// log.info(in);
		}
		for (Integer valore : icd.interi) { // applicabile agli oggetti che ritornano un Iterator
			// log.info(valore);
		}
		
		Consumer funzione = intero -> log.info(intero);
		icd.interi.forEach(funzione);

		icd.interi.forEach(intero -> {
			log.info(intero);
		});
	}
}