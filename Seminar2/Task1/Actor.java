package Seminar2.Task1;

public class Actor implements ActorBehavoir {

    protected String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public Actor(String name) {
        this.name = name;
    }

    @Override
    public void setMakeOrder() {
        System.out.println(name + " сделал заказ.");
        isMakeOrder = true;
    }

    @Override
    public void setTakeOrder() {
        System.out.println(name + " забрал заказ.");
        isTakeOrder = true;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }



}
