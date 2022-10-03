package com.example.geometria;

import java.util.Objects;

public class Ellisse extends FiguraGeometrica {


	private double semiasseMinore;
	private double semiasseMaggiore;

	public Ellisse(double semiasseMinore, double semiasseMaggiore) {
		super();
		this.semiasseMinore = semiasseMinore;
		this.semiasseMaggiore = semiasseMaggiore;
	}

	@Override
	public double area() {
		return Math.PI * semiasseMinore * semiasseMaggiore;
	}

	@Override
	public double perimetro() {
		return 2 * Math.PI * Math.sqrt( (Math.pow(semiasseMinore, 2) + Math.pow(semiasseMaggiore, 2) ) / 2);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ellisse [semiasseMinore=");
		builder.append(semiasseMinore);
		builder.append(", semiasseMaggiore=");
		builder.append(semiasseMaggiore);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(semiasseMaggiore, semiasseMinore);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ellisse other = (Ellisse) obj;
		return Double.doubleToLongBits(semiasseMaggiore) == Double.doubleToLongBits(other.semiasseMaggiore)
				&& Double.doubleToLongBits(semiasseMinore) == Double.doubleToLongBits(other.semiasseMinore);
	}

}