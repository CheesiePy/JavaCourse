package JavaDev;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
  public static void main(String[] args) {
    // Open the file
    BufferedReader reader = null;
    String filepath = "/home/CheesiePy/Documents/GitHub/JavaCourse/JavaDev/filename.txt";
    String[] uniqeLines = new String[32];
    int uniqeLinesCounter = 0;
    try {
      reader = new BufferedReader(new FileReader(filepath));
      // Read the first line
      String line = reader.readLine();
      boolean counting_flag = false;
      while (line != null) {
        for(int i = 0; i < uniqeLinesCounter; i++){
            if(line.equals(uniqeLines[i])){
                counting_flag = true;
            }
        }

        if(counting_flag){
            line = reader.readLine();
            counting_flag = false;
        }else{
            uniqeLines[uniqeLinesCounter] = line;
            uniqeLinesCounter++;
            //System.out.println(line);
            line = reader.readLine();
        }
        
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

    
    for(int i =0; i < uniqeLinesCounter; i++){
        System.out.println(uniqeLines[i].toString());
    }
    //Open the file
    PrintWriter writer = null;
    try {
      writer = new PrintWriter("output.txt", "UTF-8");
      // Write to the file
      
      for(int i=0; i < uniqeLinesCounter; i++){
        writer.println(uniqeLines[i]);
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      // Close the file
      if (writer != null) {
        writer.close();
      }
    }
  }

  

  // goal:
  // we want to count the number of unique lines in the file
}
