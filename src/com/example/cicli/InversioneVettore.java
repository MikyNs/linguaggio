package com.example.cicli;

import java.util.Arrays;
import java.util.Random;

public class InversioneVettore {

	static Random rnd = new Random();

	
	public static void main(String[] args) {

		inversoFor();
		inversoWhile();

	}

	
	private static void inversoFor() {
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];

		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = rnd.nextInt(50);
		}

		System.out.println(Arrays.toString(arr1));

		for (int i = 0; i < arr2.length; i++) {
			arr2[arr2.length - i - 1] = arr1[i];
		}

		System.out.println(Arrays.toString(arr2));
	}

	
	private static void inversoWhile() {
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		int i = 0;

		while (i < arr1.length) {
			arr1[i] = rnd.nextInt(50);
			i++;
		}

		System.out.println(Arrays.toString(arr1));

		i = 0;
		while (i < arr2.length) {
			arr2[arr2.length - i - 1] = arr1[i];
			i++;
		}

		System.out.println(Arrays.toString(arr2));

	}
}
