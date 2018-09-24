package sadlik.norbert.user_guessing_num;

import java.util.Random;
import java.util.Scanner;

public class UserGuessingNumber {

    public static void main(String[] args) {

        Random r = new Random();
        int cpuNum = r.nextInt(100 +1);

        System.out.println("Guess my number ranging 1 - 100 and enter it");
        int counter = 0;
        int userGuess = 0;
        Scanner scan = new Scanner(System.in);
        while (userGuess != cpuNum) {
            while (!scan.hasNextInt()){
                scan.next();
                System.out.println("Wrong input. Enter a number ranging 1 - 100");
            }
            userGuess = scan.nextInt();
            counter++;
            if (userGuess > cpuNum){
                System.out.println("It's too much");
            } else if (userGuess < cpuNum) {
                System.out.println("It's too little");
            }
        }
        if (counter == 1) {
            System.out.println("Spectacular! You've guessed in first try!");
        } else {
            System.out.println("Bravo! My number is " + cpuNum + "! You have guessed in " + counter + " tries.");
        }
    }
}
