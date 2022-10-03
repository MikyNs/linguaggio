package com.example.geometria;

import java.util.Objects;

public class Esagono extends PoligonoRegolare {
	private double lato;
	public Esagono(double lato) {
		super(6, lato, CostantiArea.ESAGONO);
		this.lato = lato;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Esagono [lato=");
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
		Esagono other = (Esagono) obj;
		return Double.doubleToLongBits(lato) == Double.doubleToLongBits(other.lato);
	}

}