package Thuvien;

public class Book {
    private String name;
    private String author;
    private long price;
    private long totalSold;

    public Book(String name, String author, long price, long totalSold) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.totalSold = totalSold;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public long getPrice() {
        return price;
    }

    public long getTotalSold() {
        return totalSold;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public void setTotalSold(long totalSold) {
        this.totalSold = totalSold;
    }

    public boolean check() {
        return this.totalSold > 1000;
    }

    public String showBook() {
        return "name: " + name + "; author: " + author + "; price: " + price + "; totalSold: " + totalSold + " .";
    }
}
