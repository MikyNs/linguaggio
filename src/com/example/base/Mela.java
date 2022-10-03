package com.example.base;

public class Mela {
	private String colore;

	public Mela(String colore) {
		super();
		this.colore = colore;
	}

	void cambiaColore(String colore) {
		System.out.print("1) prima "+this.colore);
		this.colore = colore;
		System.out.println(" - dopo "+this.colore);
	}

	void cambiaColore2(String colore) {
		System.out.print("2) prima "+this.colore);
		colore = "verde";
		this.colore = colore;
		System.out.println(" - dopo "+this.colore);
	}

	/**********************************/
	public static void main(String[] args) {
		Mela m = new Mela("Rosso");

		String str = "giallo-verde";
		m.cambiaColore(str);

		str = "Rosso";
		m.cambiaColore2(str);

		System.out.println(str);
	}
}