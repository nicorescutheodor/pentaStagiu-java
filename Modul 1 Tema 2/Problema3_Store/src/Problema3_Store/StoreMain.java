package Problema3_Store;

import java.util.Scanner;

/*
Create a console application from the following requirements:
We have a shop, that sells 2 products: books(with info about the author) and candy(with info about the quantity in grams)
A customer will go to this shop and he will chose some items from the shop, in different quantities
Each customer has a membership status, based on which discounts will be applied: GOLD → 20%, SILVER → 10%, no membership → 0%
Create a customer, create products and add them to his basket and print to the console the total price for the products that he ordered
Change the membership of the Customer and print again the total price
*/


public class StoreMain extends Menu {

    public static void main(String[] args) {
        Scanner selection = new Scanner(System.in);
        int mainMenu;
        int bookMenu;
        int membershipType;
        boolean totalPrice = false;

        Book firstBook = new Book(1, 50, "Angels & Demons", "Dan Brown");
        Book secondBook = new Book(2, 45, "Introduction to JAVA - 8th Ed", "Y. Daniel Liang");
        Book thirdBook = new Book(3, 25, "Secrets of Success", "Dale Carnegie");

        Candy firstCandy = new Candy(4, 7.5, "Gummy Bears", 1);
        Candy secondCandy = new Candy(5, 15, "Macarons", 1);
        Candy thirdCandy = new Candy(6, 4.5, "Candy Sticks", 1);

        Customer client = Customer.NO_MEMBERSHIP;
        client.setCustomerName("Theodor Nicorescu");
        client.setCustomerId(1);

        ShoppingCart clientSoppingCart = new ShoppingCart(0);

        while (!totalPrice) {
            mainMenu();
            mainMenu = selection.nextInt();

//////////// BOOK MENU ////////////
            if (mainMenu == 1) {
                bookMenu(firstBook.getBookName(), firstBook.getBookAuthor(), firstBook.getProductPrice(),
                        secondBook.getBookName(), secondBook.getBookAuthor(), secondBook.getProductPrice(),
                        thirdBook.getBookName(), thirdBook.getBookAuthor(), thirdBook.getProductPrice());
                bookMenu = selection.nextInt();

                switch(bookMenu){
                    case 1: {
                        clientSoppingCart.addProduct(firstBook.getProductPrice(), 1);
                        break;
                    }
                    case 2: {
                        clientSoppingCart.addProduct(secondBook.getProductPrice(), 1);
                        break;
                    }
                    case 3: {
                        clientSoppingCart.addProduct(thirdBook.getProductPrice(), 1);
                        break;
                    }
                    default: {
                        System.out.println("Invalid selection.");
                        break;
                    }
                }

                //////////// CANDY MENU ////////////
            } else if (mainMenu == 2) {
                int candyMenu;
                candyMenu(firstCandy.getCandyName(), firstCandy.getProductPrice(), secondCandy.getCandyName(),
                        secondCandy.getProductPrice(), thirdCandy.getCandyName(), thirdCandy.getProductPrice());
                candyMenu = selection.nextInt();
                switch (candyMenu) {
                    case 1: {
                        clientSoppingCart.addProduct(firstCandy.getProductPrice(), firstCandy.getCandyQuantity());
                        break;
                    }
                    case 2: {
                        clientSoppingCart.addProduct(secondCandy.getProductPrice(), secondCandy.getCandyQuantity());
                        break;
                    }
                    case 3: {
                        clientSoppingCart.addProduct(thirdCandy.getProductPrice(), thirdCandy.getCandyQuantity());
                        break;
                    }
                    default: {
                        System.out.println("Invalid selection.");
                        break;
                    }
                }
            }
//////////// MEMBERSHIP TYPE MENU ////////////
             else if (mainMenu == 3) {
                totalPrice = true;
                membershipType();
                membershipType = selection.nextInt();
                switch (membershipType) {
                    case 1: {
                        client = Customer.NO_MEMBERSHIP;
                        break;
                    }
                    case 2: {
                        client = Customer.SILVER_MEMBERSHIP;
                        break;
                    }
                    case 3: {
                        client = Customer.GOLD_MEMBERSHIP;
                        break;
                    }
                    default: {
                        System.out.println("Invalid selection.");
                        break;
                    }
                }

//////////// FINAL PRICE ACCORDING TO MEMBERSHIP TYPE
                clientSoppingCart.getFinalPrice(client);
            }
        }
    }
}
