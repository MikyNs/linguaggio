package com.example.base;

public class Variabili {

	// definita nel blocco classe, quindi valida da quando l'istanza nasce
	// a quando l'istanza muore
	// una variabile di istanza è condivisa da tutti i metodi
	private int t = 100; // variabile di istanza

	// definita nella classe, ma essendo static è sempre visibile, scope da quando
	// viene usata la prima volta a quando muore la JVM
	// di una variabile static (allocata dal compilatore) ne esiste una sola copia
	// in tutta la JVM, quindi è condivisibile da tutti gli utilizzatori
	public static /*final*/ long z = 200; // variabile di classe (se final costante)

	public static void main(String[] args) {
		var x = 100; // equivale a int x = 100;
		var y = 100.0; // equivale a double y = 100.0;
		var t = "Hello"; // String t
	}

	void faiQualcosa() {
		// la variabile automatica nasce dalla sua definizione
		// non ha un valore di default assegnabile
		// la variabile cessa di esistere all'uscita del blocco
		int k = 32; // variabile automatica o di stack


		if(k>20) {
			int s = 22;
			System.out.println(s); // s è in scope
			boolean t = false;
		}
		String t = "hhh"; // copre la variabile di istanza t

		this.t = 300; // per riagganciare la variabile di istanza

		/* System.out.println(s); // s è out of scope, definito nella if */
		/* System.out.println(y); // y è out of scope, definito nella main */
		System.out.println(z);
	}
}