package Generics;

public class Generic {
    public <T> T returnElement(T element) {
        return element;
    }

    public <T> T thirdIndice(T[] array) {
        return array[2];
    }
}
