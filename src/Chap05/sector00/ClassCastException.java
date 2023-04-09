package Chap05.sector00;

public class ClassCastException {
    public static void main(String[] args) {
        Dog dog = new Dog();
        ChangeDog(dog);

        Cat cat = new Cat();
        ChangeDog(cat);
    }
    public static void ChangeDog(Animal animal) {
        if(animal instanceof Dog) {
            Dog dog = (Dog) animal; //cat을 dog로 형변환 하려 했기때문에 instanceof가 없으면 ClassCastException 발생 가능
        }

    }


}
    class Animal {}
    class Dog extends Animal {}
    class Cat extends Animal {}


