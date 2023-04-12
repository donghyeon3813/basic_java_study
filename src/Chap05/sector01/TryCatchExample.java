package Chap05.sector01;

public class TryCatchExample {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("java.lang.String2");
        }catch (Exception e){
            System.out.println("클래스가 존재하지 않습니다.");
        }
    }
}
