package Chap06.api03.sector00;

public class StringIndexOfExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        int location = subject.indexOf("프로그래밍");
        System.out.println(location);
        //index of를 통해 문자열의 위치, 값의 존재 여부를 확인할 수 있다.
        if(subject.indexOf("자바")!= -1){
            System.out.println("자바와 관련된 책이군요");
        }else {
            System.out.println("자바와 관련없는 책이군요");
        }
    }
}
