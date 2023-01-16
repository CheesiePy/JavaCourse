package JavaDev.Hangman;

import java.io.BufferedReader;
import java.util.Random;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class Hangman {
  /**
 * @param args
 */

 public static void printHangman(int stages) {
    switch (stages) {
        case 0:
            System.out.println("  _____");
            System.out.println(" |     |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            break;
        case 1:
            System.out.println("  _____");
            System.out.println(" |     |");
            System.out.println(" |     O");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            break;
        case 2:
            System.out.println("  _____");
            System.out.println(" |     |");
            System.out.println(" |     O");
            System.out.println(" |     |");
            System.out.println(" |     |");
            System.out.println(" |");
            System.out.println(" |");
            break;
        case 3:
            System.out.println("  _____");
            System.out.println(" |     |");
            System.out.println(" |     O");
            System.out.println(" |    \\|");
            System.out.println(" |     |");
            System.out.println(" |");
            System.out.println(" |");
            break;
        case 4:
            System.out.println("  _____");
            System.out.println(" |     |");
            System.out.println(" |     O");
            System.out.println(" |    \\|/");
            System.out.println(" |     |");
            System.out.println(" |");
            System.out.println(" |");
            break;
        case 5:
            System.out.println("  _____");
            System.out.println(" |     |");
            System.out.println(" |     O");
            System.out.println(" |    \\|/");
            System.out.println(" |     |");
            System.out.println(" |    /");
            System.out.println(" |");
            break;
        case 6:
            System.out.println("  _____");
            System.out.println(" |     |");
            System.out.println(" |     O");
            System.out.println(" |    \\|/");
            System.out.println(" |     |");
            System.out.println(" |    / \\");
            System.out.println(" |");
            break;
    }
}

public static void main(String[] args) {
    // read words from a file and store them in an array
    String[] words = new String[100];
    String filepath = "/home/CheesiePy/Documents/GitHub/JavaCourse/JavaDev/Hangman/tvshows.txt";
    BufferedReader reader = null;
    Random rand = new Random();
    int counter = 0;
    String topic = "";
    try {    
        reader = new BufferedReader(new FileReader(filepath));
        
        topic = reader.readLine();
        String line = "";
        while (line != null ) {
          line = reader.readLine();
          
          if(line == null){
              break;
          }
          words[counter++] = line;
        }
    
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
        System.exit(0);
    }finally{
        //Close the file
        try {
          if (reader != null) {
            reader.close();
          }
        } catch (IOException e) {
          e.printStackTrace();
    }

    // String topic;
    String wordToGuess = words[rand.nextInt(counter)];
    String hiddenWord = "";
    for (int i = 0; i < wordToGuess.length(); i++) {
      hiddenWord += "_ ";
    }
    int maxIncorrectGuesses = 6;
    int incorrectGuesses = 0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Topic: " + topic);
    while (incorrectGuesses < maxIncorrectGuesses) {
      System.out.println("Guess a letter in the word: " + hiddenWord); // 
      String guess = scanner.nextLine();
      if (wordToGuess.contains(guess)) {
        System.out.println("Correct!");
        for (int i = 0; i < wordToGuess.length(); i++) {
          if (wordToGuess.charAt(i) == guess.charAt(0)) {
            hiddenWord = hiddenWord.substring(0, i) + guess + hiddenWord.substring(i + 1);
          }
        }
        if (!hiddenWord.contains("_")) {
          System.out.println("You win! The word was " + wordToGuess);
          break;
        }
      } else {
        System.out.println("Incorrect.");
        printHangman(incorrectGuesses++);
      }
    }
    if (incorrectGuesses == maxIncorrectGuesses) {
      System.out.println("You lose. The word was " + wordToGuess);
    }
  }
}
}
