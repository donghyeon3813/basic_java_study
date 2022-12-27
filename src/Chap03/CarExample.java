package Chap03;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car("검정", 3000); // 생성자 정의 시 디폴트 생성자 사용 불가

        System.out.println("제작회사:"+myCar.company);
        System.out.println("모델명:"+myCar.model);
        System.out.println("색깔:"+myCar.color);
        System.out.println("최고속도:"+myCar.maxSpeed);
        System.out.println("현재속도:"+myCar.speed);

        myCar.speed = 60;
        System.out.println("수정된 속도:"+ myCar.speed);

        Car car1 = new Car();
        System.out.println("car1.company :" + car1.company);
        System.out.println("");

        Car car2 = new Car("자가용");
        System.out.println("car2.company :" + car2.company);
        System.out.println("car2.model : " + car2.model);

        Car car3 = new Car("자가용","빨강");
        System.out.println("car3.company :" + car3.company);
        System.out.println("car3.model : " + car3.model);
        System.out.println("car3.color : " + car3.color);


        Car car4 = new Car("자가용","빨강", 200);
        System.out.printf("car4.company :" + car4.company);
        System.out.printf("car4.model : " + car4.model);
        System.out.printf("car4.color : " + car4.color);
        System.out.printf("car4.maxSpeed : " + car4.maxSpeed);
        

    }
}
