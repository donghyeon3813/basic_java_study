package Chap06.api00.sector02;

public class Member implements  Cloneable{
    public String id;
    public String name;
    public String password;
    public int age;
    public boolean adult;
    public int[] score;

    public Member(String id, String name, String password, int age, boolean adult, int[] score) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.age = age;
        this.adult = adult;
        this.score = score;
    }

    public Member getMember() {
        Member cloned = null;
        try {
            cloned = (Member) clone();
        }catch (CloneNotSupportedException e){

        }
        return cloned;
    }
}
