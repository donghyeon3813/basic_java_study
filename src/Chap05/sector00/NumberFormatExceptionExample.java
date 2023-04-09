package Chap05.sector00;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        String data1 = "100";
        String data2 = "a100";

        int value1 = Integer.parseInt(data1);
        int value2 = Integer.parseInt(data2); // 숫자로 변환할 수 없는 변수를 변환시키려 했기 때문에 Exception 발생

        int result = value1 + value2;
        System.out.println(data1 + "+" + data2 + "=" + result);


    }
}
