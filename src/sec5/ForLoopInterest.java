package sec5;

public class ForLoopInterest {
    public static void main(String[] args) {
        //System.out.println(calculateInterest(10000.0,2.0));

        double[] interestArray = {1.0, 2.0, 3.0};

        for (int i = 0; i < interestArray.length; i++){
            System.out.println("interest cost: " + calculateInterest(10000.0, interestArray[i]));
        }

        for (int i = 2; i > -1; i--){
            System.out.println("interest cost: " + calculateInterest(10000.0, interestArray[i]));
        }
    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }
}
