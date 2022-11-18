package Generics;

public class GenericDriver {
    public static void main(String[] args) {
        Generic generic = new Generic();
        System.out.println(generic.secondIndice("Hello"));
        System.out.println(generic.secondIndice(5));
        System.out.println(generic.secondIndice(5.5));
    }
}