public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        int checkOne = (int)(num1 * 1000);
        int checkTwo = (int)(num2 * 1000);

        if(checkOne - checkTwo == 0){
            return true;
        } else {
            return false;
        }
    }
}
