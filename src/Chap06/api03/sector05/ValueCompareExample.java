package Chap06.api03.sector05;

public class ValueCompareExample {
    public static void main(String[] args) {
        System.out.println("[-128~127 초과값일 경우]");
        Integer obj1 = 300;
        Integer obj2 = 300;
        System.out.println("== 결과: " + (obj1 == obj2));
        System.out.println("언박싱후 == 결과: "+ (obj1.intValue() == obj2.intValue()));
        System.out.println("equals 결과: "+obj1.equals(obj2));
        System.out.println();
        // wrapper 클래스의 값 비교는 범위 안에 값일 경우 == !=으로도 비교가 가능하다 값의 범위를 모른다면 equals를 사용하는 것이 좋다.
        System.out.println("[-128~127 범위값일 경우]");
        Integer obj3 = 10;
        Integer obj4 = 10;
        System.out.println("== 결과: " + (obj3 == obj4));
        System.out.println("언박싱후 == 결과: "+ (obj3.intValue() == obj4.intValue()));
        System.out.println("equals 결과: "+obj3.equals(obj4));
    }
}
