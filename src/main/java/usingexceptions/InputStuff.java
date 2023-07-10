package usingexceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputStuff {
  // can "declare" a checked excpetion if we can't handle it
//  public static void main(String[] args) throws FileNotFoundException {
  public static void main(String[] args) {
    try ( // "try with resources" reliably closes our resources,
          // even in the event of problems. USE THIS FORM
        FileReader fr = new FileReader("data.txt");
        BufferedReader br = new BufferedReader(fr);
    ) {
      String line = null;
      while ((line = br.readLine()) != null) {
        System.out.println("> " + line);
      }
    } catch (FileNotFoundException ioe) {
      System.out.println("File not found");
    } catch (IOException ioe) {
      System.out.println("Hmm, failed reading the line!");
    }
//    try {
//      FileReader fr = new FileReader("data.txt");
//      BufferedReader br = new BufferedReader(fr);
//      String line = null;
//      while ((line = br.readLine()) != null) {
//        System.out.println("> " + line);
//      }
//      br.close(); // what if we got an exception in the processing?
//    } catch (FileNotFoundException ioe) {
//      System.out.println("File not found");
//    } catch (IOException ioe) {
//      System.out.println("Hmm, failed reading the line!");
//    }
  }
}
