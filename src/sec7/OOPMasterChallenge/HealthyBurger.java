package sec7.OOPMasterChallenge;

public class HealthyBurger extends Hamburger{
    private double price;

    public HealthyBurger(String meat, double baseprice, boolean drink, boolean chips) {
        super("brown rye", meat, true, true, false, false, chips, drink, baseprice);

    }


}
