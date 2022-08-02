package guesserGame;

import java.util.Scanner;

public class Player {

    private int playerNumber;

    public int getPlayerGuessedNumber(int n)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("hey player "+n+" Please guess a number");
        playerNumber = scanner.nextInt();
        return playerNumber;
    }
}
