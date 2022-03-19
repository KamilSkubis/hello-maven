package pl.edu.agh.mwo.hellomaven;

import java.util.Random;

/**
 * Simple main application.
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    /**
     * Method will return random number.
     * @return random integer
     */
    public int getRandomNumber() {
        // chosen by fair dice roll.
        // guaranteed to be random
        Random random = new Random();
        return random.nextInt();;
    }
}
