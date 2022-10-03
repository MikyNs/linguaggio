package com.example.array;

import java.io.Serializable;

public class Contenitore implements Cloneable, Serializable {
	public int x;

	public Contenitore(int x) {
		super();
		this.x = x;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[x=");
		builder.append(x);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}


}