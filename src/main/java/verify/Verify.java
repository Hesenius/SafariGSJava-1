package verify;

sealed interface V permits Verify {}
public final class Verify implements V {
  public static void main(String[] args) {
    System.out.println("Welcome to Java 17!");
  }
}
