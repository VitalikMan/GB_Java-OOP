package Seminar2.HomeWork2;

public class Actor {

    private final String name;
    private boolean isMakeOrder;
    private boolean isTakeOrder;

    public Actor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    public void setMakeOrder(boolean makeOrder) {
        isMakeOrder = makeOrder;
    }

    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    public void setTakeOrder(boolean takeOrder) {
        isTakeOrder = takeOrder;
    }

    @Override
    public String toString() {
        return String.format("%s", getName());
    }
}
