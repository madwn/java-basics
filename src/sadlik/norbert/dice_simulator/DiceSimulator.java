package sadlik.norbert.dice_simulator;

import java.util.Random;

public class DiceSimulator {

    public static void main(String[] args) {
        rollDice("3D100+10");
    }

    static void rollDice(String roll){
        String[] split = roll.split("[D+-]");
        String add = "";
        String subtract = "";
        if (roll.contains("+")){
            add = split[2];
        } else if (roll.contains("-")){
            subtract = split[2];
        }
        int addInt = 0;
        if (!add.equals("")){
            addInt = Integer.parseInt(add);
        }
        int subtractInt = 0;
        if (!subtract.equals("")){
            subtractInt = Integer.parseInt(subtract);
        }
        int diceNumInt = 0;
        String diceNum = split[0];
        if (!diceNum.equals("")) {
            diceNumInt = Integer.parseInt(diceNum);
        }
        String diceSides = split[1];
        int diceSidesInt = Integer.parseInt(diceSides);
        Random r = new Random();
        int rollNum = 1;
        int rollsResult = 0;
        do{
            int rand = r.nextInt(diceSidesInt) +1;
            System.out.println("Result of roll number " + rollNum + " is: " + rand);
            rollNum++;
            diceNumInt--;
            rollsResult += rand;
        }while (diceNumInt > 0);
        int result = rollsResult + addInt - subtractInt;
        System.out.println("Final result is: " + result);
    }
}
