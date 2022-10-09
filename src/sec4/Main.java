package sec4;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        double centimeters = calcFeetAndInchesToCentimeters(7,5);
        if(centimeters < 0.0){
            System.out.println("Invalid parameters");
        }

        calcFeetAndInchesToCentimeters(157);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if((feet < 0) || ((inches < 0) || (inches >12))){
            System.out.println("Invalid feet or inches parameters.");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;

        System.out.println(inches + " inches are " + feet + " feet and " + remainingInches + " inches remaining");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }


}