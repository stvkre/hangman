import java.io.Console;
import java.util.Scanner;
import java.util.Random;

public class Hangman {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
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
    System.out.println("Here is how our game works, You can only guess one letter at a time. if you guess whether right or wrong the computer automatically moves to the next letter up until the spaces are used up. How you win is by correctly guessing the words according to the spaces given. Good Luck");
    System.out.println("---------------------");

    // saving user input
    char[] anyWordGuessed = guesses[random.nextInt(guesses.length)].toCharArray();
    int numberOfGuesses = anyWordGuessed.length;

// displays word to be guessed with underscores

    char[] PlayerGuess = new char[numberOfGuesses];


    for (int i = 0; i < PlayerGuess.length; i++) {
      PlayerGuess[i] = '_';
    }

    boolean WordIsGuessed = false;
    int tries = 0;

  while (!WordIsGuessed && tries != numberOfGuesses) {
    System.out.print("Current guesses: ");
    printArray(PlayerGuess);
    System.out.printf("You have %d tries left.\n", numberOfGuesses - tries);
    System.out.println("Enter a single letter");

    char input = scanner.nextLine().charAt(0);
    tries++;

// replacing underscore with correct letter guessed


    if (input == '-') {
      GameInProgress = false;
      WordIsGuessed = true;
    } else {
      for (int i = 0; i < anyWordGuessed.length; i++) {
        if (anyWordGuessed[i] == input) {
          PlayerGuess[i] = input;
        }
      }

      if (isTheWordGuessed(PlayerGuess)) {
        WordIsGuessed = true;
        System.out.println("You won!");
      }
    }


  }

      if (!WordIsGuessed) System.out.println("You ran out of guesses :/");
      System.out.println("Do you wish to continue? (yes/no)");
      String anotherGame = scanner.nextLine();
      if (anotherGame.equals("no")) GameInProgress = false;
}
    System.out.println("Game Over");
  }

// New game after the player chooses to play again

  public static void printArray(char[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }

  public static boolean isTheWordGuessed(char[] array) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == '_') return false;
    }
    return true;
  }
}
