package snakeandladder;

import java.util.Random;

public class CheckForanOption {
    CheckForanOption()
    {
        System.out.println("Welcome to Snake and Ladder Simulation \n");
    }

    public static void main(String[] args) {
        CheckForanOption a = new CheckForanOption();
        int startingPosition = 0;
        int playerPosition = 0;
        Random random = new Random();
        System.out.println("Starting Position of the Single Player is : "+startingPosition+"\n");

        //Rolling the die.
        int dieRolls1 = (random.nextInt(6)+1);
        System.out.println("The Player rolls the die and gets a number : "+dieRolls1+"\n");

        //Checking for option.
        int b = random.nextInt(3);
        playerPosition = playerPosition + dieRolls1;
        switch (b)
        {
            case 0 :
                System.out.println("No play - Player stays in the same position \n");
                System.out.println("Player current position is : "+playerPosition);
                break;
            case 1 :
                playerPosition = playerPosition + dieRolls1;
                System.out.println("Player gets Ladder & Player moves ahead by number of position : "+dieRolls1+"\n");
                System.out.println("Player current position is : "+playerPosition);
                break;
            case 2 :
                playerPosition = playerPosition - dieRolls1;
                System.out.println("Oops Snake bytes!! & Player moves behind by number of position : "+dieRolls1+"\n");
                System.out.println("Player current position is : "+playerPosition);
                break;
        }

//        //Method - 2
//        int[] ladder = {10,20,30,35,40,50,57,60,70,72,80,89};
//        int[] snake = {5,12,17,25,32,39,45,52,58,67,75,88,93};
//        if (dieRolls1 == 1) {
//            startingPosition++;
//            if (startingPosition == 1) {
//                int dieRolls2 = (random.nextInt(6) + 1);
//                System.out.println("The Player rolls again the die and gets a number : " + dieRolls2 + "\n");
//                playerPosition = playerPosition + dieRolls2;
//                for (int i = 0; i < ladder.length; i++) {
//                    for (int j = 0; j < snake.length; j++) {
//                        if (playerPosition == ladder[i]) {
//                            playerPosition = playerPosition + dieRolls2;
//                            System.out.println("Player gets Ladder & Player moves ahead by number of position : " + dieRolls2 + "\n");
//                            System.out.println("Player current position is : " + playerPosition);
//                            break;
//                        }
//                        else if (playerPosition == snake[j]) {
//                            playerPosition = playerPosition - dieRolls2;
//                            System.out.println("Oops Snake bytes!! & Player moves behind by number of position : " + dieRolls2 + "\n");
//                            System.out.println("Player current position is : " + playerPosition);
//                            break;
//
//                        }
//                        else if (playerPosition != ladder[i] && playerPosition != snake[j]) {
//                            System.out.println("No play - Player stays in the same position \n");
//                            System.out.println("Player current position is : " + playerPosition);
//                            break;
//                        }
//                    }
//                }
//            }
//        }
    }
}
