package objects;

import java.util.List;

// place to put stuff about "date" as a concept
public class Date {
  private int day;
  private int month;
  private int year;

  // if NO source code constructors, Compiler creates this one:
  // called a default constructor
//  public Date() {
  // implicit content here...
//  }

  public Date(int d, int m, int y) {
    if (!isValid(d,m,y)) throw new IllegalArgumentException("Bad date values");
    this.day = d;
    this.month = m;
    this.year = y;
  }

  public static boolean isValid(int day, int month, int year) {
    // NOT GOOD ENOUGH!!!
    return day >= 1 && day <= 31 && month >= 1 && month <= 12;
  }

  public static boolean isLeapYear(int y) {
    // || is "or" -- short circuiting
    // && is "and"
    return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
  }

  public static String monthName(int month) {
    // TODO: fill out the list!
    List<String> names = List.of("Jan", "Feb", "Mar");
    return names.get(month - 1);
  }

  public static String toText(int day, int month, int year) {
    return day + " of " + monthName(month) + " of " + year;
  }

  public static String toText(Date self) {
    return "STATIC " + self.day + " of " + monthName(self.month) + " of " + self.year;
  }

//  public String toText(Date this) { // this is valid from Java 6 onwards
  public String toString() { // instance methods IMPLICITLY start with this
    return "INSTANCE" + this.day + " of " + monthName(this.month)
        + " of " + this.year;
  }

  public /*static*/ void setMonth(Date this, int month) {
    if (isValid(this.day, month, this.year)) {
      this.month = month;
    } else {
      throw new IllegalArgumentException("Bad Date");
    }
  }

  public static void setMonth(Date d, int month) {
    if (isValid(d.day, month, d.year)) {
      d.month = month;
    } else {
      throw new IllegalArgumentException("Bad Date");
    }
  }

  public static int getMonth(Date d) {
    return d.month;
  }
}

class Holiday extends Date {
  private String name;
  public Holiday(int day, int month, int year, String name) {
    super(day, month, year); // super must come first (for now...)
    this.name = name;
  }

  public String toString() { // overriding method (replacment)
    return "Holiday called " + name + " on " + super.toString();
  }
}

class UseDates {
  public static void main(String[] args) {
    int myBirthDay = 12;
    int myBirthMonth = 2;
    int myBirthYear = 1985;

    System.out.println(Date.toText(myBirthDay, myBirthMonth, myBirthYear));

//    Date myBirth = new Date();
//    myBirth.day = 12;
//    myBirth.month = 2;
//    myBirthYear = 1985;
    Date myBirth = new Date(12, 2, 1985);

//    myBirth.month = -22;
//    Date.setMonth(myBirth, -22);
//    myBirth.setMonth(-22);

    System.out.println(Date.toText(myBirth));
    System.out.println(myBirth.toString());
//    System.out.println("my birth year is " + myBirth.year);

//    Holiday nyd = new Holiday(1, 1, 2024, "New Year's Day");
    Date nyd = new Holiday(1, 1, 2024, "New Year's Day");

//    System.out.println(nyd.toString());
    System.out.println(nyd);
  }
}
