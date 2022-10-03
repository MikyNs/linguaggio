package com.example.cartoleria;

public class BiroAPulsante extends Biro{
	/*
	 * 1 cartuccia (contiene Inchiostro), 1 pulsante,
	 * azione: premerePulsante azione: scrivere
	 */

	// necessita di un dato di tipo cartuccia ?

	// necessita di un pulsante perchè dobbiamo premerlo
	// dobbiamo capire che tipo di dato è il pulsante
	private boolean onOff = false; // variabile di istanza, ovvero variabile di stato


	public BiroAPulsante() {
		super();
	}

	public BiroAPulsante(boolean onOff) {
		super();
		this.onOff = onOff;
	}

	public void scrivere(String testo) {
		// non si può scrivere sino a che il pulsante non viene premuto
		/*
		 * if(onOff == false) { return; }
		 */

		if(!onOff) { // la if vuole un'espressione che calcolata dia un valore booleano
			return;
		}

		super.scrivere(testo);// System.out.println(testo);
	}

	public void premereIlPulsante() {
		// abilita la biro a funzionare
		// premo da off => on
		// premo da on => off
		onOff = !onOff; // assegnazione di un valore ad una variabile
	}

}