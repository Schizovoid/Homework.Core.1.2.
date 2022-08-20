package Homework.JavaCore1.Homework7;

public class CatsEat {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", 90);
        Plate plate = new Plate(100);
        plate.getFood();
        cat1.eat(plate, cat1);
        plate.getFood();
        plate.addFood(150);
        Cat[] cats = {
                new Cat("Murzik", 40),
                new Cat("Vasya", 100),
                new Cat("Persik", 50)
        };
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate,cats[i]);
        }

    }
}
