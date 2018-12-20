package main;

import java.util.Scanner;

public class Problema15 {

	
	/*Write a program to test whether a given string is a palindrome or not
	For example
	Given the following string “aaabccbaaa” should return TRUE
	Given the following string “abccbb” should return FALSE*/
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner string1 = new Scanner(System.in); 
		System.out.print("insert the string: ");
		String givenString = string1.nextLine();
		String reverse = "";
		boolean palindrome = false;
		int length = givenString.length();
		
		 for (int i = length - 1; i >= 0; i--) {
	         reverse = reverse + givenString.charAt(i);
		 }
	     if (givenString.equals(reverse)) {
	    	 palindrome = true;
	         System.out.println(palindrome);
	     }
	     else {
	    	 palindrome = false;
	         System.out.println(palindrome);
	     }
	}

}
