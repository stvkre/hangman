import java.io.Console;
import java.util.Scanner;
import java.util.Random;

public class Hangman {
  public static void main(String[] args) {
    Random random = new Random();
    String[] guesses = { "constipate", "oblitirate", "athletism", "propaganda", "sequel", "quantum" };

    Console myConsole = System.console();

// Introducing player

    boolean GameInProgress = true;
    while (GameInProgress) {

    System.out.println("Enter your Name:");
    String hangMan = myConsole.readLine();
    System.out.println("Let's do this! " + hangMan + "!" + "You are Player 1");
    System.out.println("------------------");
    System.out.println("Here is how our gane works, You can only guess one letter at a time. if you guess whether right or wrong the computer automatically moves to the next letter up until the spaces are used up. How you win is by correctly guessing the words according to the spaces given. Good Luck");
    System.out.println("---------------------");

    // saving user input
    char[] anyWordGuessed = guesses[random.nextInt(guesses.length)].toCharArray();
    int numberOfGuesses = anyWordGuessed.length;

    char[] PlayerGuess = new char[numberOfGuesses];

// replacing word to be guessed by the player with an underscore sign
    for (int i = 0; i < PlayerGuess.length; i++) {
      PlayerGuess[i] = '_';
    }

    boolean wordIsGuessed = false;
    int tries = 0;

  while (!wordIsGuessed && tries != numberOfGuesses) {
    System.out.println("Current guesses: ");
    printArray(PlayerGuess);
    System.out.printf("You have %d tries left.\n", numberOfGuesses - tries);
    System.out.println("Enter a single letter");

  }

}
    System.out.println("Game Over");
  }

// New game after the player chooses to play again

  public static void printArray(char[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
  }
}
