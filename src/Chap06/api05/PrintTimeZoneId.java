package Chap06.api05;

import java.util.TimeZone;

public class PrintTimeZoneId {
    public static void main(String[] args) {
        String[] availableIDs = TimeZone.getAvailableIDs(); // 사용가능한 시간대 문자열 출력
        for(String id : availableIDs) {
            System.out.println(id);
        }
    }
}
