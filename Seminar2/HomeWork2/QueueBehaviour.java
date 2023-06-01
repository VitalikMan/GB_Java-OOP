package Seminar2.HomeWork2;

import java.util.List;

public interface QueueBehaviour { // интерфейс с методами, которые имитируют работу очереди

    void releaseFromQueue();
    void takeInQueue(Actor actor);
    void takeOrders();
    void giveOrders();

}
