package Homework.JavaCore2.Homework1;

public class Wall implements Obstacle{
    private int height;

    public Wall(int height){
        this.height = height;
    }
    @Override
    public boolean Overcome (Moving moving) {
        if (moving.jump(this.height)) {
            System.out.printf("%s jumps for " + height + " meters!\n", moving.getName());
            return true;
        } else {
            System.out.printf("%s could not jump for " + height + " meters and gives up!\n", moving.getName());
            return false;
        }
    }
}
