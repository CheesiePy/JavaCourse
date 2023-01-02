package JavaDev;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    // Open the file
    BufferedReader reader = null;
    String filepath = "/home/CheesiePy/Documents/GitHub/JavaCourse/JavaDev/filename.txt";
    try {
      reader = new BufferedReader(new FileReader(filepath));
      // Read the first line
      String line = reader.readLine();
      
      while (line != null) {
        // Process the line
        System.out.println(line);
        // Read the next line
        line = reader.readLine();
      }
    } catch (IOException e) {
       e.printStackTrace();
        
    } finally {
      //Close the file
      try {
        if (reader != null) {
          reader.close();
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
  // goal:
  // we want to count the number of unique lines in the file
}
