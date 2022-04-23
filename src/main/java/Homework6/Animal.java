package Homework6;

public class Animal {
    public String name;
    private static int animalCount;
    private int animalMaxSwim;
    private int animalMaxRun;

    private Animal() {
        animalCount++;
    }

    public Animal(String name, int maxRun, int maxSwim) {
        this();
        this.name = name;
        this.animalMaxRun = maxRun;
        this.animalMaxSwim = maxSwim;
    }

    public void swim(int swimLength) {
        if (swimLength <= animalMaxSwim) {
            System.out.printf("%s + swims for " + swimLength + " metres \n", name);
        } else {
            System.out.printf("%s + could not swim for " + swimLength + " metres\n", name);
        }
    }

    public void run(int runLength) {
        if (runLength <= animalMaxRun) {
            System.out.printf("%s + runs for " + runLength + " metres\n", name);
        } else {
            System.out.printf("%s + could not run for " + runLength + " metres\n", name);
        }
    }
}
