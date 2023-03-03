package Chap03.sector03;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setSpeed(-50);
        System.out.println("현재 속도:" + myCar.getSpeed());
        // 올바른 속도 변경
        myCar.setSpeed(60);
        if(!myCar.isStop()){
            myCar.setStop(false);
        }
        System.out.println("현재 속도" + myCar.getSpeed());
    }



}
