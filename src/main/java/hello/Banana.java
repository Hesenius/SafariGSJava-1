package hello;

import static java.lang.System.out;
//import java.lang.System;
//import java.lang.*;

public class Banana {
  public static void main(String[] args) {
//    java.lang.System.out.println("Hello Java world!");
//    System.out.println("Hello Java world!");
    out.println("Hello Java world!");

    int x;
    x = 99;
    x = 2_000_000_000;
    double d = 3.14; // "double" IEEE 754 64 bit floating point number
    long lng = 123; // 64 bit integer -- widening conversion OK
//    x = lng; // "narrowing" conversions (which might lose data) prohibited
    lng = 3_000_000_000L; // long literal with L
    // F -> float literal, 32 bit number

    // no automatic conversions between string and numeric types
    String name = "Fred";

    // can "cast" numbers that "dont' fit"
    // (rubbish!)
    x = (int)lng; // result will be least significant 32 bits of 3 billion

    // Operators, arithmetic:
    // + - * / %
    // / is divide, % is remainder (NOT the same as MOD)
    int fahr = 90;
    double cels = (5 / 9.0) * (fahr - 32);
//    double cels = 5 * (fahr - 32) / 9;
    out.println(cels);

    // + does string concatenation AND autoconverts ONE operand
    // default evaluation is left to right/!
    out.println("Hello " + 99);
    out.println("Hello " + 99 + 100);
    out.println(99 + 100 + "Hello ");

    boolean isIt = true; // false -- lower case
    // logical operators
    // < <= > >= != ==
    int a = 100;
    int b = 110;
    out.println(a > b);

    int c = 100;
    out.println(a == c);

    String h1 = "Hello";
    String h2 = "He";
    out.println(h1 == h2);
//    h2.concat("llo"); // Strings in Java are IMMUTABLE
    String h3 = h2.concat("llo"); // concat MAKES a NEW String derived from the old!
    h3 = h3.intern();
    out.println(h2);
    out.println(h1);
    out.println(h3);
    out.println("--------------");
    out.println(h1 == h3);
    out.println(h1.equals(h3));

    String h4 = "Hello";
    out.println(h1 == h4);

    StringBuilder sb1 = new StringBuilder("Hello");
    StringBuilder sb2 = new StringBuilder("Hello");
    out.println("-----------------");
    out.println(sb1 == sb2);
    out.println(sb1.equals(sb2));


  }
}
