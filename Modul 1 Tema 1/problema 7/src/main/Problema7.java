package main;

import java.util.Scanner;

public class Problema7 {
	
	/*	Write a java program that will return the min, max and average values in a given array.
	For example
	GIven the following array [13,20,14,5,2,8] the output should be
	Max : 20
	Min : 2
	Average: 10.3
	*/

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Insert the length of the array: ");
		int arrayLength = scan.nextInt();
		
		int[] array = new int[arrayLength];
	
		for(int i = 0; i < arrayLength; i++) {
			System.out.print("V[" + i + "] = ");
			array[i] = scan.nextInt();		
			
		}
		System.out.println("Max element is: " + getMaxValue(array));
		System.out.println("Min element is: " + getMinValue(array));
		System.out.println("Average is: " + getAverageValue(array));
	}
	
	public static int getMaxValue(int[] array){
		int maxValue = array[0];
		for(int i = 1; i < array.length; i++){
			if(array[i] > maxValue){
				maxValue = array[i];
			}
		}
		return maxValue;
	}
	
	public static int getMinValue(int[] array){
		int minValue = array[0];
		for(int i = 1; i < array.length; i++){
			if(array[i] < minValue){
				minValue = array[i];
			}
		}
		return minValue;
	}
	
	public static float getAverageValue(int[] array) {
		float averageValue = array[0];
		int sum = array[0];
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
			averageValue = (float)(sum)/array.length;
		}
		return averageValue;
	}
}
