package main;

import java.util.Scanner;

	/*Write a java program that will test whether the first and the last element of an int array are the same.
	 *  We can assume the array has 2 or more elements.  
	For example: For the following input [13,6,2,8,2,3] the output should be : FALSE 
	For the following input [13,6,2,8,2,13] the output should be : TRUE */
@SuppressWarnings("resource")
public class Problema4 {

	
	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Insert the length of the array: ");
		int arrayLenght = scan.nextInt();
		int[] array = new int[arrayLenght];
		for(int i = 0; i < arrayLenght; i++) {
			System.out.print("V[" + i + "] = ");
			array[i] = scan.nextInt();		
		}
		System.out.println (array.length >= 2 && array[0] ==  array[array.length-1]);
	}
}
