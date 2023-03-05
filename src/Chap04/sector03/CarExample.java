package Chap04.sector03;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();
        for(int i=1; i<=5; i++){
            int problemLocaiton = car.run();

            switch (problemLocaiton) {
                case 1:
                    System.out.println("앞왼쪽 hankookTire 교체");
                    car.frontLeftTire = new HankkokTire(15, "앞왼쪽");
                    break;
                case 2:
                    System.out.println("앞오른쪽 kumhoTire 교체");
                    car.fromtRightTire = new HankkokTire(13, "앞오른쪽");
                    break;
                case 3:
                    System.out.println("뒤왼쪽 hankookTire 교체");
                    car.backLeftTire = new HankkokTire(17, "뒤왼쪽");
                    break;
                case 4:
                    System.out.println("뒤오른쪽 kumhoTire 교체");
                    car.backRightTire = new HankkokTire(14, "뒤오른쪽");
                    break;
            }
            System.out.println("--------------------------------------------------------------");
        }
    }
}
