package sec7;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220b", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 2440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
//        thePC.getMonitor().drawPixelAt(1500,1200, "red");
//        thePC.getMotherboard().loadProgram("Windows 1.0");
//        thePC.getTheCase().pressPowerButton();
//        thePC.powerUp();

//        Wall wall1 = new Wall("West");
//        Wall wall2 = new Wall("East");
//        Wall wall3 = new Wall("South");
//        Wall wall4 = new Wall("North");
//        Ceiling ceiling = new Ceiling(12, 55);
//        Bed bed = new Bed("Modern", 4, 3, 2, 1);
//        Lamp lamp = new Lamp("Classic", false, 75);
//
//        Bedroom bedroom = new Bedroom("Colin's", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
//        bedroom.makeBed();
//        bedroom.getLamp().turnOn();

//        Player player = new Player();
//        player.fullName = "Colin";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//        damage = 11;
////        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

//        EnhancedPlayer player = new EnhancedPlayer("Colin", 200, "Sword");
//        System.out.println("Initial health is " + player.getHitpoints());

        Printer printer = new Printer(30, 0, false);
        System.out.println("Toner level at: "+printer.getTonerLevel());
        printer.addToner(70);
        System.out.println("Toner level at: "+printer.getTonerLevel());
        printer.addToner(10);
        System.out.println("Toner level at: "+printer.getTonerLevel());
        System.out.println("Pages print: " + printer.getPagesPrinted());
        printer.print(3);
        System.out.println("Pages print: " + printer.getPagesPrinted());


    }
}
