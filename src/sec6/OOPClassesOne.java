package sec6;

public class OOPClassesOne {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car honda = new Car();

        porsche.setModel("911");
        System.out.println(porsche.getModel());
    }
}
