package createOwnArrayList;

import java.lang.reflect.Array;

public class churroArrayList<T> {
    transient T[] array;

    public churroArrayList() {
        this.array = (T[]) new Object[0];
    }

    public void add(T obj) {
        final T[] array = (T[]) new Object[(this.array.length + 1)];
        for (int i = 0; i < this.array.length; i++) {
            array[i] = this.array[i];
        }
        array[this.array.length] = obj;
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }
}
