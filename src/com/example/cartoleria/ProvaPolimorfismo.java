package com.example.cartoleria;

import java.util.Random;

public class ProvaPolimorfismo {

	public static void main(String[] args) {
		Random random = new Random();

		for (int i = 0; i < 5; i = i + 1) { // ripeto 5 volte: i=0,i=1,i=2,i=3,i=4
			int valore = random.nextInt(4);

			AttrezzoPerScrivere aps = null;

			switch (valore) {
			case 0:
				aps = new BiroAPulsante(true);
				break;
			case 1:
				aps = new Bic();
				break;
			case 2:
				aps = new Matita();
				break;
			case 3:
				aps = new Penna();
				break;
			default:
				System.out.println("Valore out of range");
				break;
			}

			aps.scrivere("Prova comportamento polimorfo "+i);
		}
	}

}
