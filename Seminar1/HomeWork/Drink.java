package Seminar1.HomeWork;

public abstract class Drink {
    private String nameDrink;
    private int volume;

    public Drink(String nameDrink, int volume) {
        this.nameDrink = nameDrink;
        this.volume = volume;
    }

    public String getNameDrink() {
        return nameDrink;
    }

    public void setNameDrink(String nameDrink) {
        this.nameDrink = nameDrink;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

}
