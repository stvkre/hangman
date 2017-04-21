import java.io.Console;

public class hangman {
  public static void main(String[] args) {
    Console myConsole = System.console();

// Introducing player

    System.out.println("Enter your Name:");
    String hangMan = myConsole.readLine();
    System.out.println("Let's do this! " + hangMan + "!" + "You are Player 1");
  }
}
