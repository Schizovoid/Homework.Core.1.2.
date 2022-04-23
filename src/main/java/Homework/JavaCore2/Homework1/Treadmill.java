package Homework.JavaCore2.Homework1;

public class Treadmill implements Obstacle {
    private int length;

    public Treadmill(int length){
        this.length = length;
    }
        @Override
    public boolean Overcome (Moving moving) {
        if (moving.run(this.length)) {
            System.out.printf("%s runs for " + length + " meters!\n", moving.getName());
            return true;
        } else {
            System.out.printf("%s could not run for " + length + " meters and gives up!\n", moving.getName());
            return false;
        }
    }
}
