package com.example.exception;

public class exc01 {
	
	public static void main(String args[]) {
		int dividendo =100;
		int divisore = 10;
		double result = 0;
		
		try {
		result = dividendo /divisore;
		} catch(Exception e) {
			System.out.println("Occorsa eccezione "+e);
		}
		
	}

}
