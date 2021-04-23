package practice;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {
    public static void main(String[] args) {

        String yourGuess;
        int yourGuessNumber;
        int headOrTail;

        Scanner sc = new Scanner (System.in);

        System.out.print("What os your guess: ");
        yourGuess = sc.next();

        System.out.println("your guess is " + yourGuess);

//        System.out.println("Let`s try once again: ");
//        String answer = sc.next();

        if (!yourGuess.equals("head") && !yourGuess.equals("tail")) {
            System.out.println("Try again, next time enter head or tail");
            System.exit(0);
        }

        if (yourGuess.equals("head")) {
            yourGuessNumber = 0;
        } else {
            yourGuessNumber = 1;
        }

        headOrTail = new Random().nextInt(2);
        if (headOrTail == yourGuessNumber) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost!");
        }

    }
}
