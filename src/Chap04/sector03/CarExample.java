package Chap04.sector03;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car();
        for(int i=1; i<=5; i++){
            int problemLocaiton = car.run();
            if(problemLocaiton != 0){
                System.out.println(car.tires[problemLocaiton-1].location + "hankookTire로 교체");
                car.tires[problemLocaiton-1] = new HankkokTire(15, car.tires[problemLocaiton-1].location);
            }
            System.out.println("--------------------------------------------------------------");
        }
    }
}
