package Seminar1;

public class Banana extends Product{

    public Banana(String kind, double price, long id) {
        super(kind, price, id);
    }

    @Override
    public String toString() {
        return String.format("У банана: %s, %s, %s", getSort(), getPrice(), getId());
    }

}
