package sec8.AutoboxingUnboxingChallenge;

import java.util.ArrayList;

public class Bank {

    private static ArrayList<Branch> branches = new ArrayList<Branch>();

    public static void addBranch(String name){
        if(name != null && !(name.isEmpty())){
            System.out.println("name valid for branch creation");
            Branch branch = new Branch(name);
            branches.add(branch);

        }else{
            System.out.println("branch empty or null");
            System.out.println("can't create branch with no name");
            return;
        }

    }
    public static void addTransaction(String branchName, String customerName, Double transactionAmount){
        if(branchName != null && !branchName.isEmpty()){
            if(checkBranchExists(branchName)){
                if(customerName != null && !customerName.isEmpty()){
                    if(checkCustomerExists(customerName, branchName)){
                        if(transactionAmount != null && !(transactionAmount==0.0)){
                            getBranch(branchName).addTransaction(customerName, transactionAmount);
                            System.out.println("Added transaction of " + transactionAmount);
                        } else {
                            System.out.println("cannot add transaction of 0.0 or null");
                            return;
                        }
                    } else {
                        System.out.println("customer doesnt exist");
                        return;
                    }
                }else {
                    System.out.println("customer name empty or null");
                    return;
                }
            } else {
                System.out.println("Branch does not exist");
                return;
            }

        } else {
            System.out.println("branch name empty or null");
            return;
        }
    }
    public static void addCustomer(String branchName, String customerName){
        if(branchName != null && !branchName.isEmpty()){
            if(checkBranchExists(branchName)){
                if(customerName != null && !customerName.isEmpty()){
                    if(checkCustomerExists(customerName, branchName)){
                        System.out.println("customer exists");
                        return;
                    } else {
                        getBranch(branchName).addCustomer(customerName, 7.0);
                    }
                } else {
                    System.out.println("customer name empty or null");
                    return;
                }
            } else {
                System.out.println("Branch not found for customer addition");
                return;
            }
        } else {
            System.out.println("branch name not specified for new customer");
            return;
        }


    }
    private static Branch getBranch(String name){
        for(int i =0; i < branches.size(); i++){
            if(branches.get(i).getName() == name){
                return branches.get(i);
            }
        }
        return null;
    }
    public static void listAll(){
        for(int i = 0; i < branches.size(); i++){
            for(int j = 0; j < branches.get(i).getBranchCustomers().size();j++){
                System.out.println("\nMain - " + branches.get(i).getName() + ": " + branches.get(i).getBranchCustomers().get(j).getName() + " - " + branches.get(i).getBranchCustomers().get(j).getTransactions());
            }

        }
    }

    private static boolean checkBranchExists(String branch){
        for(int i = 0; i < branches.size(); i++){
            if(branches.get(i).getName() == branch){
                return true;
            }
        }
        return false;
    }

    private static boolean checkCustomerExists(String name, String branch){
        for(int i = 0; i < branches.size(); i++){
            if(branches.get(i).getName() == branch){
                for(int j = 0; j < branches.get(i).getBranchCustomers().size(); j++){
                    if(branches.get(i).getBranchCustomers().get(j).getName() == name){
                        return true;
                    } else {
                        System.out.println("customer name error");
                        return false;
                    }
                }
            } else {
                System.out.println("branch error");
                return false;
            }
        }
        return false;
    }

}
