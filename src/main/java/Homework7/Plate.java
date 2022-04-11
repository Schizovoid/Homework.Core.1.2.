package Homework7;

public class Plate {
    public static int food;
    public Plate (int food){
        this.food = food;
    }
    public void decreaseFood(int n){
        food -= n;
    }
    public void getFood(){
        System.out.println("There is " + food + " food in this plate.");
    }
    public void addFood(int x){ //задание 6
        Plate.food += x;
        getFood();
    }
}
