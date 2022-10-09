package sec5;

public class SumOddRange {
    public static void main(String[] args) {
        System.out.println(sumOdd(1,100));
    }

    public static boolean isOdd(int number){
        return (number % 2) > 0;
    }

    public static int sumOdd(int start, int end){
        int sum = 0;

        if(start < 1 || end < start){
            return -1;
        }

        for (int i = start; i <= end; i++){
            if(isOdd(i)){
                sum += i;
                System.out.println(i);
            }
        }

        return sum;
    }
}
