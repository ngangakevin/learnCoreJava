package dataTypes;

import java.util.Arrays;

public class MyArrayList {
    private int size;
    private Object[] elements;

    public MyArrayList(){
        elements = new Object[10];
        size = 0;
    }

    public void add(Object ob) {
        if (size >= elements.length){
            Object[] newElement = new Object[size + 10];
            for(int i = 0; size < size; i++){newElement[i] = elements[i];}
            elements = newElement;
        }
        elements[size] = ob;
        ++size;
    }

    public Object get(int index){
        if(index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return elements[index];
    }
    public int size(){
        return this.size;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(elements, 0, size));
    }
}
