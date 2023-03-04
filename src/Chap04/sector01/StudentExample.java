package Chap04.sector01;

public class StudentExample {
    public static void main(String[] args) {
        Student student = new Student("홍길동","12312313",1);
        // 부모에서 받은 필드
        System.out.println("student.name = " + student.name);
        System.out.println("student.ssn = " + student.ssn);
        // 자식 필드
        System.out.println("student.studentNo = " + student.studentNo);
    }
}
