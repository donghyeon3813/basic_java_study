package Chap05.sector00;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {

        String data1 = args[0];
        String data2 = args[1];
        // 배열에서 index의 범위를 초과할 경우 ArrayIndexOutOfNoundException 발생
        // args를 실행 옵션으로 설정할 수 있음
        // 또한 if문을 활용하여 args의 길이를 체크하면 좋음
        System.out.println("args[0]" + data1);
        System.out.println("args[1]" + data2);

    }
}
