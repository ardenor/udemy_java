package sec9.InterfacesChallenge;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player colin = new Player("Colin", 10, 15);
        System.out.println("String: " + colin.toString());
        saveObject(colin);

        colin.setHitPoints(8);
        System.out.println("Object: "+colin);

        colin.setWeapon("Stormbringer");
        saveObject(colin);
//        loadObject(colin);
        System.out.println("Working values: " + colin);

        ISaveable werewolf = new Monster("Werewolf", 20, 40);
        System.out.println(werewolf);
        saveObject(werewolf);
    }

    public static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("\nChoose\n1 to enter a string\n0 to quit");
        while(!quit){
            System.out.println("Enter option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave){
        for(int i = 0; i < objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
        System.out.println("\n");
    }

    public static void loadObject(ISaveable objectToLoad){
        System.out.println("Loading " + objectToLoad);
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
