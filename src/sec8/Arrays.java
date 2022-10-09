package sec8;
import java.util.Scanner;

public class Arrays {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntArray = new int[10];
        myIntArray[5] = 50;
        System.out.println(myIntArray[5] + "\n");

        int[] secondIntArray = {123,456,789,101112};
        for (int i = 0; i<secondIntArray.length; i++){
            System.out.println(i + ": " + (secondIntArray[i] + 1) + "\n");
        }

        int[] myIntegers = getIntegers(2); //gives myIntegers array the same values as values array from getIntegers()
        for(int i=0;i<myIntegers.length;i++){
            System.out.println("Element " + i + ", typed: " + myIntegers[i]);
        }
        System.out.println("Average is: " + getAverage(myIntegers)); //gives average of numbers entered
    }

    public static int[] getIntegers(int numberOfEntries){
        System.out.println("Enter: ");

        int[] values = new int[numberOfEntries];

        for(int i = 0; i<values.length; i++){
            values[i] = scanner.nextInt();
        }

        return values;
        //creates an array of numbers entered
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return (double)sum/ (double)array.length;
    }

}
