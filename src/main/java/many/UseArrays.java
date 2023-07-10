package many;

import java.util.Arrays;

public class UseArrays {
  public static void main(String[] args) {
    // arrays are a bit ugly...

    String [] names = new String[3]; // three elements is now FIXED
    names[0] = "Fred";
    names[1] = "Jim";
    names[2] = "Sheila";
    System.out.println(names);
    System.out.println(names.length);
    System.out.println(Arrays.toString(names));

    String[] names2 = new String[4];
    System.arraycopy(names, 0, names2, 0, names.length);
    System.out.println(Arrays.toString(names2));
    names2[3] = "Buster";
    System.out.println(Arrays.toString(names2));

    // array literals
    String [] names3 = new String[] {
        // trailing comma permitted, but not required
        "Bob",
        "Alice",
    };
    // for initializting a variable declaration, can leave out the
    // contstuction part
    String [] names4 = {
        // trailing comma permitted, but not required
        "Bob",
        "Alice",
    };
  }
}
