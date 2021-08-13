import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

       //Creating variables
        String Answer;
        int uAnswer = 5;
        String Win = "You win!";
        String Lose = "You lose!";
        String uWrittenA = null;
        String dWrittenA = null;
        int skip = 0;

        //Greeting statement, and prompt user to enter their choice.
        System.out.println("Choose rock, paper, or scissors. 'r' for rock, 'p' for paper, and 's' for scissors.");
        Answer = scan.next();

        //Assigning rock paper and scissors number values in order to compare with randomly generated values.
        //WrittenAnswer for end to display the user input choice.
        if (Answer.equals("s")){
            uAnswer = 0;
            uWrittenA = "Scissors";
        }
        else if (Answer.equals("p")){
            uAnswer = 1;
            uWrittenA = "Paper";
        }
        else if (Answer.equals("r")){
            uAnswer = 2;
            uWrittenA = "Rock";
        }

        //If the user input isn't r, p, or s, an invalid statement will be shown.
        else {
            System.out.println("Invalid selection, please play again.");
            skip = 1; //Skip variable to skip over computer/user answer print statement at the end.
        }


        //Random number of dealer - (0, 1, 2) = (s, p, r).
        int dAnswer = (int)(Math.random()*3);

        //Variable for the difference calculation
        int Difference = (uAnswer - dAnswer);

        //Comparing dealer answers with user answers to determine a winner.
        if (uAnswer == dAnswer){
            System.out.println("It's a draw!");
        }
        else if (Difference == 2){
            System.out.println(Win);
        }
        else if (Difference == -1){
            System.out.println(Win);
        }
        else if (Difference == 1){
            System.out.println(Lose);
        }
        else if (Difference == -2){
            System.out.println(Lose);
        }

        //Assigning dealer answers with written answers to display at end.
        if (dAnswer == 0){
            dWrittenA = "Scissors";
        }
        else if (dAnswer == 1){
            dWrittenA = "Paper";
        }
        else if (dAnswer == 2){
            dWrittenA = "Rock";
        }


        //Print statement to show the user and computer choice.
        if (skip == 0){ //If no user error, the skip variable will remain at 0.
            System.out.println("Computer Choice: " + dWrittenA + "\tPlayer choice: " + uWrittenA);
        }

    }
}

