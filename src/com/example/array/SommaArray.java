package com.example.array;

public class SommaArray {
	
	public static void main(String[] args) {
		
		int sommaArray = 0;
		int [] array = new int[10];
		
		for(int i=0; i<10; i++) { 
			array[i] = 100-i;	
		}
		
		for(int i=0; i<10; i++) { 
			sommaArray= sommaArray + array[i];
		}
		
		System.out.println(sommaArray);
		
		sommaArray = 0;
		
		for(int i=9; i>=0; i--) { 
			sommaArray= sommaArray + array[i];
		}
		
		System.out.println(sommaArray);
		
		sommaArray = 0;
	
		
		for(int i:array) { 
			sommaArray= sommaArray + i;
		}
		
		System.out.println(sommaArray);
	}

}
