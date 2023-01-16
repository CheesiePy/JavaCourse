package JavaDev.Hangman;

import java.util.Scanner;

public class Hangman {
  public static void main(String[] args) {
    // read words from a file 

    
    String[] words = {"java", "programming", "computer"}; //
    // String topic;
    String wordToGuess = words[(int) (Math.random() * words.length)];
    String hiddenWord = "";
    for (int i = 0; i < wordToGuess.length(); i++) {
      hiddenWord += "_";
    }
    int maxIncorrectGuesses = 6;
    int incorrectGuesses = 0;
    Scanner scanner = new Scanner(System.in);
    // System.out.println("Topic: " + topic);
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
        incorrectGuesses++;
      }
    }
    if (incorrectGuesses == maxIncorrectGuesses) {
      System.out.println("You lose. The word was " + wordToGuess);
    }
  }
}
