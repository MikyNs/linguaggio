package com.example.base;

import java.util.Scanner;

public class HelloWorld { // nome della classe è package com.example.base.HelloWorld:

	// creare il main entry point per la JV;
	// uso un emmet (abbreviazione) per creare il main
	public static void main(String[] args) { // entry point per la jvm
		Scanner scan = new Scanner(System.in);

		System.out.println("Standard Output - Hello World!!!");
		System.err.println("Standard Error - Hello World!!!");

		if (scan.hasNext()) {
			System.out.println(scan.next());
		}

		// Esercizio provare a stampare una frase su stdout e stderr

		/* creo un'istanza della classe Prova */
		// collegato il funzionamento di Prova dato da faiQualcosa
		// al funzionamento di HelloWorld dato da main
		Prova p = new Prova(); // creo un'istanza di prova
		System.out.println(p.raddoppia(10));
		
		scan.close();
	}
}
