package Seminar2.HomeWork2;

import java.util.List;

public interface MarketBehaviour { // интерфейс с методами, которые помещают и удаляют человека из очереди

    void acceptToMarket(Actor actor);

    void releaseFromMarket(List<Actor> actorList);
    void update();

}


