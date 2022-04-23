package Homework6;

public class Cat extends Animal {
    private static int catCount;
    private static final int catMaxSwim = 0;
    private static final int catMaxRun = 200;

    public Cat(String name){
        super(name,catMaxRun,catMaxSwim);
        catCount++;
    }

    public String getName(){
        return name;
    }

    @Override
    public void swim(int swimLength){
        System.out.println(getName() + " refuses to swim!");
    }

    public static int getCatCount(){return catCount;}
}
