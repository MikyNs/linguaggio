package com.example.cartoleria;

public class Matita extends AttrezzoPerScrivere {

	@Override
	public void scrivere(String testo) {
		System.out.println("Matita: "+testo);
	}

}