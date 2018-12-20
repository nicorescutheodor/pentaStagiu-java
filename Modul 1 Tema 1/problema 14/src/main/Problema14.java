package main;

import java.util.Scanner;

public class Problema14 {
	
	/*Write a program that will insert a # between any duplicate letters that 
	are placed right next to each.
	For example
	Given the following string “Hello world” the output should be “Helnlo world”*/
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner string1 = new Scanner(System.in); 
		System.out.print("insert the string: ");
		String givenString = string1.nextLine(); 
		String myVar = "";

		for (int i = 0; i < givenString.length() - 1; i++) {
			myVar += givenString.toCharArray()[i];
			if (givenString.toLowerCase().toCharArray()[i] == givenString.toLowerCase().toCharArray()[i + 1]) {
				myVar += "#";
			}
		}
		myVar += givenString.charAt(givenString.length() - 1);
		System.out.println(myVar);
	}
}
