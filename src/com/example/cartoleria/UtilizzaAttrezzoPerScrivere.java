package com.example.cartoleria;

public class UtilizzaAttrezzoPerScrivere {

	public static void main(String[] args) {
		Bic bic = new Bic();

		bic.scrivere("Questo è un messaggio!");

		Matita matita = new Matita();
		matita.scrivere("Un altro messaggio di testo!!");

		Penna penna = new Penna();
		penna.scrivere("Ancora un altro messaggio di testo!!");


		Biro biro2 = new Bic();

		AttrezzoPerScrivere aps = new Bic();

		aps.scrivere("Messaggio di testo affidato ad un'istanza della classe abstract");

	}

}
