package Seminar1;

//Задание 1:
//        Реализуйте класс Товар, содержащий данные о товаре
//        и ТорговыйАвтомат, содержащий в себе методы initProducts (List <Product>)
//        сохраняющий в себе список исходных продуктов и getProduct(String name)

//Задания 2:
//        Сделать класс Товар абстрактным, создать нескольких наследников (к примеру: БутылкаВоды),
//        сделать интерфейсом ТорговыйАвтомат и реализовать класс какого-то одного типа ТорговогоАвтомата
//        (пример: ПродающийБутылкиВодыАвтомат

//Задание 3:
//        1. Попросить вначале переопределить метод toString для Товара,
//        запустить программу, после этого переопределить для наследника
//        этот метод, после запуска обратить внимание на изменение поведения.
//        2. Попросить создать перегруженный метод выдачи товара
//        ТорговымАвтоматом дополнив дополнительным параметром
//        (пример: getProduct(String name) выдающий товар по имени,
//        создать метод возвращающий товар по имени и какому-либо параметру
//        товара getProduct(String name, int volume))


public class Main {

    public static void main(String[] args) {

        Vending vending = new FruitVending();

        Product product1 = new Apple("Apple", 20, 1L);
        Product product2 = new Orange("Orange", 30, 2L);
        Product product3 = new Banana("Banana", 25, 3L);

        vending.addProduct(product1);
        vending.addProduct(product2);
        vending.addProduct(product3);

        System.out.println(vending.getProduct("Apple"));
        System.out.println(vending.getProduct("Orange"));
        System.out.println(vending.getProduct("Banana"));
        System.out.println("-----------------------------");
        System.out.println(vending.getProduct(1L));
        System.out.println(vending.getProduct(2L));
        System.out.println(vending.getProduct(3L));



    }


}
