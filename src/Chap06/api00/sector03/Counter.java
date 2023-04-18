package Chap06.api00.sector03;

public class Counter {
    private int no;

    public Counter(int no) {
        this.no = no;
    }

    // 객체가 소멸되기 직전의 실행되는 method
    @Override
    protected void finalize() throws Throwable {
        System.out.println(no + "번 객체의 finalize()가 실행됨");
    }
}
