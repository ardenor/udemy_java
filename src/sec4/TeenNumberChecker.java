package sec4;

public class TeenNumberChecker {

    public static boolean hasTeen(int num1, int num2, int num3){
        return isTeen(num1) || isTeen(num2) || isTeen(num3);
    }

    public static boolean isTeen(int num){
        if(num >= 13 && num <=19){
            return true;
        } else {
            return false;
        }
    }
}
