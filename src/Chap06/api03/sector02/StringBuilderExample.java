package Chap06.api03.sector02;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        //문자열 끝에 추가
        sb.append("Java");
        sb.append("Program Study");
        System.out.println(sb.toString());
        //index 4 위치 뒤에 2 삽입
        sb.insert(4,"2");
        System.out.println(sb.toString());
        //index 4 위치의 문자를 6으로 변경
        sb.setCharAt(4,'6');
        System.out.println(sb.toString());
        //index 6부터 index13 전까지를 book으로 대체
        sb.replace(4, 13,"Book");
        System.out.println(sb.toString());
        //index4부터 index5 전까지 삭제
        sb.delete(4, 5);
        System.out.println(sb.toString());
        // 총 문자수
        int length = sb.length();
        System.out.println("총문자수" + length);
        // 버퍼에 있는것을 String type으로 변경
        String result = sb.toString();
        System.out.println(result);
    }
}
