package Chap06.api02.sector00;


public class SystemEnvExample {
    public static void main(String[] args) {
        // 환경변수를 getenv를 통해 가져올 수 있음
        String javahome = System.getenv("JAVA_HOME");
        System.out.println("JAVA_HOME:" + javahome);
    }
}
