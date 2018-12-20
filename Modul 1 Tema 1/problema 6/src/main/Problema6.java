package main;

import java.util.Scanner;

public class Problema6 {
	
	/*
	 * Write a java program that will concatenate 2 arrays.
	For example
	Given 2 arrays [1,2,3,4] and [5,6,7,8] the output should be a new array containing
	[1,2,3,4,5,6,7,8]
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
		int[] finalArray = new int[firstArrayLength + secondArrayLength];
		
		for(int i = 0; i < firstArrayLength; i++) {
			System.out.print("V1[" + i + "] = ");
			firstArray[i] = scan.nextInt();
		}
		
		for(int j = 0; j < secondArrayLength; j++) {
			System.out.print("V2[" + j + "] = ");
			secondArray[j] = scan.nextInt();
		}
		for(int i = 0; i < firstArrayLength + secondArrayLength; i++) {
			if(i < firstArrayLength){
				finalArray[i] = firstArray[i];
			}
			else{
				finalArray[i] = secondArray[i - firstArrayLength];
			}
		System.out.print(" " + finalArray[i]);
		}
	}
}
