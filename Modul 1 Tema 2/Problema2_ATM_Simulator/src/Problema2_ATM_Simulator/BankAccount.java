package Problema2_ATM_Simulator;

public class BankAccount extends Problema2_ATM {

    public int totalAmount;

    public BankAccount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public  void depositSum() {
        totalAmount = totalAmount + deposit;
        System.out.println("The amount of" + deposit + " lei" + "has been added to your account.");
        System.out.println("Available funds: " + totalAmount + " lei");
    }
    public void withdrawSum() {
        if(withdraw < totalAmount) {
            totalAmount -= withdraw;
            System.out.println("Desired withdraw sum: " + withdraw + " lei");
            System.out.println("Available funds: " + totalAmount + " lei");
        }
        else if(withdraw == totalAmount){
            System.out.println("Available funds after withdraw: 0 lei.");
        }
        else if(withdraw > totalAmount){
            System.out.println("Transaction canceled: Insufficient funds.");
        }
    }
}
