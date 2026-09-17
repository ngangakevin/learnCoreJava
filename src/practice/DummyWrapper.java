package practice;

public class DummyWrapper<T> implements Comparable<T> {
    public static void main(String[] args) {
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }
}