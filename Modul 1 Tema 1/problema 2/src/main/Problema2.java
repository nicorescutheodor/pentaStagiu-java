package main;

import java.util.Scanner;

public class Problema2 {
	
	/*Write a program that will calculate the average and sum of all numbers between the range of
    2 numbers.
            For example, for range numbers 1 to 100 output should be:
    Sum for range 1 to 100 : 5050
    Average for range 1 to 100 : 50.5*/

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    System.out.print("Insert first number: ");
	    int firstNumber = scan.nextInt();
	    System.out.print("Insert the second number: ");
	    int secondNumber = scan.nextInt();
	    int sum = 0;
	    int counter = 0;
	    float average = (float) 0.0;
	    for(int i = firstNumber; i <= secondNumber; i++) {
	    	sum = sum + i;
	    	counter++;
	    	average = ((float)sum / counter);
	    }
	    System.out.print("Sum for range " +  firstNumber + " to " + secondNumber + " is "+ sum + "\n");
	    System.out.print("Average for range " +  firstNumber + " to " + secondNumber + " is " + average + "\n");
	}
}
