package conditions;

public class Switch {
  public static void main(String[] args) {
    int x = 99;
    final int ninetyNine = 99;
    switch (x) { // int (or smaller) integral number, String, enum
      case ninetyNine + 10 - 10: {
        System.out.println("It's 99");
        System.out.println("really, ninety nine");
        break;
      }
      case 100:
        System.out.println("hundred!");
        break;
      default:
        System.out.println("something else");
        break;
    }

    // available from Java 14??? onwards i.e. LTS 17
//    switch (x) { // int (or smaller) integral number, String, enum
//      case ninetyNine + 10 - 10 -> {
//        System.out.println("It's 99");
//        System.out.println("really, ninety nine");
//      }
//      case 100 -> System.out.println("hundred!");
//      default -> System.out.println("something else");
//    }

    // new switch can be an expression
    // assignment context makes switch an expression!!!
    // MUST cover all input values for this form
    String msg = switch (x) {
      case 99 -> {
        System.out.println("found ninetynine");
        yield "it's nintynine"; // in a block, must use "yield" (NOT return)
      }
      case 100 -> "it's 100";
      default -> "something else";
    }; // semicolon to close the initialization
    System.out.println(msg);
  }
}
