package com.example.cicli;

import java.util.Arrays;
import java.util.Random;

public class CicliDemo {
	public static void main(String[] args) {
		Random rnd = new Random();

		int[] arr = new int[10];

		for(int i=0; i<arr.length; i++) {
			arr[i] = rnd.nextInt(100); // il numero sarà 0 <= x < 100
		}

		CicliDemo cd = new CicliDemo();
		cd.stampa(arr);
		cd.raddoppia(arr); // raddoppiare il valore di ogni singolo elemento
		cd.stampa(arr); // è come se => cd.stampa_int[](arr)

		int somma = cd.somma(arr);
		cd.stampa(somma); // è come se => cd.stampa_int(somma)

		somma = cd.sommaIndicePari01(arr);
		cd.stampa(somma);

		somma = cd.sommaIndiceDispari01(arr);
		cd.stampa(somma);

		somma = cd.sommaIndicePari02(arr);
		cd.stampa(somma);

		somma = cd.sommaConWhile(arr);
		cd.stampa(somma);

		somma = cd.sommaConDoWhile(arr);
		cd.stampa(somma);

		somma = cd.sommaConLimite(arr, 1);
		cd.stampa(somma);

		somma = cd.sommaConLimiteDoWhile(arr, 1);
		cd.stampa(somma);

	}


	/********************metodi*******************************/


	private int sommaConLimiteDoWhile(int[] arr, int limite) {
		// for e while sono la stessa cosa vista da 2 punti di vista diversi
		// for e while sono sempre intercambiabili tra loro
		int somma = 0;
		int i = 0;
		do {
			somma += arr[i];
			 i++; // ricordare l'incremento altrimenti ciclo infinito
		} while(i < limite);
		return somma;
	}

	private int sommaConDoWhile(int[] arr) {
		// for e while sono la stessa cosa vista da 2 punti di vista diversi
		// for e while sono sempre intercambiabili tra loro
		int somma = 0;
		int i = 0;
		do {
			somma += arr[i];
			i++; // ricordare l'incremento altrimenti ciclo infinito
		} while(i < arr.length);
		return somma;
	}


	private int sommaConWhile(int[] arr) {
		// for e while sono la stessa cosa vista da 2 punti di vista diversi
		// for e while sono sempre intercambiabili tra loro
		int somma = 0;
		int i = 0;
		while(i < arr.length) {
			somma += arr[i];
			i++; // ricordare l'incremento altrimenti ciclo infinito
		}
		return somma;
	}


	private void raddoppia(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] *= 2; // equivalente arr[i] = arr[i] * 2;
		}
	}

	private void stampa(int[] arr) { // overloading
		System.out.println( Arrays.toString(arr) );
	}

	private void stampa(int valore) { // overloading
		System.out.println( valore );
	}

	/**
	 *
	 * @param arr
	 * @return
	 */
	private int somma(int[] arr) {
		int somma = 0;
		for (int el : arr) {
			somma += el;
		}
		return somma;
	}

	/**
	 * Questo metodo somma tutti gli elementi di un array partendo dal primo
	 * fino a maxIndice escluso
	 * @param arr, l'array da sommare
	 * @param maxIndice, l'indice massimo cui si può arrivare
	 * @return il valore della somma
	 */
	private int sommaConLimite(int[] arr, int maxIndice) {
		if(maxIndice>=arr.length) { // da non fare, SOLO PER DEMO
			maxIndice = arr.length - 1;
		}
		if(maxIndice<0) { // da non fare, SOLO PER DEMO
			maxIndice = 0;
		}
		int somma = 0;
		for (int i = 0; i < arr.length; i++) {
			if(i >= maxIndice) {
				break; // interrompe incondizionatamente il ciclo
			}
			somma += arr[i];
		}
		return somma;
	}

	private int sommaIndicePari01(int[] arr) {
		int somma = 0;
		for (int i = 0; i < arr.length; i += 2) {
			somma += arr[i];
		}
		return somma;
	}

	private int sommaIndicePari02(int[] arr) {
		int somma = 0;
		for (int i = 0; i < arr.length; i++) {
			// condizione per scartare gli indici dispari
			if(i%2 == 1) { // operare % calcola il modulo 10%7 => 3
				continue; // salta al next loop
			}
			somma += arr[i];
		}
		return somma;
	}

	private int sommaIndiceDispari01(int[] arr) {
		int somma = 0;
		for (int i = 1; i < arr.length; i += 2) {
			somma += arr[i];
		}
		return somma;
	}

}