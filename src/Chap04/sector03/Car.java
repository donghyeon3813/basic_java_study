package Chap04.sector03;

public class Car {

    Tire[] tires = { // 배열로 관리
            new Tire(6,"앞왼쪽"),
            new Tire(2,"앞오른"),
            new Tire(3,"뒤왼쪽"),
            new Tire(4,"뒤오른쪽")
    };

    int run(){
        System.out.println("자동차가 달립니다.");
        for(int i =0; i<tires.length; i++){
            if(tires[i].roll()==false) {
                stop();
                return i+1;
            }
        }
        return 0;

    }

    private void stop() {
        System.out.println("자동차가 멈춥니다.");
    }
}
