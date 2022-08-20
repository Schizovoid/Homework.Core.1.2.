package Homework.JavaCore3.Test;

public class Stats <T extends Number> {
    private T[] nums;
    public Stats(T... ts) {
        this.nums = ts;
    }

    public double getAverage () {
        double sum = 0.0;
        for (int i = 0; i < nums.length ; i++) {
            sum += nums[i].doubleValue();
        }
        return sum / nums.length;
    }
    public boolean sameAvg(Stats<?> another) {
        return Math.abs(this.getAverage() - another.getAverage()) < 0.0001;
    }

}
