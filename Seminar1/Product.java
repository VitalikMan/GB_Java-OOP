package Seminar1;

public abstract class Product {
    private String sort;
    private double price;
    private long id;

    public Product(String sort, double price, long id) {
        this.sort = sort;
        this.price = price;
        this.id = id;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
