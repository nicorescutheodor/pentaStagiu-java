package main;

import java.util.Scanner;

public class Problema8 {

	/*Write a java program to return the index of a target element.
	For example:
	Given the following array [13,20,14,5,2,8] and a target element 5 the output should be : 3
	(because 5 is located at index 3 in the array)
	*/
	
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insert the lenght of the array: ");
		int arrayLength = scan.nextInt();
		
		
		int[] array = new int[arrayLength];
	
		for(int i = 0; i < arrayLength; i++) {
			System.out.print("V[" + i + "] = ");
			array[i] = scan.nextInt();		
		}
		
		System.out.println("Insert the target number: ");
		int targetIndex = scan.nextInt();
		
		for(int i = 0; i < arrayLength; i++) {
			if(targetIndex  == array[i]) {
				System.out.println("Targeted num" + targetIndex + "is located at index " + i + "in the array");
			}
		}
	}

}
