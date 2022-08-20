package Homework.JavaCore3.Test;

public class Testing <T> {
    private T t;
    public Testing (T obj) {
        this.t = obj;
    }
    public T getT () {
        return t;
    }
    public void getType () {
        System.out.println(t.getClass().getName());
    }

}
