package sec4;
import java.util.Scanner;

public class ReadInputScore {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int myVariable = 50;
        myVariable++;
        int score = 0;

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter: ");
        score = reader.nextInt();
        reader.close();

        if(calculateScore(score) > 5000){
            System.out.println("You win!");
        } else {
            System.out.println("Try again.");
        }
    }

    public static int calculateScore(int currentScore){
        currentScore += 1000;
        return currentScore;
    }


}