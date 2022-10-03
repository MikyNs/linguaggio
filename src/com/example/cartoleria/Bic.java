package com.example.cartoleria;

public class Bic extends Biro{

	private void internalScrivere(String t) {
		super.scrivere(t);
	}


	public void scrivere(String text) {
		this.internalScrivere(text);
	}
}