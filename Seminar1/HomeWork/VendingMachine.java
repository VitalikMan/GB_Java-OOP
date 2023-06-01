package Seminar1.HomeWork;

public interface VendingMachine {

    void addDrink(HotDrink drink);

    Drink getProduct(String name, int volume, int temperature);
}