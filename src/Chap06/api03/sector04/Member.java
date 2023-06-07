package Chap06.api03.sector04;

public class Member implements Comparable<Member>{
    String name;

    public Member(String name) {
        this.name = name;
    }

    //member의 name을 sort하기 위해서 사용
    @Override
    public int compareTo(Member o) {
        return name.compareTo(o.name);
    }

}
