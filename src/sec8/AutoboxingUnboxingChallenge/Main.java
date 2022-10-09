package sec8.AutoboxingUnboxingChallenge;


import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        addBranch("branch1");
        addCustomer("branch1", "sadf");
        addTransaction("branch1", "sadf", 2.0);
        addTransaction("branch1", "sadf", 2.0);
        addTransaction("branch1", "sadf", 2.0);

        Bank.listAll();
    }

    public static void addBranch(String name){
        try{
            Bank.addBranch(name);
        } catch (Exception e){
            System.out.println(e);
        }
    }
    public static void addCustomer(String branchName, String customerName){
        try{
            Bank.addCustomer(branchName, customerName);
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public static void addTransaction(String branchName, String customerName, Double transactionAmount){
        try{
            Bank.addTransaction(branchName, customerName, transactionAmount);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
