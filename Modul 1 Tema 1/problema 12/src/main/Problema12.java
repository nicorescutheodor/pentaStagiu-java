package main;

import java.util.Scanner;

public class Problema12 {
	
	/*Write a program that will test whether a string ends with another string
For example
Given the following strings “Hello java world” and “orld” the output should be TRUE*/

	@SuppressWarnings("resource")
	public static void main(String[] args) {
			
			Scanner string1 = new Scanner(System.in); 
			System.out.print("insert the first string: ");
			String firstString = string1.nextLine(); 
			
			System.out.print("insert the second string: ");
			Scanner string2 = new Scanner(System.in); 
			String secondString = string2.nextLine(); 
			
			boolean end = firstString.endsWith(secondString);
	        System.out.print(end);

	}

}
