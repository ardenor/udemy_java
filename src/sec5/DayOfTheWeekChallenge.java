package sec5;

public class DayOfTheWeekChallenge {
    public static void main(String[] args) {
        printDayOfTheWeek(4);
    }

    public static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("SUN");
                break;
            case 1:
                System.out.println("MON");
                break;
            case 2:
                System.out.println("TUE");
                break;
            case 3:
                System.out.println("WED");
                break;
            case 4:
                System.out.println("THU");
                break;
            case 5:
                System.out.println("FRI");
                break;
            case 6:
                System.out.println("SAT");
                break;
            default:
                System.out.println("INVALID DAY");
                break;
        }
    }
}
