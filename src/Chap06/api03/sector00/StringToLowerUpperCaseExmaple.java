package Chap06.api03.sector00;

import java.util.Locale;

public class StringToLowerUpperCaseExmaple {
    public static void main(String[] args) {
        String str1 = "Java Programming";
        String str2 = "JAVA Programming";

        System.out.println(str1.equals(str2));

        String lowerStr1 = str1.toLowerCase();
        String lowerStr2 = str1.toLowerCase();
        System.out.println(lowerStr1.equals(lowerStr2));

        //equalsIgnoreCase 문자열의 대소문자를 무시하고 비교한다.
        System.out.println(str1.equalsIgnoreCase(str2));

    }
}
