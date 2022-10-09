package sec5;

public class WhileDoWhile {
    public static void main(String[] args) {
//        int count = 1;
//        while(count != 6){
//            System.out.println("Count: " + count);
//            count++;
//        }
//
//        count = 1;
//        do{
//            System.out.println(count);
//            count++;
//
//            if(count > 100){
//                break;
//            }
//        } while(count != 6);

        System.out.println(isEvenNumber(3));
    }

    public static boolean isEvenNumber(int x){
        while(!(x % 2 == 0)){
            return false;
        }
        return true;
    }
}
