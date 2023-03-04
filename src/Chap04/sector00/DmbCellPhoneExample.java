package Chap04.sector00;

public class DmbCellPhoneExample {
    public static void main(String[] args) {
        DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰","검정",10);
        // 상속받은 필드
        System.out.println("모델 = " + dmbCellPhone.model);
        System.out.println("색상 = " + dmbCellPhone.color);

        // 자식의 필드
        System.out.println("채널 = " + dmbCellPhone.channel);

        // 상속받은 메서드
        dmbCellPhone.powerOn();
        // 자식의 메서드
        dmbCellPhone.turnOnDmb();
    }
}
