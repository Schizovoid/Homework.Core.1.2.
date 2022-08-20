package Homework.JavaCore3.Test;

public class App {
    public static void main(String[] args) {
        Testing <String> testString = new Testing<>("ehy");
        testString.getType();
        Testing<Integer> testInteger = new Testing<>(12);
        testInteger.getType();
        System.out.println(testInteger.getT());

        TestingTwice <String, Integer> twice = new TestingTwice<>("Hey", 123);
        twice.showTypes();

        Integer[] numbers = new Integer[] {1,2,3,4,5};
        Stats <Integer> integerStats = new Stats<>(numbers);
        Stats <Double> doubleStats = new Stats<>(1.0, 2.0, 3.0, 4.0, 5.0);
        System.out.println(integerStats.getAverage());
    }
}
