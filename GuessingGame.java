import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;



public class GuessingGame {

          public GuessingGame() {
            System.out.println("Welcome to the guessing game!");
              System.out.println("(type in your name) ");

              Scanner myInput = new Scanner(System.in);

              String name = myInput.nextLine();

              System.out.println("Okay " + name + ". Can you guess which number between 1 and 100 I am thinking of?");

              System.out.println("Enter first integer here: ");


              Random rand = new Random();
              int number = rand.nextInt(100);
              int tries = 0;



              while (true) {
                  int guess;
                  try {
                      guess = myInput.nextInt();
                  } catch (InputMismatchException e) {
                      String bad_input = myInput.next();
                      System.out.println("We're looking for numbers here. Try again");
                      continue;
                  }

                  if (guess < 1 || guess > 100) {
                      System.out.println("It's not me, it's you. That isn't between 1 and 100. Try again");
                      continue;
                  }
                  tries += 1;

                  if (guess < number) {
                      System.out.println("You've guessed too low. Try again!");
                  } else if (guess > number) {
                      System.out.println("Your guess is too high. Try again!");
                  } else {
                          System.out.println("Well, " + name + ", you managed to guess my number!");
                          System.out.println("You guessed the correct number in " + tries + " tries.");
                          break;
                      }

                  }
              }
        }




