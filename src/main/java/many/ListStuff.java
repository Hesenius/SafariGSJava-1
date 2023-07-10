package many;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListStuff {

  public static void showAll(List<String> lls) {
    // DON'T do THIS!!!!
//    for (int idx = 0; idx < lls.size(); idx++) {
//      System.out.println("> " + lls.get(idx));
//    }

    for (String x : lls) {
      System.out.println("> " + x);
    }
  }

  public static void main(String[] args) {
    // "generics" lets us add "more type info" to something
//    ArrayList<String> names = new ArrayList<String>();
    // since Java 7, can use "diamond" on RHS for speed
//    ArrayList<String> names = new ArrayList<>();
//    LinkedList<String> names = new LinkedList<>();
    List<String> names = new LinkedList<>();
    names.add("Fred");
    names.add("Jim");
    names.add("Sheila");
    System.out.println(names);
    System.out.println("first name in list is " + names.get(0));
    names.set(0, "Frederick");
    System.out.println("first name in list is " + names.get(0));
    System.out.println("There are " + names.size() + " names in the list");
    names.add("Alice");
    System.out.println(names);
    System.out.println("There are " + names.size() + " names in the list");
    // indexOf (and others) REQUIRE working .equals() take care!!!
    System.out.println("Alice is at position " + names.indexOf("Alice"));
    System.out.println("---------------");
    showAll(names);

    System.out.println("---------------");
    List<Integer> nums = new ArrayList<>();
    nums.add(Integer.valueOf(1));
    nums.add(1); // autoboxing
    int v = nums.get(0); // auto-unboxing
  }
}
