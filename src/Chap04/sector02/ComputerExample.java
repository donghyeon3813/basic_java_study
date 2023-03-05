package Chap04.sector02;

public class ComputerExample {
    public static void main(String[] args) {
        int r = 10;

        Calculator calculator = new Calculator();
        System.out.println("원면적 : "+ calculator.areaCircle(r));

        Computer computer = new Computer();// areacCircle을 재정의한 값이 출력
        System.out.println("원면적 : "+ computer.areaCircle(r));

    }
}
