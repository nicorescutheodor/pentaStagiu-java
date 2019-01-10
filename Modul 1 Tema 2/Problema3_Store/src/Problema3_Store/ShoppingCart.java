package Problema3_Store;

public class ShoppingCart {
    private double totalPrice;
    private double silverDiscount;
    private double goldDiscount;

    public ShoppingCart(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void addProduct (double itemPrice, int itemQuantity) {
        totalPrice += (itemPrice * itemQuantity);
        System.out.println("You have to pay: " + totalPrice + "lei");
    }

//////////// FINAL PRICE CALCULATIONS ////////////
    public void getFinalPrice(Customer client) {
        switch(client) {
            case NO_MEMBERSHIP: {
                System.out.println(" Customer name: Theodor Nicorescu");
                System.out.println(" Customer id:   1 \n");
                System.out.println("You have no membership discount.");
                System.out.println("You have to pay: " + totalPrice + "lei");
                break;
            }
            case SILVER_MEMBERSHIP: {
                System.out.println(" Customer name: Theodor Nicorescu");
                System.out.println(" Customer id:   1 \n");
                System.out.println("Total price without discount: " + totalPrice + "lei");
                silverDiscount = totalPrice*(10/100.0f);
                totalPrice = totalPrice - silverDiscount;
                System.out.println("You get a 10% discount for SILVER membership: " + silverDiscount + " lei");
                System.out.println("Total price with discount: " +  totalPrice + "lei");
                break;
            }
            case GOLD_MEMBERSHIP: {
                System.out.println(" Customer name: Theodor Nicorescu");
                System.out.println(" Customer id:   1 \n");
                System.out.println("Total price without discount: " + totalPrice + "lei");
                goldDiscount = totalPrice*(20/100.0f);
                totalPrice = totalPrice - goldDiscount;
                System.out.println("You get a 20% discount for GOLD membership: " + goldDiscount + " lei");
                System.out.println("Total price with discount: " +  totalPrice + "lei");
                break;
            }
        }
    }
}


