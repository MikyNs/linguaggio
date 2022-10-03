package com.example.array;

import java.util.Random;

public class Array01 {

	public static void main(String[] args) {

		// creare un array di 5 interi
		int [] arrayDiInteri = new int[5];
		arrayDiInteri[0] = 22;
		arrayDiInteri[1] = -7;
		arrayDiInteri[2] = -9876;
		arrayDiInteri[3] = 12;
		arrayDiInteri[4] = 3;

		System.out.println(arrayDiInteri.getClass().getCanonicalName());
		System.out.println(arrayDiInteri.getClass().getName());

		long [] arrayDiLong = {123, 88, -99L, 87L, 13};
		System.out.println(arrayDiLong.getClass().getName());


		int x = 0;
		x = x + 1;
		x += 1;
		x++; // ++ postfisso
		++x; // ++ prefisso

		x=x-1;
		x -= 1;
		x--; // -- postfisso
		--x; // -- prefisso

		x=x*8;
		x*=8;

		x=x/3;
		x/=3;

		Array01 a01 = new Array01();

		int k = 10;
		a01.testIncrement(k, "k");
		a01.testIncrement(k++, "k++"); // prima chiama il metodo e poi valuta il nuovo k
		k=10;
		a01.testIncrement(++k, "++k"); // prima valuta il nuovo k e poi chiama il metodo

		Random rnd = new Random();
		int [] ia = new int[5];
		for(int i=0; i<ia.length; i++) { // ciclo/loop
			ia[i] = rnd.nextInt();
		}

		for(int i=0; i<ia.length; i++) {
			System.out.println(ia[i]);
		}

	}

	private void testIncrement(int valore, String condizione) {
		System.out.println(condizione+": "+valore);
	}

}