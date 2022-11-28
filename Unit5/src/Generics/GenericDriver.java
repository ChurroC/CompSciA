package Generics;

public class GenericDriver {
    public static void main(String[] args) {
        Generic generic = new Generic();
        System.out.println(generic.returnElement("Hello"));
        System.out.println(generic.returnElement(5));
        System.out.println(generic.returnElement(5.5));
        System.out.println(generic.thirdIndice(new String[]{"Hello", "World", "!"}));
        System.out.println(generic.thirdIndice(new Integer[]{1, 2, 3}));
    }
}