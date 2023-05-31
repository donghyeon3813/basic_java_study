package Chap06.api03.sector00;

public class StringLengthExmaple {
    public static void main(String[] args) {
        String ssn = "7306241230123";
        int length = ssn.length();// length를 통해 문자열의 길이를 확인할 수 있다.
        if(length == 13){
            System.out.println("주민번호 자리수가 맞습니다.");
        }else {
            System.out.println("주민번호 자리수가 틀립니다.");
        }
    }
}
