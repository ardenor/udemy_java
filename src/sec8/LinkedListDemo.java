package sec8;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit,"Melbourne");
        addInOrder(placesToVisit,"Brisbane");
        addInOrder(placesToVisit,"Perth");
        addInOrder(placesToVisit,"Canberra");
        addInOrder(placesToVisit,"Adelaide");
        addInOrder(placesToVisit,"Darwin");

        printList(placesToVisit);
        //placesToVisit.add(1,"Alice Springs");
        addInOrder(placesToVisit,"Alice Strings");
        printList(placesToVisit);

        System.out.println("Removing " + placesToVisit.get(4));
        placesToVisit.remove(4);
        printList(placesToVisit);

        visit(placesToVisit);
    }

    private static void printList(LinkedList<String> linkedList){
        Iterator<String> i = linkedList.iterator(); //for(int i=0; i<linkedList.size(); i++)

        while(i.hasNext()){
            System.out.println("Now visiting: " + i.next());
        }
        System.out.println("===============");
    }

    private static void visit(LinkedList<String> cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("No cities in the itinerary");
            return;
        } else {
            System.out.println("Now visiting " + listIterator.next());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0:
                    System.out.println("Vacation over");
                    quit = true;
                    break;
                case 1: //next city
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now visiting " + listIterator.next());
                    } else{
                        System.out.println("Reached the end of the list");
                        goingForward = false;
                    }
                    break;
                case 2: //previous city
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Returning to " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }
    private static void printMenu(){
        System.out.println("Available actions:\nPress ");
        System.out.println("0 - quit\n1 - next city\n2 previous city\n3 - print menu");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()){
            int comparison = stringListIterator.next().compareTo(newCity);//compares each next value in provided LinkedList to newCity
            //compareTo() goes through each letter of the string
            if(comparison == 0){
                //equal match, do not add again
                System.out.println(newCity + " is already included");
                return false;
            } else if(comparison > 0){
                //newCity should appear before this one
                //Brisbane -> Adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0){
                //move on next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }
}
