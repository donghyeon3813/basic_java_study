package Chap06.api02.sector01;

public class NewInstanceExample {
    public static void main(String[] args) {
        try { // 동적 객체 생성
//            Class clazz = Class.forName("Chap06.api02.sector01.SendAction");
            Class clazz = Class.forName("Chap06.api02.sector01.ReceiveAction");
            Action action = (Action) clazz.newInstance();
            action.excecute();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (InstantiationException e){
            e.printStackTrace();
        } catch (IllegalAccessException e){
            e.printStackTrace();
        }
    }
}
