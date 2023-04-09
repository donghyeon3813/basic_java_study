package Chap05.sector00;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String data = null;
        System.out.println(data.toString());// 객체가 존재하지 않을 때 사용하려고 하여 Null pointer Exception 발생
    }
}
