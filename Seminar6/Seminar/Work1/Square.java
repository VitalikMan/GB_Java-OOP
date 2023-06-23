package Seminar6.Seminar.Work1;

// Квадрат
public class Square extends Rectangle {

    public void setHeight(int height) {
        this.height = height;
        this.width = height;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
        this.height = width;
    }
}