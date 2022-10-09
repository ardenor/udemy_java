package sec8;
import java.util.Scanner;
import java.util.Arrays;

public class MinimumElementChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] returnedArray = readElements(readInteger());
        System.out.println(Arrays.toString(returnedArray));
        int returnedMin = findMin(returnedArray);
        System.out.println("Min is " + returnedMin);
    }

    public static int readInteger(){
        System.out.println("Enter array size: ");
        return scanner.nextInt();
    }

    public static int[] readElements(int size){
        int[] array = new int[size];
        for(int i=0; i<array.length;i++){
            System.out.println("Enter a value: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static int findMin(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i<array.length; i++){
            int value = array[i];
            if(value < min){
                min = value;
            }
        }

        return min;
    }
}
