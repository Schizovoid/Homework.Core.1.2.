package Homework.JavaCore2.Homework1;

public class Marathon {
    public static void main(String[] args) {
        Moving[] runners = {new Cat("Barsik"), new Human("Ivan"), new Bot("X-01")};
        Obstacle[] obstacles = {new Treadmill(100), new Wall(5), new Treadmill(1001)};
        for (Moving m : runners) {
            for (Obstacle o : obstacles) {
                if (!o.Overcome(m)) break;

            }
        }
    }
}
