package main;

import java.util.Scanner;

public class Problema3 {

	/*Write a program that will print the first x fibonacci numbers. 
	 * Also calculate the average value.
	For example
	For an input of x = 20 the output should be:
	The first 20 Fibonacci numbers are:
	1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
	The average is 885.5 */
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	    System.out.println("Insert the number: ");
	    int targetNum = scan.nextInt();
	    int num1 = 0;
	    int num2 = 1;
	    int counter = 1;
	    int fibNum;
	    int fibSum = 0;
	    float fibAverage = 0;
    
	    System.out.print("first" + targetNum + "Fibonacci numbers are: ");
	    System.out.print(num1 + ", " + num2);
	    for(int i = 2; i <= targetNum; i++) {
	    	fibSum = fibSum + num1 + num2;
	    	fibNum = num1 + num2;
	    	num1 = num2;
	    	num2 = fibNum;
	    	counter++;
	    	System.out.print(", " + fibNum);
	    }
	    fibAverage = (float)(fibSum)/counter;
	    System.out.println("\n" + "Counter: " + fibAverage);
	}
}
