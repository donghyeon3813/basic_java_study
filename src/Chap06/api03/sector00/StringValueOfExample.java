package Chap06.api03.sector00;

import com.sun.corba.se.impl.legacy.connection.USLPort;

public class StringValueOfExample {
    public static void main(String[] args) {
        // String.valueof를 통해 매개변수를 문자열로 변환
        String str1 = String.valueOf(10);
        String str2 = String.valueOf(10.5);
        String str3 = String.valueOf(true);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
