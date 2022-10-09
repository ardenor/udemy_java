package sec7.OOPMasterChallenge;

public class Hamburger {
    private String breadRollType;
    private String meat;

    private boolean lettuce;
    private double lettucePrice = Prices.getLettucePrice();
    private boolean tomato;
    private double tomatoPrice = Prices.getTomatoPrice();
    private boolean pickles;
    private double picklesPrice = Prices.getPicklesPrice();
    private boolean ketchup;
    private double ketchupPrice = Prices.getKetchupPrice();
    private boolean chips;
    private double chipsPrice = Prices.getChipsPrice();
    private boolean drink;
    private double drinkPrice = Prices.getDrinkPrice();

    private double price;

    public Hamburger(String breadRollType, String meat, boolean lettuce, boolean tomato, boolean pickles, boolean ketchup, boolean chips, boolean drink, double price) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.pickles = pickles;
        this.ketchup = ketchup;
        this.chips = chips;
        this.drink = drink;
        this.price = price;
    }

    public double itemizeHamburger(){
        double hamburgerPrice = this.price;

        if(lettuce){
            hamburgerPrice += this.lettucePrice;
        }
        if(tomato){
            hamburgerPrice += this.lettucePrice;
        }
        if(pickles){
            hamburgerPrice += this.picklesPrice;
        }
        if(ketchup){
            hamburgerPrice += this.ketchupPrice;
        }
        if(chips){
            hamburgerPrice += this.chipsPrice;
        }
        if(drink){
            hamburgerPrice += this.drinkPrice;
        }
        return hamburgerPrice;
    }
}


