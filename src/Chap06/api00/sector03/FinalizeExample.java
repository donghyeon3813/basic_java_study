package Chap06.api00.sector03;

public class FinalizeExample {
    public static void main(String[] args) {
        Counter counter = null;
        for(int i=1; i<50; i++){
            counter = new Counter(i);

            counter = null;// Counter 객체를 쓰레기로 만듦
            System.gc();//gc 실행요청
        }
    }
}
