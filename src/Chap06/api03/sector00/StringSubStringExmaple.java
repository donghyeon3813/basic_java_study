package Chap06.api03.sector00;

public class StringSubStringExmaple {
    public static void main(String[] args) {
        String ssn = "880815-1234567";
        //0~6까지를 제외한 문자열을 출력
        String firstNum = ssn.substring(0,6);
        System.out.println(firstNum);
        //7번째의 문자열 부터 출력
        String secondNum = ssn.substring(7);
        System.out.println(secondNum);
    }
}
