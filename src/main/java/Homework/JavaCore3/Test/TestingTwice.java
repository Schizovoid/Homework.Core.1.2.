package Homework.JavaCore3.Test;

public class TestingTwice <T,V> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    private V v;

    public TestingTwice (T t, V v){
        this.t = t;
        this.v = v;
    }
    public void showTypes () {
        System.out.println("T: " + t.getClass().getName());
        System.out.println("V: " + v.getClass().getName());
    }
}
