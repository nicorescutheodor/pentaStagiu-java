package main;

import java.util.Scanner;

public class Problema5 {
	
	/* Write a program that test whether 2 int arrays are equal. Equality in this case means that both
	arrays have the same number of elements an element on a specific index in first array is
	equal to the element on the same index in the second array.
	For example
	For the following arrays [1,2,3,4] and [1,2,3,4] the output should be TRUE
	For the following arrays [] and [] the output should be TRUE
	For the following arrays [1,3,2] and [1,3] the output should be FALSE
	For the following arrays [1,2,3,4] and [1,2,4,3] the output should be FALSE
	*/


	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insert the lenght of first array: ");
		int firstArrayLength = scan.nextInt();
	
		System.out.println("Insert the lenght of second array: ");
		int secondArrayLength = scan.nextInt();
	
		int[] firstArray = new int[firstArrayLength];
		int[] secondArray = new int[secondArrayLength];
		boolean state = false;
		
		if(firstArrayLength != secondArrayLength){
			System.out.print("Arrays are not the same. State: ");
			state = false;
		}
		else{	
			state = true;
			for(int i = 0; i <secondArrayLength; i++) {
				System.out.print("n[" + i + "] = ");
				firstArray[i] = scan.nextInt();
			}
			
			for(int j = 0; j < firstArrayLength; j++) {
				System.out.print("m[" + j + "] = ");
				secondArray[j] = scan.nextInt();
			}
			for(int i = 0; i < firstArrayLength; i++){
				if(firstArray[i] != secondArray[i]){
					System.out.println("Arrays are not the same. State: ");
					state = false;
					break;
				}
				else{
					System.out.print("Arrays are the same. State: ");
					state = true;
				}
			}
		}
		System.out.println(state);
	}
}
