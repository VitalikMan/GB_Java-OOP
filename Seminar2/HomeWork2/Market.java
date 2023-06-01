package Seminar2.HomeWork2;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour {

    private List<Actor> queue;


    /**Пришел в магазин*/
    @Override
    public void acceptToMarket(Actor actor){
        System.out.println(actor.getName() + " пришел в магазин");
        takeInQueue(actor);
    }

    /**Встал в очередь*/
    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " встал в очередь");
        this.queue.add(actor);
    }

    /**Сделал свой заказ*/
    @Override
    public void takeOrders(){
        for (Actor actor: queue) {
            if(!actor.isMakeOrder()){
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " сделал свой заказ");
            }
        }
    }

    /**Получил свой заказ*/
    @Override
    public void giveOrders() {
        for (Actor actor: queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.getName() + " получил свой заказ");
            }
        }
    }

    /**Вышел из очереди и готов уходить*/
    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (Actor actor: queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor);
                System.out.println(actor.getName() + " вышел из очереди и готов уходить");
            }
        }
        releaseFromMarket(releaseActors);
    }

    /**Вышел из магазина*/
    @Override
    public void releaseFromMarket(List<Actor> actorList) {
        for (Actor actor : actorList) {
            System.out.println(actor.getName() + " вышел из магазина");
            queue.remove(actor);
        }
    }

    /**Обновление состояния магазина*/
    @Override
    public void update() {
        takeOrders();
        giveOrders();
        releaseFromQueue();
    }




}

