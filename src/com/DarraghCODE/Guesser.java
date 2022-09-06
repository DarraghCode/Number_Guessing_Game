package com.DarraghCODE;

import java.util.Scanner;

public class Guesser {

    public static void guessNumber() {
        // Call the Users input.
        Scanner sc = new Scanner(System.in);

        // Computer generates the number
        int number = 1 + (int) (100 * Math.random());

        // Given K guesses
        int K = 5;

        int i, guess;

        System.out.println("A number is chosen between 1 to 100."+"\n"+"Guess the number within 5 guesses.");

        // Iterate over K guesses
        for (i = 0; i < K; i++) {

            System.out.println("Your guess:");

            // Take input for guessing
            guess = sc.nextInt();

            // If the number is guessed
            if (number == guess) {
                System.out.println(
                        "Congratulations! You guessed the number.");
                break;
            } else if (number > guess
                    && i != K - 1) {
                System.out.println(
                        "The number is greater than " + guess);
            } else if (number < guess
                    && i != K - 1) {
                System.out.println(
                        "The number is less than " + guess);
            }
        }

        if (i == K) {
            System.out.println("You have exhausted your guesses.");

            System.out.println("The number was " + number);
        }
    }
    //Call on the method above to run the code
    public static void main(String[] args) {
        guessNumber();
    }
}

