package sec5;

public class Switch {
    public static void main(String[] args) {
        int switchValue = 2;

        switch(switchValue){
            case 1:
                System.out.println("was 1");
                break;
            case 2:
                System.out.println("was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("was " + switchValue);
                break;
            default:
                System.out.println("was none");
                break;
        }

        char swChar = 'A';
        switch(swChar){
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C':
                System.out.println("C");
                break;
            default:
                System.out.println("NONE");
                break;
        }
    }
}
