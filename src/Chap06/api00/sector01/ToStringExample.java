package Chap06.api00.sector01;

import java.util.Date;

public class ToStringExample {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Date obj2 = new Date();
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());// Date는 toString을 재정의하여 날짜를 출력하도록 되어있음
    }
}
