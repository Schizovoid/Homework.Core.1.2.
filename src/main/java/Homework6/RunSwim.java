package Homework6;

public class RunSwim {

    public static void main(String[] args) {
    Dog dog = new Dog("Rex");
    Cat cat = new Cat("Barsik");

    dog.run(500);
    cat.run(200);
    dog.swim(10);
    cat.swim(10);
        dog.run(1000);
        cat.run(500);
        dog.swim(20);
    }
}
