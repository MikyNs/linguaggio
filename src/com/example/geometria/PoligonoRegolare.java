package com.example.geometria;

import java.util.Objects;

/**
 *
 * @see https://www.youmath.it/formulari/formulari-di-geometria-piana/419-tutte-le-formule-sui-poligoni-regolari.html
 */
public class PoligonoRegolare extends FiguraGeometrica{
	private int numeroLati;
	private double lato;
	private double costanteArea;

	// costruttore reso con visibilità protected perchè consente la creazione di poligoni
	// di cui mancano i dati
	protected PoligonoRegolare(int numeroLati, double lato, double costanteArea) {
		super();
		this.numeroLati = numeroLati;
		this.lato = lato;
		this.costanteArea = costanteArea;
	}

	public double perimetro() {
		return lato * numeroLati;
	}

	public double area() {
		return lato * lato * costanteArea;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PoligonoRegolare [numeroLati=");
		builder.append(numeroLati);
		builder.append(", lato=");
		builder.append(lato);
		builder.append(", costanteArea=");
		builder.append(costanteArea);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(costanteArea, lato, numeroLati);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PoligonoRegolare other = (PoligonoRegolare) obj;
		return Double.doubleToLongBits(costanteArea) == Double.doubleToLongBits(other.costanteArea)
				&& Double.doubleToLongBits(lato) == Double.doubleToLongBits(other.lato)
				&& numeroLati == other.numeroLati;
	}

}