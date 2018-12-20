package main;

import java.util.Scanner;

public class Problema11 {

	/*Write a program that will count how many times a character appears in a String
	For example
	Given the string “Hello java world” and the target character ‘a’ the output should be 2
	(since ‘a’ appears twice in “Hello java world”)*/
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner string1 = new Scanner(System.in); 
		System.out.print("insert the string: ");
		String mainString = string1.nextLine(); 
		
		System.out.print("insert the caracter you want to count: ");
		Scanner string2 = new Scanner(System.in); 
		char countedChar = string2.next().charAt(0); 
	
		int counter = 0;
		
		for (int i = 0; i < mainString.length(); i++) {
		    if (mainString.charAt(i) == countedChar) {
		    	counter++;
		    }
		}
		System.out.print("the given string contains " + counter + " elements." );
	}

}
