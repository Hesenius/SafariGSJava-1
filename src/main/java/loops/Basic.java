package loops;

public class Basic {
  public static void main(String[] args) {
    int x = 3;
    while (x > 0) {
      System.out.println("x is " + x);
//      x = x - 1;
//      x -= 1;
      // --x has the value (x - 1) and reduces x by one x-- has the value x, and reduces x by 1
      x--;
    }

    System.out.println("------------------");
    for (int y = 0; y < 3;  y++) {
//      System.out.println("y is " + y);
      System.out.printf("y is %d\n", y);
    }

    // Scope of variable:
    // declared inside curlies (in a method):
    // - from point of declaration to end of enclosing curlies
    // declared in PARENS followed by curlies:
    // - from point of declaration to end of FOLLOWING curlies
    // - called "formal parameter"

    System.out.println("------------------");
    int y = 0;
    do {
      System.out.println("y is " + y);
    } while (y != 0);
  }
}
