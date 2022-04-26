package Homework.JavaCore2.Homework1;


public class Human implements Moving {
    private final int MAX_RUN_DISTANCE = 100;
    private final int MAX_JUMPING_HEIGHT = 2;
    private String name;
    public Human (String name){
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
