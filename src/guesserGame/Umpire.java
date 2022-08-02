package guesserGame;

import java.util.Scanner;

public class Umpire {

    public guesser gnum = new guesser();
    public Player player = new Player();
    Scanner scanner = new Scanner(System.in);
    public int numberofPlayers;
    public int player1;
    public int player2;
    public int player3;
    public int GuessNumber;


    public static void main(String[] args) {
        System.out.println("Start the Game");
        Umpire up = new Umpire();
        up.startTheGame();
    }

    public int getGuesserNumber()
    {
        GuessNumber = gnum.guessNum();;
        return GuessNumber;
    }

    public void letPlayGame(){
        System.out.println("Select the Number of Players");
        numberofPlayers = scanner.nextInt();

        if(numberofPlayers<=1)
        {
            System.out.println("Please select players more than 1");
            System.out.println(" Please Select the Number of Players again ");
            letPlayGame();
        }
        else if(numberofPlayers>3)
        {
            System.out.println("Max of 3 players only");
            System.out.println(" Please Select the Number of Players again ");
            letPlayGame();
        }
        else{
            System.out.println("Number of Players selected is "+numberofPlayers);
            selectTheNumberOfPlayers();
        }
    }

    public void selectTheNumberOfPlayers()
    {
        if (numberofPlayers == 3) {
            for (int i = 1; i <= numberofPlayers; i++) {
                if (i == 1) {
                    player1 = player.getPlayerGuessedNumber(i);
                } else if (i == 2) {
                    player2 = player.getPlayerGuessedNumber(i);
                } else {
                    player3 = player.getPlayerGuessedNumber(i);
                }
            }
        }
        else if (numberofPlayers == 2) {
            for (int i = 1; i <= numberofPlayers; i++) {
                if (i == 1) {
                    player1 = player.getPlayerGuessedNumber(i);
                } else {
                    player2 = player.getPlayerGuessedNumber(i);
                }
            }
        }
    }

    public void declareTheResults(){
        System.out.println("Time to declare the result");
        if (GuessNumber==player1&&player1==player2&&player1==player3){
            System.out.println("All gave correct answer ");
        }
        else if(GuessNumber==player1&&GuessNumber!=player2&&GuessNumber!=player3){
            System.out.println(" Player 1 is the winner ");
        }
        else if(GuessNumber!=player1&&GuessNumber==player2&&GuessNumber!=player3){
            System.out.println("Player 2 is the winner ");
        }
        else if(GuessNumber!=player1&&GuessNumber!=player2&&GuessNumber==player3){
            System.out.println("Player 3 is the winner ");
        }
        else if(GuessNumber==player1&&GuessNumber==player2&&GuessNumber!=player3){
            System.out.println("Player 1 is the winner ");
        }
        else if(GuessNumber==player2&&GuessNumber==player3){
            System.out.println("Player 2 is the winner ");
        }
        else{
            System.out.println(" None answered ");
        }
    }

    public void startTheGame(){
        System.out.println("Guesser Number is "+getGuesserNumber());
        letPlayGame();
        declareTheResults();
        System.out.println("Do you want to play the game again");
        System.out.println("Select Yes to play again or No to Quit");
        String userReply = scanner.next();
        if(userReply.equalsIgnoreCase("yes")){
            System.out.println("Okay Booting bukcal up");
            startTheGame();
        }
        else{
            System.out.println("Okay Quitting See You again");
            System.exit(0);
        }
    }
}
