package createOwnArrayList;

import java.util.Arrays;

public class churroArrayListDriver {
  public static void main(String[] args) {
     churroArrayList<String> array = new churroArrayList<String>();
     array.add("sd");
     System.out.println(Arrays.deepToString(array.getArray()));
     System.out.println(array.getArray()[0]);
  }
}
