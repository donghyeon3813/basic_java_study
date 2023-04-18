package Chap06.api00.sector02;

public class MemberExample {
    public static void main(String[] args) {
        Member original = new Member("blue", "홍길동", "123456", 25, true, new int[] {90, 100});

        //복제 객체를 얻은 후에 패스워드 변경
        Member cloned = original.getMember();
        cloned.password = "67890";
        cloned.score[0] = 100;

        System.out.println("[복제 객체의 필드값]");
        System.out.println("id: " + cloned.id);
        System.out.println("name: " + cloned.name);
        System.out.println("password: " + cloned.password);
        System.out.println("age: " + cloned.age);
        System.out.println("adult: " + cloned.adult);
        for(int i=0; i<cloned.score.length; i++){
            System.out.print(cloned.score[i]);
            System.out.print((i==(cloned.score.length-1))?"":",");
        }

        System.out.println();

        System.out.println("[원본 객체의 필드값]");
        System.out.println("id: " + original.id);
        System.out.println("name: " + original.name);
        System.out.println("password: " + original.password);
        System.out.println("age: " + original.age);
        System.out.println("adult: " + original.adult);
        for(int i=0; i<cloned.score.length; i++){
            System.out.print(cloned.score[i]);
            System.out.print((i==(cloned.score.length-1))?"":",");
        }

    }
}
