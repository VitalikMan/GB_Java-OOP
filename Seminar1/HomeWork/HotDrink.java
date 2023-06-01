package Seminar1.HomeWork;

public class HotDrink extends Drink {
    private int temperature;
    public HotDrink(String nameDrink, int volume, int temperature) {
        super(nameDrink, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String toString() {
        return String.format("Напиток: \n%s: \n\t- объём: %s, \n\t- температура: %s", getNameDrink(), getVolume(), getTemperature());
    }
}

