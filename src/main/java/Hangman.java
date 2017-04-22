import java.io.Console;
// import java.util.Random;

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

    char[] anyWordGuessed = guesses[random.nextInt(guesses.length)].toCharArray();
    int numberOf Guesses =
    // saving user input
    char[] playerGuess = new char[numberOfGuesses];
}
    System.out.println("Game Over");
  }
}
