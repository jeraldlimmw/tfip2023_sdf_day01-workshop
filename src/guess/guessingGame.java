package guess;

// imports
import java.io.Console;
import java.util.Random;

public class guessingGame {
    
    // entry point
    public static void main(String args[]) {
        Console cons = System.console();
        Random rand = new Random();

        // initialise game: 5 tries, random answer from 1 to 20
        int tries = 5;
        int answer = rand.nextInt(20) + 1;
        int guess = -1;
        boolean win = false;
        
        // while tries available, ask for input
        // if input is not answer, reply Higher or Lower and minus one try
        // if input is anwer, reply You Win! and end
        while (tries > 0 && !win) {
            String input = cons.readLine("What is your guess?(%d tries): ", tries);
            guess = Integer.parseInt(input);

            if (guess > answer) {
                System.out.printf("Lower\n");
            } else if (guess < answer) {
                System.out.printf("Higher\n");
            } else {
                System.out.printf("You win!\n");
                win = true;
            }
            tries--;
        }
        
        // no more tries, reply You lose and show answer
        if (!win) {
            System.out.printf("You lose. The number is %d.\n", answer);
        }
    }    
}