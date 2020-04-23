import java.util.Scanner;

public class User {
    private Scanner inputScanner;
    public User(){
        inputScanner = new Scanner(System.in);

    }
    public Move getMove(){
        System.out.println("Rock, scissors or paper?");
        String userInput = inputScanner.nextLine();
        userInput = userInput.toUpperCase();
        char firstLetter = userInput.charAt(0);
        if(firstLetter == 'R' || firstLetter =='S' || firstLetter == 'P'){
            switch (firstLetter){
                case 'R':
                    return Move.ROCK;
                case 'S':
                    return Move.SCISSORS;
                case 'P':
                    return Move.PAPER;
            }
        }
        return getMove();
    }

    public boolean playAgain(){
        System.out.print("Do you want to play again?");
        String userInput = inputScanner.nextLine();
        userInput = userInput.toUpperCase();
        return userInput.charAt(0)=='Y';
    }
}
