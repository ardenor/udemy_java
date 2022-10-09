package sec8;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();


    public ArrayList<String> getGroceryList(){
        return groceryList;
    }

    public void addGroceryItem(String item){
        groceryList.add(item);
    }
    public void printGroceryList(){
        for(int i = 0; i < groceryList.size(); i++){
            System.out.println(groceryList.get(i));
        }
    }
    public void modifyGroceryItem(String oldItem, String newItem){
        int position = findItem(oldItem);
        if(position >= 0){
            modifyGroceryItem(position, newItem);
        }
    }
    private void modifyGroceryItem(int position, String newItem){
        groceryList.set(position, newItem);
    }
    public void removeGroceryItem(String item){
        int position = findItem(item);
        if(position >= 0){
            removeGroceryItem(position);
        }
    }
    private void removeGroceryItem(int position){
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }
    private int findItem(String searchItem){
        return groceryList.indexOf(searchItem);
    }
    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if(position >= 0){
            return true;
        }
        return false;
    }
}
