package com.example.geometria;

import java.util.Objects;

public class Ottagono extends PoligonoRegolare {
	private double lato;
	public Ottagono(double lato) {
		super(8, lato, CostantiArea.OTTAGONO);
		this.lato = lato;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ottagono [lato=");
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
		Ottagono other = (Ottagono) obj;
		return Double.doubleToLongBits(lato) == Double.doubleToLongBits(other.lato);
	}
}