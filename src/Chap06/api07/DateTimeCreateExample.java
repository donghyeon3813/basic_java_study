package Chap06.api07;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTimeCreateExample {
    public static void main(String[] args) throws InterruptedException{
        //날짜 얻기
        LocalDate currDate = LocalDate.now();
        System.out.println("현재 날짜:" + currDate);

        LocalDate targetDate = LocalDate.of(2024, 5, 10);
        System.out.println("목표 날짜" + targetDate + "\n");

        //시간얻기
        LocalTime currtime = LocalTime.now();
        System.out.println("현재 시간:" + currtime);

        LocalTime targetTime = LocalTime.of(6, 30, 0, 0);
        System.out.println("목표 시간" + targetTime + "\n");

        //날짜와 시간 얻기
        LocalDateTime currDatetime = LocalDateTime.now();
        System.out.println("현재 날짜와 시간:" + currDatetime);

        LocalDateTime targetDateTime = LocalDateTime.of(2024,5,10,6,30,0,0);
        System.out.println("목표 날짜와 시간" + targetDateTime + "\n");

        // 협정 시계시와 시간존(TimeZone)
        ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println("협정 세계시:"+ utcDateTime);
        ZonedDateTime newyourkDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("뉴욕 시간존:"+newyourkDateTime+ "\n");

        //특정 시점의 타임스탬프 얻기
        Instant instant1 = Instant.now();
        Thread.sleep(10);;
        Instant instant2 = Instant.now();
        if(instant1.isBefore(instant2)){
            System.out.println("instant1이 빠릅니다");
        }else if(instant1.isAfter(instant2)){
            System.out.println("instant1이 늦ㅅ습니다.");
        }else {
            System.out.println("동일한 시간입니다.");
        }
        System.out.println("차이(nanos):" + instant1.until(instant2, ChronoUnit.NANOS));
    }
}
