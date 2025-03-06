package practice;

import org.jetbrains.annotations.NotNull;

public class DummyWrapper<T> implements Comparable<T> {
    public static void main(String[] args) {
    }

    @Override
    public int compareTo(@NotNull T o) {
        return 0;
    }
}