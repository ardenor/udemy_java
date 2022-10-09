package sec7.OOPMasterChallenge;

public class DeluxeBurger extends Hamburger{
    private double baseprice;

    public DeluxeBurger(String breadRollType, String meat, double baseprice) {
        super(breadRollType, meat, true, true, true, true, true, true, baseprice);

    }
}


