package Homework.JavaCore1.Homework7;

public class Cat {
    private String name;
    public int appetite;
    public boolean full; //задание 3.
    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
    }
    public void eat (Plate p, Cat c){
        if(c.appetite > p.food){
            System.out.printf("There is not enough food in the plate for %s! \n", name); //Задание 2 и 4.
            System.out.printf("Is %s full? " + c.full + "\n", name);
        } else {
        p.decreaseFood(appetite);
        c.appetite -= c.appetite;
        c.full = true;
        System.out.printf("Is %s full? " + c.full + "\n", name);
        }
    }
}
