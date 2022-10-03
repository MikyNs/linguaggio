package com.example.geometria;

import java.util.Objects;

public class Pentagono extends PoligonoRegolare {
	private double lato;

	public Pentagono(double lato) {
		super(5, lato, CostantiArea.PENTAGONO);
		this.lato = lato;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pentagono [lato=");
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
		Pentagono other = (Pentagono) obj;
		return Double.doubleToLongBits(lato) == Double.doubleToLongBits(other.lato);
	}

}