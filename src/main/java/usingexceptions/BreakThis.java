package usingexceptions;

public class BreakThis {
  public static int mightBreak(int x) {
    if (Math.random() > 0.5) {
      throw new ArithmeticException("Bad numbers");
//      return x * 2;
    } else {
      throw new IllegalStateException("Hmm, something failed");
    }
  }
  public static void main(String[] args) {
    System.out.println("Starting");
    try {
      System.out.println("Value is " + mightBreak(3));
      System.out.println("returned successfully");
    } catch(IllegalStateException ie) {
      System.out.println("uh oh it failed, message: " + ie.getMessage());
    } finally {
      System.out.println("in finally");
    }
    System.out.println("Ending");
  }
}
