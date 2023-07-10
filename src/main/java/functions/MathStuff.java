package functions;

class Arithmetic {
  // private means accessible inside the TOP_LEVEL enclosing curly braces
//  private static int add(int x, int y) {
  // no accessibility (commonly) means "accecssible inside the same package"
  // name of this method is really functions.Arithmetic.add_int_int
  static int add(int x, int y) {
//  public static int add(int x, int y) {
    System.out.println("adding ints");
    return x + y;
  }

  // "method overloading"
  public static double add(double x, double y) {
    System.out.println("adding doubles");
    return x + y;
  }

  public static long add(int x, long y) {
    return x + y;
  }

  public static long add(long x, int y) {
    return x + y;
  }

  public static int add(int ... ints) {
    System.out.println("adding many");
    int sum = 0;
    for (int x : ints) {
      sum += x;
    }
    return sum;
  }

}

public class MathStuff {
  public static void main(String[] args) {
    int a = 5;
    int b = 10;
//    int c = functions.Arithmetic.add(a, b); // OK but odd!
//    long c = Arithmetic.add((long)a, b);
//    int c = Arithmetic.add((long)a, b);
    int c = Arithmetic.add(a, b); // NOT OK, need Arithmetic as scope
    System.out.println("sum is " + c);
    System.out.println("sum of doubles is " + Arithmetic.add(3.14, 2.7));

    System.out.println("Sum of several is " + Arithmetic.add(1, 2, 3, 4));
    System.out.println("Sum of several is " + Arithmetic.add(1, 2));
  }
}
