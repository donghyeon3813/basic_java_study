package Chap03;

public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCalC = new Calculator();
        myCalC.powerOn(); // 객체.을 통해 메소들 호출가능

        int result1 = myCalC.plus(5,6);
        System.out.println("result1:"+result1);

        byte x = 10;
        byte y = 4;
        double result2 = myCalC.divide(x, y);
        System.out.println("result2: "+ result2);
        myCalC.powerOff();
    }
}
