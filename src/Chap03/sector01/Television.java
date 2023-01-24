package Chap03.sector01;

public class Television {
    static String company = "Samsung";
    static String model = "LCD";
    static String info;

    static { // 정적 블록 사용
        info = company + "-" + model;
    }
}
