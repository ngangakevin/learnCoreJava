package practice;

import java.lang.reflect.Array;

public class LearnConstructors <T>{
    private T[] test = (T[]) new Object[2];
    public LearnConstructors(Class<T> test, int size){
        this.test = (T[]) Array.newInstance(test, size);
    }

    public T[] getTest() {
        return test;
    }

    public void setTest(T[] test) {
        this.test = test;
    }
}
