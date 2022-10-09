package sec8.AutoboxingUnboxingChallenge;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Branch {
    ArrayList<Customer> customers = new ArrayList<Customer>();
    private String name;

    public Branch(String name) {
        if(name != null || !(name.isEmpty())){
            this.name = name;
        } else {
            System.out.println("name field invalid");
            return;
        }
        this.customers = new ArrayList<Customer>();
    }

    public void addCustomer(String name, Double initTransactionAmount){
        if(name != null && !name.isEmpty()){
            if(!(initTransactionAmount == 0.0)){
                ArrayList<Double> defaultTransactions = new ArrayList<>();
                defaultTransactions.add(initTransactionAmount);
                Customer newCustomer = new Customer(defaultTransactions, name);
                this.customers.add(newCustomer);
                System.out.println("Branch.addCustomer() Added: " + newCustomer.getName() + ": " + newCustomer.getTransactions());
            } else {
                System.out.println("initTransactionAmount not valid");
            }
        } else {
            System.out.println("customer name not valid");
            return;
        }
    }
    public void addTransaction(String customerName, Double amount){
        if(customerName != null && !customerName.isEmpty()){
            getCustomer(customerName).addTransaction(amount);
        } else {
            System.out.println("Branch() customerName null or empty");
            return;
        }
    }
    private Customer getCustomer(String name){
        for(int i=0; i<customers.size();i++){
            if (customers.get(i).getName() == name) {
                return customers.get(i);
            }
        }
        return null;
    }
    public ArrayList<Customer> getBranchCustomers(){
        return customers;
    }

    public void setBranchName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
