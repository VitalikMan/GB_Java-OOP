package Seminar6.HomeWork;

import Seminar6.HomeWork.Task1.Rectangle;
import Seminar6.HomeWork.Task1.Square;
import Seminar6.HomeWork.Task3.Greeter;
import Seminar6.HomeWork.Task3.greet;

//Найти и исправить проблемные участки в закрепленном коде
public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        // Task 1:
        Square square = new Square();
        square.setSide(7);
        System.out.println("Сторона квадрата: " + square.getSide());

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(9);
        rectangle.setWidth(5);
        System.out.println("Стороны прямоугольника: " + rectangle.getHeight() + " и " + rectangle.getWidth());

        // Task 3:
        Greeter greeter = new Greeter();
        greeter.setFormality("Hi"); // return "Hello."
//        greeter.setFormality("formal"); // return "Good evening, sir."
//        greeter.setFormality("casual"); // return "Sup bro?"
//        greeter.setFormality("intimate"); // return "Hello Darling!"

        greet greeting = new greet(greeter);
        String message = greeting.greet();
        System.out.println(message);
    }
}