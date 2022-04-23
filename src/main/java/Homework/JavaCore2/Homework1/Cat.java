package Homework.JavaCore2.Homework1;

public class Cat implements Moving {
    private final int MAX_RUN_DISTANCE = 20;
    private final int MAX_JUMPING_HEIGHT = 1;
    public String name;

    public Cat(String name) {
        this.name = name;
    }
    @Override
    public boolean run(int length) {
        return length <= MAX_RUN_DISTANCE;
    }
    @Override
    public boolean jump(int height) {
        return height <= MAX_JUMPING_HEIGHT;
    }
    @Override
    public String getName(){
        return this.name;
    };
}
