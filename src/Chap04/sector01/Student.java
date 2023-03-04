package Chap04.sector01;

public class Student extends People{
    public int studentNo;

    public Student(String name, String ssn, int studentNo) {
        super(name, ssn);// 부모 생성자 호출 자식 객체가 만들어질 때 부모가 먼저 만들어져야한다.
        this.studentNo = studentNo;
    }
}
