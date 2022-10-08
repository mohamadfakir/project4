package snakeandladder;

import java.util.Random;

public class RollsTheDie {
    public static void main(String[] args) {
        int pos = 0;
        System.out.println("Welcome to snake and ladder program");
        System.out.println("Single player at start position"+ pos);
        RollsDie();
    }

    private static void RollsDie() {
        Random random =new Random();
        int dice = random.nextInt(6);
        dice =dice=1;
        System.out.println("Dice Num :"+ dice);

    }
}
