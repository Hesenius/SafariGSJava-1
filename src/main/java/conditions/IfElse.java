package conditions;

public class IfElse {
  public static void main(String[] args) {
    int x = 99;
    int y = 100;
    if (x == y) { // test must be boolean type, and in parens.
      System.out.println("they're equal");
    } else if (x > y) {
      System.out.println("x greater");
    } else {
      System.out.println("y greater");
    }


//    if (x == y) { // test must be boolean type, and in parens.
//      System.out.println("they're equal");
//    } else {
//      if (x > y) {
//        System.out.println("x greater");
//      } else {
//        System.out.println("y greater");
//      }
////      System.out.println("they're not equal");
//    }
    System.out.println("------------------");
    String msg = (x > y) ? "X is greater than Y" : "Hmm, x is smaller";
    System.out.println(msg);
  }
}
