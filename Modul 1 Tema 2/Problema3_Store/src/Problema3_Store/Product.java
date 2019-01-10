package Problema3_Store;

@SuppressWarnings("unused")
public class Product {
    private int productId;
    private double productPrice;
    private String productName;

    public Product(int productId, double productPrice, String productName) {
        this.productId = productId;
        this.productPrice = productPrice;
        this.productName = productName;
    }

    public int getProductId() {
        return productId;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public String getProductName() {
        return productName;
    }
}
