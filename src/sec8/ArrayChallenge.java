package sec8;
import java.util.Scanner;

public class ArrayChallenge {
    public static void main(String[] args) {
        sortIntegers(new int[] {5,3,7});
    }

    public static int[] sortIntegers(int[] array){
        int[] sortedArray = new int[array.length];
        for(int i=0;i< array.length;i++){
            sortedArray[i] = array[i];
        }

        boolean flag = true;
        int temp;

        while(flag){
            flag = false;

            for(int i=0;i<sortedArray.length-1;i++){
                if(sortedArray[i] < sortedArray[i+1]){ //if 3 is less than next element [7]
                    temp = sortedArray[i]; //temp = 3
                    sortedArray[i] = sortedArray[i+1]; //current element = next element value [7]
                    sortedArray[i+1] = temp; //next element = 3
                    flag = true;
                }
            }
        }
        for(int i=0; i<sortedArray.length;i++){
            System.out.println(sortedArray[i]);
        }
        return sortedArray;
    }
}
