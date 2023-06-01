package Seminar1;

public class Apple extends Product {

    public Apple(String kind, double price, long id) {
        super(kind, price, id);
    }

    @Override
    public String toString() {
        return String.format("У яблока: %s, %s, %s", getSort(), getPrice(), getId());
    }
}
