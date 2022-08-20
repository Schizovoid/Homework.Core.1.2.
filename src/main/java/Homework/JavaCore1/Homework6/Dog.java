package Homework.JavaCore1.Homework6;

public class Dog extends Animal {
    private static int dogCount;
    private static final int dogMaxSwim = 10;
    private static final int dogMaxRun = 500;

    public Dog(String name){
        super(name, dogMaxRun, dogMaxSwim);
        dogCount++;
    }
    public static int getDogCount(){return dogCount;}
}
