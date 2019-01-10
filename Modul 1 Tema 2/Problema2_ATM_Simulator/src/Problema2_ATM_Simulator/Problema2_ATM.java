package Problema2_ATM_Simulator;

import java.util.Scanner;



/*
Create a console application from the following requirements:
A bank account from where someone has the option to withdraw and deposit money
Write information to the console each time someone makes an operation on that account
Take into consideration any validations that have to be done since this is a debit account, 
so user can’t withdraw more than he has into account. Display this information to inform the user about why the operation failed
*/

public class Problema2_ATM {

    public int withdraw;
    public int deposit;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int option;
        Boolean menu = true;

        BankAccount totalAmount = new BankAccount(1000);

        System.out.println(" _______________________________");
        System.out.println("|   		ATM Simulator		|");
        System.out.println(" ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        System.out.println("| Options:				        |");
        System.out.println(" ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        System.out.println("    1. Money withdraw");
        System.out.println("    2. Money deposit");
        System.out.println(" ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        System.out.println("Select you option: ");

        while(menu) {
            option = scan.nextInt();
            if (option == 1) {
                System.out.println(" _______________________________");
                System.out.println("|   	Option 1 selected		|");
                System.out.println(" ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
                System.out.println("    1. Money withdraw");
                System.out.println(" ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
                System.out.print("Please enter how much you want to withdraw: ");
                totalAmount.withdraw = scan.nextInt();
                totalAmount.withdrawSum();
            }
            if (option == 2) {
                System.out.println(" _______________________________");
                System.out.println("|   	Option 2 selected		|");
                System.out.println(" ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
                System.out.println("    1. Money deposit");
                System.out.println(" ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
                System.out.print("Please enter how much you want to deposit: ");
                totalAmount.deposit = scan.nextInt();
                totalAmount.depositSum();
            }
        }
    }
}

