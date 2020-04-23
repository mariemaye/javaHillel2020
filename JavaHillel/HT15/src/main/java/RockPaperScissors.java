import java.io.*;

public class RockPaperScissors {
    private User user;
    private Computer computer;
    private int userScore;
    private int computerScore;
    private int numberOfGames;

    public RockPaperScissors(){
user = new User();
computer = new Computer();
userScore = 0;
computerScore = 0;
numberOfGames = 0;

    }
    public void startGame() {
        System.out.println("ROCK,PAPER,SCISSORS!!");
        Move userMove = user.getMove();
        Move computerMove = computer.getMove();
        System.out.println("\n Your move " + userMove +".");
        System.out.println("\n Computer move " + computerMove +".\n");

        int compareMoves = userMove.compareMoves(computerMove);
        switch (compareMoves){
            case 0:
                System.out.println("Draw game");
                break;
            case 1:
                System.out.println(userMove + "beats" + compareMoves + ".You won!!");
                userScore++;
                break;
            case -1:
                System.out.println(compareMoves + "beats" + userMove + ".Computer won!");
                computerScore++;
                break;
        }
        numberOfGames++;
        if(user.playAgain()){
            System.out.println();
            startGame();
        }
        else {
            printGameStarts();
        }

    }

    private void printGameStarts()  {
        int wins = userScore;
        int losses = computerScore;
        int ties = numberOfGames - userScore - computerScore;
        double percentageWon = (wins + ((double) ties) / 2) / numberOfGames;

File myFile = new File("/Users/masha/javaHillel2020/JavaHillel/HT15/src/main/res/result.txt");
    try {
       BufferedWriter writer = new BufferedWriter(new FileWriter(myFile));
writer.write("\nWins:");
writer.write(String.valueOf(wins));
writer.write("\nLosses:");
writer.write(String.valueOf(losses));
writer.write("\nDraw:");
writer.write(String.valueOf(ties));
        writer.write("\nNumber od games:");
writer.write(String.valueOf(numberOfGames));
        writer.write("\nPercent of wins:");
writer.write(String.valueOf(percentageWon));

        writer.close();
    } catch (IOException e) {
        e.printStackTrace();
    }


    }
    public static void main(String[] args) {
        RockPaperScissors game = new RockPaperScissors();
        game.startGame();
    }
}
