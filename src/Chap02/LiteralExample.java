package Chap02;

public class LiteralExample {
    public static void main(String[] args) {
        int var1 = 10; // 10진수
        System.out.println(var1);
        int var2 = 010; // 0으로 시작하면 8진수로 간주
        System.out.println(var2);
        int var3 = 0x10; // 0x로 시작하면 16진수로 간주
        System.out.println(var3);
        //정수 리터럴은 byte, char, short, int, long과 같이 5개가 있다.

        double var4 = 0.25;
        System.out.println(var4);

        double var5 = 2E5;
        System.out.println(var5);

        char var6 = 'A';
        System.out.println(var6);
        char var7 = '한';
        System.out.println(var7);

        System.out.println("\t"+"들여쓰기");
        System.out.println("대한"+"\n"+"민국");
        System.out.println("이것은"+"\""+"중요"+"\"");
        System.out.println("가격이"+"\\"+"3000");

        char var8 = '\u0041';
        System.out.println(var8);

        String var9 ="자바";
        System.out.println(var9);

        boolean var10 = true;
        System.out.println(var10);
        boolean var11 = false;
        System.out.println(var11);


    }
}
