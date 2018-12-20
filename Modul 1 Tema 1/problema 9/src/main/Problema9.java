package main;

import java.util.Scanner;

public class Problema9 {

	/*Write a Java program to find the number of even and odd integers in a given array of integers
	For example.
	Given the following array [13,20,14,5,2,8] the output should be:
	Odd elements count : 2
	Even elements count : 4*/
	
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insert the lenght of the array: ");
		int arrayLenght = scan.nextInt();
		int[] array = new int[arrayLenght];
		
		int oddCounter = 0;
		int evenCounter = 0;
	
		for(int i = 0; i < arrayLenght; i++) {
			System.out.print("V[" + i + "] = ");
			array[i] = scan.nextInt();		
		}
		for(int i = 0; i < arrayLenght; i++) {
			if(array[i] % 2 == 0) {
				evenCounter++;
			}
			else if(array[i] % 2 != 0) {
				oddCounter++;
			}
		}
		System.out.println("The array contains " + evenCounter + " even numbers.");
		System.out.println("The array contains " + oddCounter + " odd numbers.");
	}
}