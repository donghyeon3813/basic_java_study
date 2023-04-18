package Chap06.api00.sector01;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("구글", "안드로이드");

        String strObj = myPhone.toString();
        System.out.println(strObj);

        System.out.println(myPhone); // toString 이 정의되어 있어 자동으로 toString을 호출한다.
    }
}
