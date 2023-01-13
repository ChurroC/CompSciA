package createOwnArrayList;


public class churroArrayListDriver {
  public static void main(String[] args) {
     churroArrayList<String> array = new churroArrayList<String>();
     array.add("a");
     array.add("b");
     array.add("a");
     array.add("b");
     array.add(3, "c");
     System.out.println(array);
     System.out.println(array.set(1, "d"));
     System.out.println(array);
     System.out.println(array.remove(0));
     System.out.println(array);
     for (int i = 0; i < array.size(); i++) {
         System.out.println(array.get(i));
     }
  }
}
