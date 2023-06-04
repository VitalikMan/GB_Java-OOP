package Seminar2.HomeWork2;

public class Actor {

    private final String name;
    private int age;
    private long id;
    private String gender;

    private boolean isMakeOrder;
    private boolean isTakeOrder;

    public Actor(String name, int age, long id, String gender) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.gender = gender;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    public void setMakeOrder(boolean makeOrder) {
        isMakeOrder = makeOrder;
    }

    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    public void setTakeOrder(boolean takeOrder) {
        isTakeOrder = takeOrder;
    }
    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s", getName(), getAge(), getId(), getGender());
    }
}
