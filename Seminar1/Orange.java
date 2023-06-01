package Seminar1;

public class Orange extends Product {

    public Orange(String kind, double price, long id) {
        super(kind, price, id);
    }

    @Override
    public String toString() {
        return String.format("У апельсина: %s, %s, %s", getSort(), getPrice(), getId());
    }

}
