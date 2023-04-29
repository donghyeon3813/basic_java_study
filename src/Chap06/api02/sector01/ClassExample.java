package Chap06.api02.sector01;

import Chap06.api00.sector02.Car;

public class ClassExample {
    public static void main(String[] args) {
        Car car = new Car();
        Class class1 = car.getClass();
        System.out.println(class1.getName());
        System.out.println(class1.getSimpleName());
        System.out.println(class1.getPackage().getName());
        System.out.println();

        try {
            Class class2 = Class.forName("Chap06.api00.sector02.Car");
            System.out.println(class2.getName());
            System.out.println(class2.getSimpleName());
            System.out.println(class2.getPackage().getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

