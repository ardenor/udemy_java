package sec8.AutoboxingUnboxingChallenge;

import java.util.ArrayList;

public class Customer {
    ArrayList<Double> transactions = new ArrayList<Double>();
    private String name;

    public Customer(ArrayList<Double> transactions, String name) {
        this.transactions = transactions;
        this.name = name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public String getName() {
        return name;
    }

    public void addTransaction(Double transactionAmount){
        if(transactionAmount.doubleValue() != 0){
            this.transactions.add(transactionAmount);
        } else {
            System.out.println("0 is not a valid transaction amount");
            return;
        }
    }
}