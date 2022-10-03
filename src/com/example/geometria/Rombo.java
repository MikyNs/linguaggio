package com.example.geometria;

import java.util.Objects;

import com.example.geometria.util.TeoremaDiPitagora;

public class Rombo extends FiguraGeometrica {
	private double diagonaleMinore;
	private double diagonaleMaggiore;

	public Rombo(double diagonaleMinore, double diagonaleMaggiore) {
		super();
		this.diagonaleMinore = diagonaleMinore;
		this.diagonaleMaggiore = diagonaleMaggiore;
	}

	@Override
	public double area() {
		return diagonaleMinore * diagonaleMaggiore / 2;
	}

	@Override
	public double perimetro() {
		return lato() * 4;
	}

	private double lato() {
		return TeoremaDiPitagora.ipotenusa(diagonaleMinore/2, diagonaleMaggiore/2);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rombo [diagonaleMinore=");
		builder.append(diagonaleMinore);
		builder.append(", diagonaleMaggiore=");
		builder.append(diagonaleMaggiore);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(diagonaleMaggiore, diagonaleMinore);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rombo other = (Rombo) obj;
		return Double.doubleToLongBits(diagonaleMaggiore) == Double.doubleToLongBits(other.diagonaleMaggiore)
				&& Double.doubleToLongBits(diagonaleMinore) == Double.doubleToLongBits(other.diagonaleMinore);
	}

}