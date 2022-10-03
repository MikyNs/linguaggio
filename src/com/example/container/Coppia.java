package com.example.container;

public class Coppia<V1,V2> {
	
	private V1 valore1;
	private V2 valore2;

	public Coppia(V1 valore1,V2 valore2) {
		super();
		this.valore1 = valore1;
		this.valore2 = valore2;
	}
	
	public V1 getValore1() {
		return valore1;
	}
	
	public V2 getValore2() {
		return valore2;
	}
}