package Seminar2.HomeWork2;

//Реализовать класс Market и все методы, которые он обязан реализовывать.
//Методы из интерфейса QueueBehaviour, имитируют работу очереди,
//MarketBehaviour – помещает и удаляет человека из очереди,
//метод update – обновляет состояние магазина (принимает и отдаёт заказы)

public class Main {

    public static void main(String[] args) {

        Actor Fedor = new Actor("Fedor", 32, 1L, "М");
        Actor Andrey = new Actor("Andrey", 33, 2L, "Ж");
        Actor Vitaliy = new Actor("Vitaliy", 17, 3L, "Ж");

        Market market = new Market();
        System.out.println("-----------------------------------------");
        market.acceptToMarket(Fedor);
        market.acceptToMarket(Andrey);
        market.acceptToMarket(Vitaliy);
        System.out.println("-----------------------------------------");
        market.takeInQueue(Fedor);
//        market.takeInQueue(Andrey);
//        market.takeInQueue(Vitaliy);
        System.out.println("-----------------------------------------");
        market.takeOrders();
        System.out.println("-----------------------------------------");
        market.giveOrders();
        System.out.println("-----------------------------------------");
        market.releaseFromQueue();
        System.out.println("-----------------------------------------");
    }
}
