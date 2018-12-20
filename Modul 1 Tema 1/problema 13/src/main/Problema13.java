package main;

import java.util.Scanner;

public class Problema13 {
	
	/*Write a program that will return a different string representing the alphabet index of each
	letter.
	Assuming we have the following alphabet encoding
	a = 0
	b = 1
	c = 2
	d = 3
	…
	For the given string “abcd” the output should be “0123”*/

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner string1 = new Scanner(System.in); 
		System.out.print("insert the string: ");
		String givenString = string1.nextLine(); 
		
		final String alphabet = "abcdefghijklmnopqrstuvwxyz";

		for(int i=0; i < givenString.length(); i++){
		    System.out.print(" " + alphabet.indexOf(givenString.charAt(i)));
		}
	}

}
