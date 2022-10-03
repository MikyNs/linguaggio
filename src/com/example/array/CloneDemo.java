package com.example.array;

import java.util.Arrays;

public class CloneDemo {
	public static void main(String[] args) throws CloneNotSupportedException {
		//dati primitivi
		int [] arr1 = {33, 5, 78, 99, 1, 0, 22, 22, 11};
		int [] arr2 = arr1.clone();
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(arr1==arr2);

		// il clone ha creato un nuovo array copiando i numeri dal primo al nuovo array
		// nel caso di array di dati primitivi è tutto OK.



		// per gli oggetti immutable la clone copia solo l'array,
		// i dati rimangono gli stessi
		// shallow copy (copia superficiale)
		String str = "aa"; // str = new String("aa");
		str = str + "aa";
		String [] strArr1 = {str, "bbbbb", "ccccc", "dddd"};
		String [] strArr2 = strArr1.clone();
		System.out.println(strArr1);
		System.out.println(strArr2);
		System.out.println(strArr1==strArr2);
		System.out.println(strArr1[0]==strArr2[0]);
		System.out.println(strArr1[1]==strArr2[1]);

		// oggetti mutable
		Contenitore [] contenitori1 = new Contenitore[5];
		for(int i=0; i<contenitori1.length; i++) {
			contenitori1[i] = new Contenitore(i*3);
		}
		System.out.println( Arrays.toString(contenitori1));

		Contenitore [] contenitori2 = contenitori1.clone(); // a) shallow copy
		System.out.println( Arrays.toString(contenitori2));

		for(int i=0; i<contenitori2.length; i++) {
			contenitori2[i] = (Contenitore) contenitori1[i].clone(); // b)
		}

		// a) +b) si definisce deep copy (copia profonda) vera clone
		contenitori1[0].x = 100;
		System.out.println( Arrays.toString(contenitori1));
		System.out.println( Arrays.toString(contenitori2));
	}
}