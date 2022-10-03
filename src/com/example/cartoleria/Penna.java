package com.example.cartoleria;

public class Penna extends AttrezzoPerScrivere {

	@Override
	public void scrivere(String testo) {
		System.out.println("Penna: "+testo);
	}
}