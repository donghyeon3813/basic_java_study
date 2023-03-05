package Chap04.sector03;

public class Car {
    Tire frontLeftTire = new Tire(6,"앞왼쪽");
    Tire fromtRightTire = new Tire(2,"앞오른");
    Tire backLeftTire = new Tire(3,"뒤왼쪽");
    Tire backRightTire = new Tire(4,"뒤오른쪽");

    int run(){
        System.out.println("자동차가 달립니다.");
        if(frontLeftTire.roll()==false) {
            stop(); return 1;
        }
        if(fromtRightTire.roll()==false) {
            stop(); return 2;
        }
        if(backLeftTire.roll()==false) {
            stop(); return 3;
        }
        if(backRightTire.roll()==false) {
            stop(); return 4;
        }
        return 0;

    }

    private void stop() {
        System.out.println("자동차가 멈춥니다.");
    }
}
