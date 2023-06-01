package Seminar2.Task2;

import Seminar2.Task1.Actor;

public interface QueueBehaviour {
    void takeInQueue(Actor actor); // очередь
    void takeOrders();
    void giveOrders();
    void releaseFromQueue();
}
