package Problema3_Store;

@SuppressWarnings("unused")
public class Book extends Product {
    private String bookAuthor;
    private String bookName;
    private int id;
    private double bookPrice;

    public Book(int id, double bookPrice, String bookName, String bookAuthor) {
        super(id, bookPrice, bookName);
        this.id = id;
        this.bookAuthor = bookAuthor;
        this.bookName = bookName;
    }

    public double getBookPrice(){
        return bookPrice;
    }

    public String getBookName(){
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }
}
