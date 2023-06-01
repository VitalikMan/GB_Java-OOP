package Seminar1.HomeWork;

//1. Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
//2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный
//    метод getProduct (int name, int volume, int temperature) выдающий продукт соответствующий имени, объёму
//    и температуре.
//3. В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат, и воспроизвести логику
//    заложенную в программе.
//4. Всё вышеуказанное создать согласно принципам ООП пройденным на семинаре.

public class Main {

    public static void main(String[] args) {

        HotDrink tea = new HotDrink("tea", 200, 90);
        HotDrink coffee = new HotDrink("coffee", 300, 85);
        HotDrink cocoa = new HotDrink("cocoa", 250, 75);

        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine();

        vendingMachine.addDrink(tea);
        vendingMachine.addDrink(coffee);
        vendingMachine.addDrink(cocoa);

        System.out.println(vendingMachine.getProduct("tea"));
        System.out.println(vendingMachine.getProduct("coffee"));
        System.out.println(vendingMachine.getProduct("cocoa"));
        System.out.println(vendingMachine.getProduct(85));

    }
}
