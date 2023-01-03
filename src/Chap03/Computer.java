package Chap03;

public class Computer {
    int sum1(int[] values) { // 매개변수를 배열로 선언함으로 여러개의 매개변수 대응 가능
        int sum = 0;
        for(int i=0; i<values.length; i++) {
            sum += values[i];
        }
        return sum; // return 문으로 메소드 강제 종료가 가능하다.
    }

    int sum2(int ... values){ // ...으로 선언된 매개변수 = 배열타입
        int sum = 0;
        for(int i=0; i<values.length; i++) {
            sum += values[i];
        }
        return sum;
    }
}
