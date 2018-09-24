package sadlik.norbert.cpu_guessing_num;

import java.util.Scanner;

public class CpuGuessingNumber {

    public static void main(String[] args) {

        System.out.println("Think of a number ranging 0 - 1000 and I will guess it in maximum of 10 tries.");
        int max = 1000;
        int min = 0;
        Scanner scan = new Scanner(System.in);
        String go = "";
        while (!go.equals("go")) {
            System.out.println("If you are ready type 'go'");
            go = scan.nextLine();
        }

        String answer = "";
        int counter=0;
        while (!answer.equals("too much") || !answer.equals("too little") || !answer.equals("correct")) {
            int guess = ((max - min) / 2) + min;
            if (counter >= 10){
                System.out.println("You've made a mistake or you are cheating. We start over.");
                max = 1000;
                min = 0;
                guess = 500;
                counter = 0;
            }
            System.out.println("I'm guessing " + guess +
                    '\n' + "Respond with 'too much', 'too little', or 'correct'");
            answer = scan.nextLine();
            counter++;
            if (answer.equals("correct")) {
                System.out.println("I've guessed in " + counter + " tries!");
                break;
            }else if (answer.equals(("too much"))){
                max = guess;
            }else if (answer.equals("too little")){
                min = guess;
            }else {
                System.out.println("Possible respones are: 'too much', 'too little', or 'correct'");
                counter--;
            }

        }

    }
}
