package main;

import java.util.Scanner;

public class Problema10 {
	
	/*Write a program that test if a given String contains another String.
	For example
	Given the following base String “Hello java world” and the target 
	test String “java” the output should be TRUE*/

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner string1 = new Scanner(System.in); 
		System.out.print("insert the first string: ");
		String firstString = string1.nextLine(); 
		
		System.out.print("insert the second string: ");
		Scanner string2 = new Scanner(System.in); 
		String secondString = string2.nextLine(); 
		
		System.out.print(firstString.contains(secondString));
		 
	}

}
