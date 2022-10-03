package com.example.geometria;

import java.util.Objects;

public class Decagono extends PoligonoRegolare {
	private double lato;
	public Decagono(double lato) {
		super(10, lato, CostantiArea.DECAGONO);
		this.lato = lato;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Decagono [lato=");
		builder.append(lato);
		builder.append("]");
		return builder.toString();
	}
	@Override
	public int hashCode() {
		return Objects.hash(lato);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Decagono other = (Decagono) obj;
		return Double.doubleToLongBits(lato) == Double.doubleToLongBits(other.lato);
	}

}