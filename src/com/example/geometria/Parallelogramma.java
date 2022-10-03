package com.example.geometria;

import java.util.Objects;

public class Parallelogramma extends Trapezio {
	private double baseMinore;
	private double baseMaggiore;
	private double altezza;

	public Parallelogramma(double baseMinore, double baseMaggiore, double altezza) {
		super(baseMinore, baseMaggiore, altezza);
		this.baseMinore = baseMinore;
		this.baseMaggiore = baseMaggiore;
		this.altezza = altezza;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Parallelogramma [baseMinore=");
		builder.append(baseMinore);
		builder.append(", baseMaggiore=");
		builder.append(baseMaggiore);
		builder.append(", altezza=");
		builder.append(altezza);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(altezza, baseMaggiore, baseMinore);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parallelogramma other = (Parallelogramma) obj;
		return Double.doubleToLongBits(altezza) == Double.doubleToLongBits(other.altezza)
				&& Double.doubleToLongBits(baseMaggiore) == Double.doubleToLongBits(other.baseMaggiore)
				&& Double.doubleToLongBits(baseMinore) == Double.doubleToLongBits(other.baseMinore);
	}

}