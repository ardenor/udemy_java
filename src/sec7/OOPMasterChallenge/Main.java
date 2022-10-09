package sec7.OOPMasterChallenge;

public class Main {
    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Wheat", "Beef", false, false, true, false, true, true, 1.0);
        double x = hamburger.itemizeHamburger();
        System.out.println(x);
        //4 because chips and drink and pickles

        HealthyBurger healthyBurger = new HealthyBurger("Turkey", 5.00, false, false);
        double y = healthyBurger.itemizeHamburger();
        System.out.println(y);
        //7 because it comes with lettuce and tomato, cannot be edited

        DeluxeBurger deluxeBurger = new DeluxeBurger("White", "Bacon", 9.00);
        double price = deluxeBurger.itemizeHamburger();
        System.out.println(price);
        //15 because it comes with everything

    }
}
