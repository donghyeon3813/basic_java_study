package Chap03;

public class Car {
    String company = "현대자도차";
    String model = "그랜저";
    String color = "검정";
    int maxSpeed = 350;
    int speed;
    Car(String color, int cc) {
        this.color = color; // 생성자를 통한 필드값 초기화
    }
    // 생성자 오버로딩
    public Car(){

    }

    public Car(String model) {
        this.model = model;
    }

    public Car(String model, String color) {
        this(model, color, 250);
    }

    public Car(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
