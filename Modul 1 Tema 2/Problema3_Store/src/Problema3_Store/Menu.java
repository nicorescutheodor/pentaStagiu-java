package Problema3_Store;

public class Menu {

//////////// MAIN MENU ////////////
    public static void mainMenu() {
        System.out.println(" _____________________________");
        System.out.println("|   		STORE		      |");
        System.out.println("|—————————————————|");
        System.out.println("| Options:			          |");
        System.out.println(" ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        System.out.println("   1 - Books");
        System.out.println("   2 - Candy");
        System.out.println("   3 - Total price");
        System.out.println(" ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
    }

//////////// BOOK MENU ////////////
    public static void bookMenu(String firstBookName, String firstBookAuthor, double firstBookPrice,
                                String secondBookName, String secondBookAuthor, double secondBookPrice,
                                String thirdBookName, String thirdBookAuthor, double thirdBookPrice) {

        System.out.println(" _____________________________");
        System.out.println("|   		BOOKS		      |");
        System.out.println("|—————————————————|");
        System.out.println("| Choose:			          |");
        System.out.println(" ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        System.out.println("   1 - " + firstBookName + " . " + firstBookAuthor + ". Price: " + firstBookPrice + " lei");
        System.out.println("   2 - " + secondBookName + " . " + secondBookAuthor + ". Price: " + secondBookPrice + " lei");
        System.out.println("   3 - " + thirdBookName + " . " + thirdBookAuthor + ". Price: " + thirdBookPrice + " lei");
        System.out.println(" ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
    }

//////////// CANDY MENU ////////////
    public static void candyMenu(String firstCandyName, double firstCandyPrice, String secondCandyName,
                                 double secondCandyPrice, String thirdCandyName, double thirdCandyPrice) {

        System.out.println(" _____________________________");
        System.out.println("|   		CANDY		      |");
        System.out.println("|—————————————————|");
        System.out.println("| Choose:			          |");
        System.out.println(" ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        System.out.println("   1 - " + firstCandyName + ". Price: " + firstCandyPrice + " lei/100 gr");
        System.out.println("   2 - " + secondCandyName + ". Price: " + secondCandyPrice + " lei/100 gr");
        System.out.println("   3 - " + thirdCandyName + ". Price: " + thirdCandyPrice + " lei/100 gr");
        System.out.println(" ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");

    }

//////////// MEMBERSHIP TYPE MENU ////////////
    public static void membershipType() {
        System.out.println(" _____________________________");
        System.out.println("|   	 MEMBERSHIP TYPE      |");
        System.out.println("|—————————————————|");
        System.out.println("| Choose:			          |");
        System.out.println(" ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        System.out.println("    1 - NO membership");
        System.out.println("    2 - SILVER membership");
        System.out.println("    3 - GOLD membership");
        System.out.println(" ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
    }
}
