package sec5;

public class ParseValuesFromString {
    public static void main(String[] args) {
        String numberAsString = "2018.125";
        System.out.println(numberAsString);

        double number = Double.parseDouble(numberAsString);
        System.out.println(number);

        numberAsString += 1;
        number += 1;

        System.out.println(numberAsString);
        System.out.println(number);
    }
}
