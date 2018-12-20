package main;

import java.util.Scanner;

public class Problema1 {

	/*Write a program that will sum up all numbers from 0 up to a target number.
	For example, for an input number 5, result should be 15 (0+1+2+3+4+5)*/
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {

	        Scanner scan = new Scanner(System.in);
	        System.out.print("Insert the target number: ");
	
	        int number = scan.nextInt();
	        int sum = 0;
	        for( int i = 0; i <= number; i++){
	            sum = sum + i;
	        }
	        System.out.print("The total sum is:" + sum);
	}
}
