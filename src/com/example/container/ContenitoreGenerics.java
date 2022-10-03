package com.example.container;

public class ContenitoreGenerics<TIPO> {
	
	private TIPO object;

	public ContenitoreGenerics(TIPO object) {
		super();
		this.object = object;
	}

	public TIPO getObject() {
		return object;
	}
	
}
