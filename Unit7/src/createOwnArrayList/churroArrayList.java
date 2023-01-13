package createOwnArrayList;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

public class churroArrayList<T> {
    transient T[] array;

    public churroArrayList() {
        this.array = (T[]) new Object[0];
    }

    public void add(T element) {
        final T[] array = (T[]) new Object[(this.array.length + 1)];
        for (int i = 0; i < this.array.length; i++) {
            array[i] = this.array[i];
        }
        array[this.array.length] = element;
        this.array = array;
    }
    public void add(int index, T element) {
        final T[] array = (T[]) new Object[(this.array.length + 1)];
        for (int i = 0; i < index; i++) {
            array[i] = this.array[i];
        }
        array[index] = element;
        for (int i = index + 1; i < this.array.length + 1; i++) {
            array[i] = this.array[i - 1];
        }
        this.array = array;
    }

    public T remove(int index) {
        final T[] array = (T[]) new Object[(this.array.length - 1)];
        for (int i = 0; i < index; i++) {
            array[i] = this.array[i];
        }
        T elementRemoved = this.array[index];
        for (int i = index + 1; i < this.array.length; i++) {
            array[i - 1] = this.array[i];
        }
        this.array = array;
        return elementRemoved;
    }

    public T set(int index, T newElement) {
        final T oldElement = this.array[index];
        this.array[index] = newElement;
        return oldElement;
    }

    public T get(int index) {
        return array[index];
    }

    public int size() {
        return array.length;
    }
    @Override
    public String toString() {
        return Arrays.deepToString(array);
    }
}
