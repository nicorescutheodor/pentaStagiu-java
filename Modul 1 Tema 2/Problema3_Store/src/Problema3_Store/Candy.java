package Problema3_Store;


public class Candy extends Product{
    private int candyQuantity;
    private String candyName;

    public Candy(int id, double candyPrice, String candyName, int candyQuantity) {
        super(id, candyPrice, candyName);
        this.candyQuantity = candyQuantity;
        this.candyName = candyName;
    }

    public int getCandyQuantity() {
        return candyQuantity;
    }

    public String getCandyName(){
        return candyName;
    }
}

