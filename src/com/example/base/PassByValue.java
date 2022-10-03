package com.example.base;

public class PassByValue {

	public static void main(String[] args) {
		PassByValue pbv = new PassByValue();

		int x = 100; // dato di tipo primitivo
		System.out.println("pre esegui1 x="+x);
		pbv.esegui1(x);
		System.out.println("post esegui1 x="+x);
		System.out.println();

		Contenitore c1 = new Contenitore(); // dato di tipo oggetto
		System.out.println("pre esegui2 c1.valore="+c1.valore);
		pbv.esegui2(c1);
		System.out.println("post esegui2 c1.valore="+c1.valore);
		System.out.println();

		String s1 = "Ciao"; // dato di tipo Oggetto Immutable
		System.out.println("pre esegui3 s1="+s1);
		pbv.esegui3(s1);
		System.out.println("post esegui3 s1="+s1);
		System.out.println();

	}

	// la x ricevuta dal metodo è una copia della x originale con il medesimo valore
	private void esegui1(int x) {
		x = x * 2;
		System.out.println("dentro esegui1 x="+x);
	}

	// il c1 ricevuto è una copia del c1 originale contenente il medesimo
	// valore di reference
	private void esegui2(Contenitore c1) {
		c1.valore = 3000;
		System.out.println("dentro esegui2 c1.valore="+c1.valore);
	}

	// l's1 ricevuto è una copia dell's1 originale contenente il medesimo
	// valore di reference, ma la nuova assegnazione del valore costringe
	// il compilatore ad allocare un nuovo reference per puntare alla
	// nuova stringa
	private void esegui3(String s1) {
		s1 = "Hello"; // qui il compilatore crea una nuova istanza di String con un reference diverso
		System.out.println("dentro esegui3 s1="+s1);
	}
}