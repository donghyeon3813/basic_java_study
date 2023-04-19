package Chap06.api01.sector00;

import java.util.Objects;

public class ToStringExample {
    public static void main(String[] args) {
        String s1 = "홍길동";
        String s2 = null;
        System.out.println(Objects.toString(s1));
        System.out.println(Objects.toString(s2));
        System.out.println(Objects.toString(s2, "이름이 없습니다."));
    }
}
