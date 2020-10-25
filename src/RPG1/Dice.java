package RPG1;

import java.util.Random;

public class Dice {

    public static int diceRoll( int sides, int numOfRolls) {

        int total = 0;
        int roll = 0;

        Random random = new Random();

        for (int i = 0; i < numOfRolls; i++) {
            roll = random.nextInt(sides)+1;
            System.out.println("Your rolled: " + roll);
            total+=roll;
        }
        return total;
    }

}
