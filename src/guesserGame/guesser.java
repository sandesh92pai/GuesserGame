package guesserGame;

import java.util.Scanner;

public class guesser {

    private int guessNum;

    public int guessNum()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey Guesser Please guess a number");
        guessNum = scanner.nextInt();
        if(guessNum==0) {
            System.out.println("Number should be more than 0");
            guessNum();
        }
        else{

        }

        return guessNum;
    }
}
